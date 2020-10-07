package com.springcore.alternateofxml10;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//here configuration means spring container inject dependency through this class instead of xml file 
@Configuration

//here we have to give package name for component scanning using component scan annotation
@ComponentScan(basePackages = "com.springcore.alternateofxml10")

public class JavaConfig {

}
