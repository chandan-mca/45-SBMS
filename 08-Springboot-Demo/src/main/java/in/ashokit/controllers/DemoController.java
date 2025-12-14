package in.ashokit.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String displayMessage() {
        return "Welcome to Spring Boot Application!";
    }
}
