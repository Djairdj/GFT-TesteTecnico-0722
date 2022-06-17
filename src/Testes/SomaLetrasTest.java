package Testes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static Modelos.SomaLetras.somarLetras;
import static org.junit.jupiter.api.Assertions.*;

class SomaLetrasTest {

    @Test
    void somarLetrasTest() {
        Map<String, Integer> input = new HashMap<>();
        input.put("Abba", 6);
        input.put("Meu código não precisa de comentários", 317);
        input.put("Eu conserto depois", 203);
        input.put("É só uma pequena mudança", 187);

        for(Map.Entry<String, Integer> ent : input.entrySet()){
            assertEquals(ent.getValue(), somarLetras(ent.getKey()));
        }

    }
}