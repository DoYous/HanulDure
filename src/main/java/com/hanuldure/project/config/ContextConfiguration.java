package com.hanuldure.project.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.hanuldure.project")
@Configuration
@ComponentScan(basePackages = {"com.hanuldure.project"})
public class ContextConfiguration {
}
