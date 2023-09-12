package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import main.Ordena;

public class OrdenaTest {
        
        
        Ordena teste = new Ordena();

        @Test
        @DisplayName("Decrescente")
        
        public void testDecrescente(){
            int i [] = new int[] {10,9};
            int b [] = teste.ordenaNumerosDecrescente(i);
            assertEquals(i, b);
        }

        
}
