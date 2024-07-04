package net.dav.annotations.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("diesel-engine")
public class DiselEngine implements Engine{

    @Override
    public String start(){
        return "Starting DieselEngine...";
    }
    
}
