package com.arkitek.nova.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arkitek.nova.Greeting;

@Controller
@RequestMapping("/kazi")
public class KaziController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/frans", method=RequestMethod.GET)
    public @ResponseBody Greeting sayHello1(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format("Frans toch", name));
    }
    
    @RequestMapping(value="/is", method=RequestMethod.GET)
    public @ResponseBody Greeting sayHello2(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
    @RequestMapping(value="/pro", method=RequestMethod.GET)
    public @ResponseBody Greeting sayHello3(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format("Jaaa", name));
    }
    
}
