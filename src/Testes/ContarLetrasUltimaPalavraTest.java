package Testes;

import org.junit.jupiter.api.Test;

import static Modelos.ContarLetrasUltimaPalavra.nLetrasLastPalavra;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContarLetrasUltimaPalavraTest {

    @Test
    void testeContarUltimaPalavra() {
        int[] respostas = {8, 5, 7};
        String[] entradas = {"Na minha máquina funciona", "Eu posso pular o teste", "Isso não deve demorar"};
        for (int item = 0; item < entradas.length; item++) {
            assertEquals(respostas[item], nLetrasLastPalavra(entradas[item]));
        }
    }

    public static void main(String[] args) {
        String[] entradas = {"Na minha máquina funciona", "Eu posso pular o teste", "Isso não deve demorar"};
        for (String entrada : entradas) {
            System.out.printf("A última palavra do texto '%s' tem %d letras.\n", entrada, nLetrasLastPalavra(entrada));
        }
    }
}