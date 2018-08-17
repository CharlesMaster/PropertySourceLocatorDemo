package com.remoteconfig.example2.demo.config;

import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;

import java.util.HashMap;
import java.util.Map;

public class MyPropertySourceLocator implements PropertySourceLocator {
    @Override
    public PropertySource<?> locate(Environment environment) {
        //简单起见，这里直接创建一个map,你可以在这里写从哪里获取配置信息。
        Map<String,String> properties = new HashMap<>();
        properties.put("author","Tom");

        MyPropertySource myPropertySource = new MyPropertySource("myPropertySource",properties);
        return myPropertySource;
    }
}