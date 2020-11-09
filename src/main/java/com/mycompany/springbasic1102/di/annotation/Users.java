package com.mycompany.springbasic1102.di.annotation;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Users {
    private List<String> names;
    public Users(){
        System.out.println("建立users");
        names = new ArrayList<>();
        names.add("Mary");
        names.add("John");
        names.add("John2");
        names.add("John3");       
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Users{" + "names=" + names + '}';
    }
    
    
    
}
