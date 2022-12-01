package com.example;
import java.util.List;

public class Lion {
    boolean hasMane;
    public Lion(String sex, Feline feline) throws Exception { // инъекция здесь
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }
    Feline feline;

    public List<String> getFood() throws Exception {
        Feline feline = new Feline();
        return feline.getFood("Хищник");
    }
}