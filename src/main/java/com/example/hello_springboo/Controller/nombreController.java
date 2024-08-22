package com.example.hello_springboo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nombreController {

    @GetMapping("/nombre")
    public String getNombre() {
        return "Jhonatan alias: Jothcv";
    }
}
