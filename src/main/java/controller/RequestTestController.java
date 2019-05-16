package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/requestTest")
public class RequestTestController {

    @GetMapping()
    public String TestString(){
        return "sucess";
    }
}
