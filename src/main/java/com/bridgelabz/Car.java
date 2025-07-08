package com.bridgelabz;

public class Car {
    String model;
    Engine engine;

    Car(){

    }

    Car(Engine engine){
        this.engine=engine;
        System.out.println("Engine loaded inside car through constructor");
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Engine loaded inside car through setter");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void start(){
        System.out.println("Starting car...");
        System.out.println("car model name : "+model);
    }


}
