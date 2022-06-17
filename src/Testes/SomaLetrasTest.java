package Testes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static Modelos.SomaLetras.somarLetras;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomaLetrasTest {

    @Test
    void somarLetrasTest() {
        Map<String, Integer> input = new HashMap<>();
        input.put("Abba", 6);
        input.put("Meu código não precisa de comentários", 317);
        input.put("Eu conserto depois", 203);
        input.put("É só uma pequena mudança", 187);

        for (Map.Entry<String, Integer> ent : input.entrySet()) {
            assertEquals(ent.getValue(), somarLetras(ent.getKey()));
        }

    }

    public static void main(String[] args) {
        String[] entradas = {"Meu código não precisa de comentários", "Eu conserto depois", "É só uma pequena mudança"};
        for (String txt : entradas) {
            System.out.printf("%s vale %d.\n", txt, somarLetras(txt));
        }
    }
}