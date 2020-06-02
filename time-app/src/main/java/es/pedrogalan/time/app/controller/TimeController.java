package es.pedrogalan.time.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TimeController {

    @RequestMapping("/")
    public String time() {
        return LocalDateTime.now().toString();
    }
}
