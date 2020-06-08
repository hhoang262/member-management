package com.hoanghh.mmng.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/resources")
public class ResourceController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String landing(Model model){
        return "member";
    }

}
