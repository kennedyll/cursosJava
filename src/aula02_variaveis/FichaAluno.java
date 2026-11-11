package aula02_variaveis;

public class FichaAluno {
    public static void main(String[] args) {
        String nome = "João da Silva";
        int idade = 20;
        double altura = 1.75;
        boolean maiorDeIdade = idade >= 18;
        char inicialDoNome = nome.charAt(0);

        System.out.println("==Ficha do Aluno==");

        System.out.print("Nome: ");
        System.out.println(nome);

        System.out.print("Idade: ");
        System.out.println(idade);

        System.out.print("Altura: ");
        System.out.println(altura);

        System.out.print("Maior de Idade: ");
        System.out.println(maiorDeIdade);

        System.out.print("Inicial do Nome: ");
        System.out.println(inicialDoNome);
    }

}
