package com.goobylicious;


public class Program {

    public static void main(String[] args) {
        ThingDoer myThingDoer = new ThingDoer("Thing Doer");
        DoerOfThings myDoerOfThings = new DoerOfThings("Doer of Things");

        myThingDoer.doThings();
        myDoerOfThings.doThings();

    }
}
