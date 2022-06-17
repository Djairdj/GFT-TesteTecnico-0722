package Modelos;

import java.util.ArrayList;
import java.util.List;

public class SomaLetras {

    public  static int somarLetras(String texto){
        List<Character> alfabeto = new ArrayList<>();
        char letra = 'a';
        int soma = 0;
        for (int i = 0; i < 26; i++) {
            alfabeto.add(i,letra++);
        }
        for (int i = 0; i < texto.length();i++){
            char letter = texto.substring(i, i + 1).toLowerCase().charAt(0);
            int valor = alfabeto.indexOf(letter) + 1;
            //System.out.printf("Valor %s vale: %d\n", letter, valor);
            soma += valor;
        }
        return soma;
    }
}