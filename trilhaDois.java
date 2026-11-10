import java.util.Scanner;

public class trilhaDois {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
    }

    public static void atd1() {
        double ganhos = sc.nextInt();
        double gastos = sc.nextInt();

        if (ganhos >= gastos) {
            System.out.printf("Você está dentro do orçamento!", ganhos);
        } else {
            System.out.printf("Você está fora do orçamento! %nNão gaste mais!", gastos);
        }
    }

    public static void atd2() {
        String cor = sc.nextLine();
        if (cor.equals("Vermelho")) {
            System.out.println("Espere");
        } else if (cor.equals("Verde")) {
            System.out.println("Atravesse ");
        } else {
            System.out.println("Farol inoperante" + cor);
        }
    }

    public static void atd3() {
        int dia = sc.nextInt();

        if (dia == 0) {
            System.out.println("Domingo");
        } else if (dia == 1) {
            System.out.println("Segunda");
        } else if (dia == 2) {
            System.out.println("Terça");
        } else if (dia == 3) {
            System.out.println("Quarta");
        } else if (dia == 4) {
            System.out.println("Quinta");
        } else if (dia == 5) {
            System.out.println("Sexta");
        } else if (dia == 6) {
            System.out.println("Sábado");
        } else
            System.out.println("Dia da semana inválido");
    }

    public static void atd4() {
        double grama = sc.nextDouble();

        if (grama <= 0) {
            System.out.println("Peso inválido");
        } else if (grama >= 1000) {
            double total = (grama / 100.0) * 3.00;
            System.out.printf("O total é R$ %.2f%n", total);
        } else {
            double total = (grama / 100.0) * 3.50;
            System.out.printf("O total é R$ %.2f%n", total);
        }
    }

    public static void atd5() {
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        int faltas = sc.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        if (faltas < 0 || media < 0 || media > 10) {
            System.out.println("Parâmetros inválidos");
        } else {
            System.out.printf("Média: %.1f.%n", media);
        }
        if (faltas > 4) {
            System.out.println("Situação: Reprovado por Falta.");

        } else if (media == 0) {
            System.out.println("Situação: Desistente");

        } else if (media < 6.0) {
            System.out.println("Situação: Recuperação");

        } else if (media < 8) {
            System.out.println("Situação: Aprovado");

        } else {
            System.out.println("Situação: Aprovado com sucesso");
        }
    }

    public static void atd6() {
        String cor1 = sc.nextLine();
        String cor2 = sc.nextLine();

        if ((cor1.equals("Vermelho") && cor2.equals("Azul")) || (cor1.equals("Azul") && (cor2.equals("Vermelho")))) {
            System.out.printf("A combinação resulta em: %nRoxo  ");

        } else
            System.out.println("Apenas cores primárias são aceitas.");
    }

    public static void atd7() {
        double notaCand = sc.nextDouble();
        double notaCorte = sc.nextDouble();
        double notaMin = sc.nextDouble();

        if (notaCand >= notaMin) {
            System.out.printf("Situação candidato:%nAprovado");

        } else if (notaCand < notaCorte) {
            System.out.printf("Situação candidato:%nReprovado");

        } else {
            System.out.printf("Situação candidato:%nLista de Espera");
        }
    }

    public static void atd8() {
        double num1 = sc.nextInt();
        double num2 = sc.nextInt();
        String operacao = sc.next();

        if (operacao.equals("1") || operacao.equals("soma")) {
            System.out.printf("%.1f + %.1f = %.1f%n", num1, num2, num1 + num2);

        } else if (operacao.equals("2") || operacao.equals("subtração")) {
            System.out.printf("%.1f - %.1f = %.1f%n", num1, num2, num1 - num2);

        } else if (operacao.equals("3") || operacao.equals("multiplicação")) {
            System.out.printf("%.1f * %.1f = %.1f%n", num1, num2, num1 * num2);

        } else if (operacao.equals("4") || operacao.equals("divisão")) {
            System.out.printf("%.1f / %.1f = %.1f%n", num1, num2, num1 / num2);

        } else if (operacao.equals("5") || operacao.equals("resto")) {
            System.out.printf("%.1f mod %.1f = %.1f%n", num1, num2, num1 % num2);

        } else if (operacao.equals("6") || operacao.equals("potência")) {
            System.out.printf("%.1f ^ %.1f = %.1f%n", num1, num2, Math.pow(num1, num2));

        } else {
            System.out.println("Operação não suportada");
        }
    }

    public static void atd9() {
        String curso = sc.nextLine();
        String isento = sc.nextLine();
        double desconto = sc.nextDouble();

        double valorBase = 0;

        if (curso.equalsIgnoreCase("SI")) {
            valorBase = 900.00;

        } else if (curso.equalsIgnoreCase("ADS")) {
            valorBase = 750.00;

        } else if (curso.equalsIgnoreCase("CS")) {
            valorBase = 1150.00;

        } else if (curso.equalsIgnoreCase("EC")) {
            valorBase = 1300.00;

        } else if (curso.equalsIgnoreCase("ES")) {
            valorBase = 950.00;

        } else {
            System.out.println("Curso não encontrado");
        }

        double valorFinal;

        if (isento.equalsIgnoreCase("Sim")) {
            valorFinal = 0;

        } else {
            valorFinal = valorBase * (1 - (desconto / 100));
        }
        System.out.printf("Valor da mensalidade:%nR$ %.2f%n", valorFinal);
    }

    public static void atd10() {
        double inteira = sc.nextDouble();
        double meia = sc.nextDouble();
        sc.next();

        String dia = sc.nextLine();
        String nacional = sc.nextLine();

        double total = 0;

        double ingresso = inteira + meia;

        if (nacional.equalsIgnoreCase("Sim")) {
            total = ingresso * 5;

        } else if (dia.equalsIgnoreCase("Quarta-feira") || dia.equalsIgnoreCase("Quarta")) {
            total = ingresso * 14.50;

        } else {
            total = (inteira * 28.50) + (meia * 14.25);
        }

        System.out.printf("Total à pagar:%nR$ %.2f%n", total);
    }
}


