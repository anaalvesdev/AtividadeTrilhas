import java.util.Locale;
import java.util.Scanner;

public class trilhaUm {
    static void print(String texto) {
        System.out.println(texto);
    }

    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        atd10();
    }

    public static void atd1() {
        // prazer,eu sou
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
        // media de notas
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
        // compras no exterior
        System.out.print("Digite o valor em reais: ");
        double reais = leia.nextDouble();
        double cotacao = 5.42;
        double dolares = reais / cotacao;
        System.out.printf("Valor em real R$ %.2f%nValor em dolar US$ %.2f%n", reais, dolares);

    }

    public static void atd5() {
        // compras onlies/descontos
        double total, preco;
        double desconto;
        String nome;

        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe o valor total da compra: ");
        preco = leia.nextDouble();
        System.out.println("Informe o cupom de desconto (Ex: 10,20,30..): ");
        desconto = leia.nextInt();

        desconto = preco * (desconto / 100);
        total = preco - desconto;

        System.out.printf(
                "Olá %s, sua compra de R$%.2f foi confirmada!%nFoi aplicado um desconto de %.2f%%%nO total final ficou R$%.2f%n",
                nome, preco, desconto, total);

    }

    public static void atd6() {
        // calculadora de IMC
        double peso, altura, imc;
        String nome;
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe seu peso: ");
        peso = leia.nextDouble();
        System.out.println("Informe sua altura: ");
        altura = leia.nextDouble();
        imc = peso / altura * altura;
        System.out.printf("Olá %s, seu IMC é %.2f%n", nome, imc);
    }

    public static void atd7() {
        // quantidade de horas lidas
        String nome, nomeLivro;
        int paginas, segundos;
        double horas;
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe o nome do livro: ");
        nomeLivro = leia.nextLine();
        System.out.println("Informe a quantidade de páginas do livro: ");
        paginas = leia.nextInt();
        System.out.println("Informe em quantos segundos você lê uma página: ");
        segundos = leia.nextInt();
        horas = (paginas * segundos) / 3600;
        System.out.printf("%s, Você vai ler o livro %s%nEm aproximadamente %.2f horas", nome, nomeLivro, horas);
    }

    public static void atd8() {
        // loja de açai
        double subtotal = 0, total,
                acaiP = 13.50, acaiM = 15.00, acaiG = 17.50;

        int quantidade = 0, desconto = 50;
        String resumo = "";
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            System.out.println("Informe o tamanho do açaí (P, M ou G): ");
            String tamanho = leia.nextLine();
            double preco;

            if (tamanho.equalsIgnoreCase("P")) {
                preco = acaiP;
            } else if (tamanho.equalsIgnoreCase("M")) {
                preco = acaiM;
            } else if (tamanho.equalsIgnoreCase("G")) {
                preco = acaiG;
            } else {
                System.out.println("Tamanho inválido");
                continue;
            }

            subtotal += preco;
            quantidade++;
            resumo += "- Açaí " + quantidade + ": tamanho " + tamanho.toUpperCase() + "%n";

            System.out.println("Deseja adicionar mais um açaí? (S/N)");
            continuar = leia.nextLine();
        }
        total = subtotal - (subtotal * (desconto / 100));
        System.out.printf("Seu pedido foi registrado!%n" + resumo
                + "Desconto de %d%% aplicado%nTotal: R$ %.2f%n", desconto, total);

    }

    public static void atd9() {
        double tamanhoPista, tempoVolta, distanciaKm, tempoMinutos;
        int voltas;
        System.out.println("Informe o tamanho da pista em metros: ");
        tamanhoPista = leia.nextDouble();
        System.out.println("Informe o tempo de uma volta em segundos: ");
        tempoVolta = leia.nextDouble();
        System.out.println("Informe a quantidade de voltas: ");
        voltas = leia.nextInt();
        distanciaKm = (tamanhoPista * tempoVolta) / 1000;
        tempoMinutos = (tempoVolta * voltas) / 60;

        System.out.println("Análise Preditiva Concluída");
        System.out.println("--");
        System.out.printf("Distância total a ser percorrida: %.2f km.%n", distanciaKm);
        System.out.printf("Previsão de conclusão: %.1f minutos.%n", tempoMinutos);
    }

    public static void atd10() {

        System.out.println("Informe o nome da meta: ");
        String meta = leia.nextLine();
        System.out.println("Informe o valor da meta: ");
        double valorMeta = leia.nextDouble();
        System.out.println("Informe seu salário: ");
        double salario = leia.nextDouble();
        System.out.println("Informe suas despesas: ");
        double despesas = leia.nextDouble();

        double saldo = salario - despesas;
        double reserva = saldo * 0.30;
        double disponivel = saldo - reserva;
        double prazo = valorMeta / disponivel;

        System.out.printf(Locale.US, "Meta: %s (R$ %.2f)%n", meta, valorMeta);
        System.out.printf(Locale.US, "Salário: R$ %.2f - Despesas: R$ %.2f%n%n", salario, despesas);
        System.out.printf(Locale.US, "Saldo após despesas: R$ %.2f%n", saldo);
        System.out.printf(Locale.US, "Reserva fixa (30%%): R$ %.2f%n", reserva);
        System.out.printf(Locale.US, "Valor disponível para a meta: R$ %.2f por mês%n", disponivel);
        System.out.printf(Locale.US, "Prazo estimado para atingir a meta: %.2f meses%n", prazo);

    }
}