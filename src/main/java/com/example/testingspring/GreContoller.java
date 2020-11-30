package com.example.testingspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreContoller {

    @GetMapping("/index")
    String hel(Map<String, Object> model){

        return "index";
    }

    @GetMapping("/cat")
    String cat(String name, Map<String, Object> model){
        if(name == null)
            name = "HUI";
        model.put("name", name);
        return "cat";
    }
}
