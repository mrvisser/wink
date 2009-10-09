/*******************************************************************************
 *     Licensed to the Apache Software Foundation (ASF) under one
 *     or more contributor license agreements.  See the NOTICE file
 *     distributed with this work for additional information
 *     regarding copyright ownership.  The ASF licenses this file
 *     to you under the Apache License, Version 2.0 (the
 *     "License"); you may not use this file except in compliance
 *     with the License.  You may obtain a copy of the License at
 *     
 *      http://www.apache.org/licenses/LICENSE-2.0
 *     
 *     Unless required by applicable law or agreed to in writing,
 *     software distributed under the License is distributed on an
 *     "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *     KIND, either express or implied.  See the License for the
 *     specific language governing permissions and limitations
 *     under the License.
 *******************************************************************************/
package org.apache.wink.common.internal.utils;

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Concurrent implementation of the SimpleMap interface. This implementation is
 * intend to be used by soft caches, therefore the keys are kept in WeakHashMap,
 * while the value is kept using the SoftReference.
 * <p>
 * Pay attention that put value always returns the current value and not the
 * original value. It was done to allow the following code pattern:
 * 
 * <pre>
 * SoftConcurrentMap&lt;K, V&gt; cache = new SoftConcurrentMap&lt;K, V&gt;();
 * V cached = cache.get(key);
 * return cached = !null ? cached : cache.put(createValue());
 * </pre>
 * 
 * @param <K>
 * @param <V>
 */
public class SoftConcurrentMap<K, V> implements SimpleMap<K, V> {

    /*
     * Note that this volatile variable is important for publication purposes.
     */
    private volatile Map<K, SoftReference<V>> map;

    /**
     * Provides the map implementation.
     * 
     * @param map
     */
    public SoftConcurrentMap() {
        this.map = new WeakHashMap<K, SoftReference<V>>();
    }

    public V get(K key) {
        SoftReference<V> softReference = map.get(key);
        return softReference != null ? softReference.get() : null;
    }

    /**
     * Associates the specified value with the specified key in this map. If the
     * map previously contained a mapping for this key, the old value is
     * replaced by the specified value.
     * <p>
     * Unlike the regular Map.put method, this method returns the current value
     * and not the previous value.
     * <p>
     * Note that a copy on write pattern is used where the existing cache is
     * treated as a read only cache and then it is copied to a new cache.
     * 
     * @return val - the current value.
     */
    public synchronized V put(K key, V val) {
        WeakHashMap<K, SoftReference<V>> copyOfMap = new WeakHashMap<K, SoftReference<V>>(map);
        copyOfMap.put(key, new SoftReference<V>(val));
        map = copyOfMap;
        return val;
    }

    public synchronized void clear() {
        /*
         * Note that a copy on write pattern is used here so that the cache is
         * cleared by assigning to a new empty cache.
         */
        map = new WeakHashMap<K, SoftReference<V>>();
    }

}
