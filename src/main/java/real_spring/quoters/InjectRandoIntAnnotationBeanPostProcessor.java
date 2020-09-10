package real_spring.quoters;

import my_spring.InjectRandomIntAnnotationObjectConfigurer;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InjectRandoIntAnnotationBeanPostProcessor implements BeanPostProcessor {

    private InjectRandomIntAnnotationObjectConfigurer configurer = new InjectRandomIntAnnotationObjectConfigurer();

    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        configurer.configure(bean, null);
        return bean;
    }

}