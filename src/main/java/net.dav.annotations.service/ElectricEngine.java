package net.dav.annotations.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Primary;


@Service
@Primary
@Qualifier("electric-engine")
public class ElectricEngine implements Engine {
    
    @Override
    public String start(){
        return "Starting ElectricEngine...";
    }
}
    

