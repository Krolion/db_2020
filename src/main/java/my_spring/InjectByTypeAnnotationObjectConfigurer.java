package my_spring;

import heroes.RandomUtil;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeAnnotationObjectConfigurer implements ObjectConfigurer {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> implClass = t.getClass();
        Field[] fields = implClass.getDeclaredFields();
        ObjectFactory instance = ObjectFactory.getInstance();
        for (Field field : fields) {
            InjectByType annotation = field.getAnnotation(InjectByType.class);
            if (annotation != null) {
                Object newObject = instance.createObject(field.getDeclaringClass());
                field.setAccessible(true);
                field.set(t, newObject);
            }

        }
    }
}
