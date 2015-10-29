package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by rathm on 29/10/2015.
 */
//@Component
public class SimpleBean {
    //@Value("${my.simple.value}")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
