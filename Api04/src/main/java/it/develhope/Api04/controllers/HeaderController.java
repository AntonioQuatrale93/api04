package it.develhope.Api04.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/headers")
public class HeaderController {
    @GetMapping
    public String getHostNameAndPort(HttpServletRequest request) {
        return request.getHeader("Host");
    }

}
