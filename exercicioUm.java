import java.util.Scanner;

public class exercicioUm {
    static void print(String texto) {
        System.out.println(texto);
    }

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        atd1();
    }

    public static void atd1() {
        String nome, curso, semestre, hobbies;
        print("Digite seu nome: ");
        nome = leia.nextLine();
        print("Digite seu curso: ");
        curso = leia.nextLine();
        print("Digite seu semestre: ");
        semestre = leia.nextLine();
        print("Digite seu hobbie: ");
        hobbies = leia.nextLine();
        System.out.printf("Prazer, eu sou %s\nAtualmente estou no %s° semestre do curso %s\nmeu hobby favorito é %s.",
                nome, semestre, curso, hobbies);
    }
}