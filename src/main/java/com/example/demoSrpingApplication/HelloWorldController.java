package com.example.demoSrpingApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * @author : Prasad Dukale, created on 30-Jan-2020
 **/
@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/helloworld/{name}")
    public String helloWorldWithName(@PathVariable String name){
        return "Hello World : " + name;
    }

    @GetMapping("/helloworld1")
    public String helloWorldWithNameParam(@PathParam("name") String name){
        return "Hello World : " + name;
    }

}
