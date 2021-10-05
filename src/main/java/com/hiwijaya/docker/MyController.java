package com.hiwijaya.docker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author Happy Indra Wijaya
 */
@Controller
public class MyController {

    @Value("${app.name}")
    private String name;

    @Value("${app.message}")
    private String message;

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "<h1>[JAVA-DOCKER]</h1>" + "<b>Hello, " + name + "</b><p>" + message + "</p>";
    }

}