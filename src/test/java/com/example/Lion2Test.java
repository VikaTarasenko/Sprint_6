package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Lion2Test {

    @Mock
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
    @Test
    public void getKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(2);
        var lion = new Lion("Самка", feline);
        assertEquals(2, lion.getKittens());
    }
    @Test
    public void getFood() throws Exception {
        when(feline.eatMeat()).thenReturn(List.of("проверка1", "проверка2"));
        var lion = new Lion("Самка", feline);
        assertEquals(List.of("проверка1", "проверка2"), lion.getFood());
    }
}


