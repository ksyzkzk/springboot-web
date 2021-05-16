package org.ksyzkzk.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
@ComponentScan(basePackages = {"org.ksyzkzk.book.springboot.domain.posts"})
@ComponentScan(basePackages = {"org.ksyzkzk.book.springboot.service.posts"})
@ComponentScan(basePackages = {"org.ksyzkzk.book.springboot.web"})
public class Application {
    public static void main(String[] args){SpringApplication.run(Application.class,args);}
}
