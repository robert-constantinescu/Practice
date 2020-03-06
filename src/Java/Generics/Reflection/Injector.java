package Java.Generics.Reflection;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class Injector {

    private Map<Class<?>, Object> objectGraph = new HashMap<>();

    public Injector with(Object value) {
        objectGraph.put(value.getClass(), value);
        return this;
    }

    public <T> T newInstance(final Class<T> type) {
        return (T) objectGraph.computeIfAbsent(type, this::instantiate);
    }

    private Object instantiate(Class<?> type) {
        try {
            Constructor<?>[] constructors = type.getConstructors();
            if(constructors.length != 1) {
                throw new IllegalArgumentException(type + " must only have 1 constructor");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        return this;
    }
}
