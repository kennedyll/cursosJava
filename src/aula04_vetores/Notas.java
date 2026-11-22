package aula04_vetores;

public class Notas {
    public static void main(String[] args) {
        //1.
        double[] numeros = {8.5, 6.0, 9.0, 4.5, 7.0};
        //2.
        System.out.println("Nota 1: " + numeros[0]);
        System.out.println("Nota 2: " + numeros[1]);
        System.out.println("Nota 3: " + numeros[2]);
        System.out.println("Nota 4: " + numeros[3]);
        System.out.println("Nota 5: " + numeros[4]);
        //3.
        System.out.println(numeros[0]);
        System.out.println(numeros[numeros.length - 1]);
        //4.
        double media = (numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4] ) / numeros.length;
        System.out.println("Media " + media);
        //5.
        //System.out.println(numeros[5]);

    }
    
}
