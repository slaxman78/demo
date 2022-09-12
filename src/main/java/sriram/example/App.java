package sriram.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world with docker with fifth change!
 *
 */
@SpringBootApplication (scanBasePackages = { "sriram.practice.samples.sriram.spring_boot"} )
public class App 
{
    public static void main( String[] args )
    {
        System.out.println ("Welcome to Sriram SpringBoot example") ;
        SpringApplication.run(App.class, args) ;
    }
}
