package sriram.practice.samples.sriram.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld
{

    public HelloWorld()
    {
        
    }

    @GetMapping("/")
    public String index()
    {
        return "Greetings from Sriram's Spring Boot Example #23!";
    }

}