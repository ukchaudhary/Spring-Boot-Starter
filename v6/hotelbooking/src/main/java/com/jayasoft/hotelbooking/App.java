package com.jayasoft.hotelbooking;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);    	
    }
}
