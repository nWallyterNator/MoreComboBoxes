package com.example.morecombo;

public class Part {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Part(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString(){
        return "[" + id + "]" + name;
    }
}
