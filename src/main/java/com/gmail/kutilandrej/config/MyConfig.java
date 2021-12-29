package com.gmail.kutilandrej.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.gmail.kutilandrej")
@EnableAspectJAutoProxy
public class MyConfig {

}
