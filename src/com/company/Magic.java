package com.company;

import java.io.Serializable;

public class Magic implements Serializable {

    String name;

    public Magic(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magic{" +
                "name='" + name + '\'' +
                '}';
    }
}
