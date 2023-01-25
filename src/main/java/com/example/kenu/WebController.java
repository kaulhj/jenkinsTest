package com.example.kenu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @GetMapping("/")
    @ResponseBody
    public String main() {
        return "<a href=\"https://infoq.com2\">infoq.com5</a>";
    }
}
