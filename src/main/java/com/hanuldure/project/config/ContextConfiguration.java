package com.hanuldure.project.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.hanuldure.project.mapper")
/* MapperScan에서 지정한 하위 구조 I를 전부 bean으로 인식하게 만듬*/
@Configuration
@ComponentScan(basePackages = {"com.hanuldure.project"})
public class ContextConfiguration {
}
