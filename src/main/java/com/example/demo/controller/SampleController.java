package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SampleController {
    @GetMapping("/sample.form")
    public void sample() {
        System.out.println("sample");
    }
}