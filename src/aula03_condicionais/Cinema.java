package aula03_condicionais;

public class Cinema {
    public static void main(String[] args) {
        int idade = 11;
        boolean temIngresso = true;
        boolean acompanhado = true;

        if (!temIngresso){
            System.out.println("Entrada negada");
        } else if (temIngresso && idade >= 12) {
            System.out.println("Entrada liberada");
        } if (idade < 12 && temIngresso) {
            if (acompanhado) {
                System.out.println("Entrada liberada");
            } else {
                System.out.println("Entrada negada");
            }
           
        }
    }
    
}
