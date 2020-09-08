package my_spring;


import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
public class ApplicationContext {
    private final Config config;
    private ObjectFactory factory;
    private Map<Class<?>, Object> cache = new HashMap<>();


    public ApplicationContext(Config config) {
        this.config = config;
    }
}
