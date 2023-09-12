package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import main.Retangulo;

public class TestRetangulo {
    Retangulo ret = new Retangulo(10, 10);

    @Test
    @DisplayName("Retangulo")
    
    public void testArea(){
            int i = 100;
            int b = ret.calculaArea();
            assertEquals(i, b);
        }
    public void testPerimtro(){
            int i = 400;
            int b = ret.calculaArea();
            assertEquals(i, b);
        }

}
