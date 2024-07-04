package net.dav.annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import net.dav.annotations.service.Engine;

@RestController
public class EngineController {

    @Autowired
    //@Qualifier("diesel-engine")
    private Engine engine;

    @GetMapping("/engine") //è un API, chiamata di tipo get che va a chiamare il metodo start di engine
    public String getEngine(){
        return engine.start();
    }
    
}
