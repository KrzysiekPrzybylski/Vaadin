package com.przybylski.vaadindemo.model;

public class Car {

    private String Mark;
    private String Model;

    public Car(String mark, String model) {
        Mark = mark;
        Model = model;
    }

    public Car() {
    }

    public String getMark() {
        return Mark;
    }

    public void setMark(String mark) {
        Mark = mark;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Mark='" + Mark + '\'' +
                ", Model='" + Model + '\'' +
                '}';
    }
}
