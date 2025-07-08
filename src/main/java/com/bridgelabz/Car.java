package com.bridgelabz;

public class Car {

    Engine engine;

    Car(Engine engine){
        this.engine=engine;
        System.out.println("Engine loaded inside car through constructor");
    }

    public void start(){
        System.out.println("Starting car...");
    }
}
