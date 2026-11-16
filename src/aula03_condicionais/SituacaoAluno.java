package aula03_condicionais;

public class SituacaoAluno {
    public static void main(String[] args) {
        double nota = 3;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
