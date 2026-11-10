import java.util.Scanner;

public class exercicioUm {
    static void print(String texto) {
        System.out.println(texto);
    }

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        atd5();
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

    public static void atd3() {
        double n1, n2, n3, media;
        String nome;

        System.out.println("Informe seu nome?");
        nome = leia.nextLine();
        System.out.println("Informe sua 1° nota");
        n1 = leia.nextDouble();
        System.out.println("Informe sua 2° nota");
        n2 = leia.nextDouble();
        System.out.println("Informe sua 3° nota");
        n3 = leia.nextDouble();

        media = (n1 + n2 + n3) / 3;
        System.out.printf("O aluno(a) %s ficou com média de %.1f", nome, media);
    }

    public static void atd4() {
        System.out.print("Digite o valor em reais: ");
        double reais = leia.nextDouble();
        double cotacao = 5.42;
        double dolares = reais / cotacao;
        System.out.printf("Valor em real R$ %.2f%nValor em dolar US$ %.2f%n", reais, dolares);

    }

    public static void atd5() {
        double valor, total, preco;
        int desconto;
        String nome;
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe o valor total da compra: ");
        valor = leia.nextDouble();
        System.out.println("Informe o cupom de desconto (Ex: 10,20,30..): ");
        desconto = leia.nextInt();
        total = valor * (desconto / 100);
        total = total - valor;
        System.out.printf(
                "Olá %s, sua compra de R$%.2f foi confirmada!%nFoi aplicado um desconto de %d%%%nO total final ficou R$%.2f%n",
                nome, valor, desconto, total);

    }

}