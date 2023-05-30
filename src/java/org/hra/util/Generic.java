/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hra.util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author quichua
 */
public class Generic {

    private static final Generic instance = new Generic();

    @SuppressWarnings("rawtypes")
    private final Map<Class, Object> mapHolder = new HashMap<>();

    private Generic() {
    }

    @SuppressWarnings("unchecked")
    public static <T> T getInstance(Class<T> classOf) throws InstantiationException, IllegalAccessException {

        synchronized (instance) {

            if (!instance.mapHolder.containsKey(classOf)) {

                T obj = classOf.newInstance();

                instance.mapHolder.put(classOf, obj);
            }

            return (T) instance.mapHolder.get(classOf);

        }

    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
