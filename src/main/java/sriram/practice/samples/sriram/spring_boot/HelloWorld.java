package sriram.practice.samples.sriram.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld
{
    String message ; 
    public HelloWorld()
    {
        message = new String ("Greetings from Sriram's Spring Boot Example 11-Sep version 6") ;
    }

    @GetMapping("/")
    public String index()
    {
        return this.message ;
    }

}