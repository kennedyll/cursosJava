package aula04_vetores;

import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {
        
        System.out.println("===== Parte A =====");

        //parte A 
        String[] listaDeNomes = new String[3];
        listaDeNomes[0] = "ruan";
        listaDeNomes[1] = "lucas";
        listaDeNomes[2] = "livia";
        //listaDeNomes[3] = "maria";
        System.out.println(listaDeNomes[0]);
        System.out.println(listaDeNomes.length);

        System.out.println("===== Parte B =====");

        //parte B
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ruan");
        nomes.add("Lucas");
        nomes.add("Livia");

        System.out.println(nomes.get(0));
        System.out.println(nomes.size());

        nomes.add("Laura");
        System.out.println(nomes);
        System.out.println(nomes.size());
        
    }
    
}
