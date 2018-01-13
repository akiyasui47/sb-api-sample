package net.akiyasui47.sample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * EntryPoint
 *
 * @author akiyasui47
 */
@Controller
@EnableAutoConfiguration
public class EntryPoint {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    /**
     * main
     *
     * Spring Boot Application Entry Point
     *
     * @param args arguments.
     */
    public static void main (String[] args) {
        SpringApplication.run(EntryPoint.class, args);
    }
}
