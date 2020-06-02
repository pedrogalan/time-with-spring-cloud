package es.pedrogalan.time.app.controller;

import es.pedrogalan.time.app.TimeAppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TimeController {

    @Autowired
    private TimeAppConfiguration configuration;

    @RequestMapping("/")
    public String time() {
        System.out.println("Time format: " + configuration.getFormat());
        return LocalDateTime.now().toString();
    }
}
