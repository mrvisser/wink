/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.wink.itest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.apache.wink.itest.abc.ClassC;
import org.apache.wink.itest.carstorage.CarFerry;
import org.apache.wink.itest.carstorage.Carport;
import org.apache.wink.itest.carstorage.ParkingGarage;
import org.apache.wink.itest.carstorage.ParkingLot;
import org.apache.wink.itest.fruits.Fruit;

public class InheritanceApplication extends Application {

    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(CarFerry.class);
        classes.add(Carport.class);
        classes.add(ParkingGarage.class);
        classes.add(ParkingLot.class);
        classes.add(ClassC.class);
        classes.add(Fruit.class);
        return classes;
    }

}
