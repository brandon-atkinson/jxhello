package com.example.jxhello;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/{name}")
    public Map<String, Object> hello(@PathVariable("name") String name) {
        Map<String, Object> response = new ModelMap();
        response.put("greeting", "hello " + name);
        return response;
    }
}
