package Modelos;

public class ContarLetrasUltimaPalavra {
    public static int nLetrasLastPalavra(String texto){
        return texto.split(" ")[texto.split(" ").length - 1].length();
    }
}