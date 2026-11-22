package aula04_vetores;

import java.util.ArrayList;

public class Tarefas {
    public static void main(String[] args) {
        //criar um arraylist
        ArrayList<String> rotina = new ArrayList<>();
        //adicionar os campos
        rotina.add("Estudar Java");
        rotina.add("Treinar Inglês");
        rotina.add("Fazer Commit"); 
        //imprimir arraylist inteira
        System.out.println(rotina);
        //consultar um elemento
        System.out.println(rotina.get(1));
        //consultar o tamanho do array
        System.out.println(rotina.size());
        //deletar um elemento
        rotina.remove(1);
        System.out.println(rotina.size());
        //adicionar um quarto elemento
        rotina.add("Treinar Boxe");
        System.out.println(rotina);
    }
}
