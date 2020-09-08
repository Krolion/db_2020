package my_spring;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class TimingDynamicInvocationHandler implements InvocationHandler {


    private final Map<String, Method> methods = new HashMap<>();

    private Object target;

    public TimingDynamicInvocationHandler(Object target) {
        this.target = target;

        for(Method method: target.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(BenchMark.class)) {
                this.methods.put(method.getName(), method);
            }
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        long start = System.nanoTime();
        Object result = methods.get(method.getName()).invoke(target, args);
        long elapsed = System.nanoTime() - start;
        System.out.println("Executing {} finished in {} ns" + method.getName() +
                elapsed);

        return result;
    }
}