package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class Lion2Test {
Feline feline;


    @Test
    public  void doesHaveMane() throws Exception {
        Feline feline = new Feline();
        var lion = new Lion("Самка", feline);
        assertEquals(false, lion.doesHaveMane());

    }
    @Test
    public void checkException(){
        Exception actualException = assertThrows(Exception.class, () ->
                new Lion("Собака", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", actualException.getMessage());
    }
}


