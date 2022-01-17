package com.goobylicious;

public class ThingDoer {
    public String name;
    public ThingDoer(String name){
        this.name = name;
    }
    public static void main(String[] args){
        System.out.println("Fuck me i'm dun doin things! look at me dun go!");
    }
    public void doThings() {
        for (int i = 1; i < 10; i++) {
            System.out.println("look at me gooby, I'm the thing doer: " + name);
            System.out.println("i'm dun be doin things here! I'm on my " + i + " thing i dun be doin!");
        }

    }
}