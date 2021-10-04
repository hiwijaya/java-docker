package com.hiwijaya.docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Happy Indra Wijaya
 */
@Controller
public class MyController {

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "<h1>[JAVA-DOCKER]<h1/>";
    }

}
