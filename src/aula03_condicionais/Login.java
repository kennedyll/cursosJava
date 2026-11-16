package aula03_condicionais;

public class Login {
    public static void main(String[] args) {
        String usuario = "Ruan";

        System.out.println(usuario.equals("ruan"));

        if (usuario == "ruan"){
            System.out.println("Bem-vindo!");
        } else {
            System.out.println("Usuário inválido");
        }
    }
}
