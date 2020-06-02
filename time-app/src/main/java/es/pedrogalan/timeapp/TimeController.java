package es.pedrogalan.timeapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    @RequestMapping("/")
    public String time() {
        return "this will be the current time";
    }
}
