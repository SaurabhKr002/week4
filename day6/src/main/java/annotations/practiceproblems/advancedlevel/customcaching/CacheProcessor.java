package annotations.practiceproblems.advancedlevel.customcaching;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

// Dynamic Proxy to handle @CacheResult logic
public class CacheProcessor {
    @SuppressWarnings("unchecked")
    public static <T> T createProxy(T target) {
        Class<?> clazz = target.getClass();

        return (T) Proxy.newProxyInstance(
                clazz.getClassLoader(),
                clazz.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.isAnnotationPresent(CacheResult.class)) {
                            String key = method.getName() + Arrays.toString(args);

                            if (CacheManager.contains(key)) {
                                return CacheManager.get(key); // Return cached result
                            }

                            Object result = method.invoke(target, args);
                            CacheManager.put(key, result); // Store result in cache
                            return result;
                        }
                        return method.invoke(target, args);
                    }
                }
        );
    }
}
