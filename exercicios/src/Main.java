import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Exercícios JAVA

        //Exercício 1 - Faça um Programa que mostre a mensagem "Alo mundo" na tela.

        System.out.println("Alô mundo");

        System.out.println("_________________________________");
        //Exercício 2 - Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

        System.out.println("Digite um número X");

        int X = entrada.nextInt();

        System.out.println("O número digitado foi " + X);

        System.out.println("_________________________________");
        //Exercício 3 - Faça um Programa que peça dois números e imprima a soma.
        System.out.println("Digite 2 números para somar x + y");

        int X2 = entrada.nextInt();
        int Y2 = entrada.nextInt();
        System.out.println("X+Y= " + (X2 + Y2));

        System.out.println("_________________________________");
        //Exercício 4 - Faça um Programa que peça as 4 notas bimestrais e mostre a média. (dúvida! quando insiro números com casas decimais com ponto ao invés de vírgula dá erro)
        System.out.println("Digite 4 notas para ter a sua média final: ");
        float n1 = entrada.nextFloat();
        float n2 = entrada.nextFloat();
        float n3 = entrada.nextFloat();
        float n4 = entrada.nextFloat();

        System.out.println ("As 4 notas digitadas foram: " + n1 + "; " + n2 + "; " + n3 + "; " + n4);
        System.out.println ("A sua média então é: " + (n1 + n2 + n3 + n4) / 4);

        System.out.println("_________________________________");
        //Exercício 5 - Faça um Programa que converta metros para centímetros.
        System.out.println("Digite um número em métros para ser convertido para centimetros:");
        float metros = entrada.nextFloat();

        System.out.println("O número digitado foi " + metros);
        System.out.println(metros + "m em cm correspondem a: " + metros * 100 + "cm");

        System.out.println("_________________________________");

        //Exercício 6 - Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        System.out.println("Diga o raio de um círculo para calcular sua área: ");
        float raio = entrada.nextFloat();
        System.out.println("A área do círculo com raio = " + raio + " é " + Math.PI * Math.pow(raio, 2));

        System.out.println("_________________________________");
        //Exercício 7 - Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

        System.out.println("Informe o valor de uma aresta do quadrado em cm para calcular sua área e depois o dobro da área será informado");
        float aresta = entrada.nextFloat();
        float areaquadrado = (aresta * aresta);
        System.out.println(areaquadrado + "cm quadrados");
        System.out.println("O dobro da área do quadrado é: " + areaquadrado * 2 + "cm quadrados");

        System.out.println("_________________________________");

        //Exercício 8 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês..
        System.out.println("Informe quanto você ganha por hora:");
        float hora = entrada.nextFloat();
        System.out.println("O valor informado foi de " + hora + " reais.");
        System.out.println("Informe quantas horas você trabalhou neste mês:");
        float horas_trabalhadas = entrada.nextFloat();
        System.out.println("O número de horas informado foi " + horas_trabalhadas);
        System.out.println("O seu salário será de " + hora * horas_trabalhadas);

        System.out.println("_________________________________");

        //Exercício 9 - Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
        System.out.println("Informe uma temperatura em Fahrenheit para ser convertida em Celcius: ");
        float fah = entrada.nextFloat();
        System.out.println("A resposta em graus Célcius é: " + (fah - 32) / 9 * 5);

        System.out.println("_________________________________");

        //Exercício 10 - Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

        System.out.println("Informe uma temperatura em Célcius para ser convertida em Fahrenheit : ");
        float cel = entrada.nextFloat();
        float multipli = cel * (9/5);
        System.out.println("A resposta em graus Fahrenheit é: " + (multipli + 32));

        System.out.println("_________________________________");
        //Exercício 11 - Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        System.out.println("Informe dois números inteiros e um número real: ");
        int inteiro1 = entrada.nextInt();
        int inteiro2 = entrada.nextInt();
        float numeroreal = entrada.nextFloat();

        System.out.println("a.O produto do dobro do primeiro com metade do segundo é " + (inteiro1 * 2) * (inteiro2 / 2));
        System.out.println("b.A soma do triplo do primeiro com o terceiro é " + (inteiro1 * 3 + numeroreal));
        System.out.println("b.O terceiro elevado ao cubo é " + Math.pow(numeroreal, 3));

        System.out.println("_________________________________");
        //Exercício 12 - Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
        System.out.println("Informe sua altura em metros para calcular seu peso ideal: ");
        float altura = entrada.nextFloat();
        float peso = 72.7f * altura - 58;
        System.out.println("Seu peso ideal é: " + peso);

        System.out.println("_________________________________");
        //Exercício 13 - Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
        System.out.println("Informe sua altura em metros para calcular seu peso ideal masculino e feminino: ");

        float altura2 = entrada.nextFloat();
        float pesohomem = altura2 * 72.7f - 58;
        float pesomulher = altura2 * 62.1f - 44.7f;
        System.out.println("a.O seu peso ideal para um homem é " + pesohomem);
        System.out.println("a.O seu peso ideal para uma mulher é " + pesomulher);

        System.out.println("_________________________________");
        //Exercício 14 - João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
        System.out.println("Informe quantos quilos de peixe foram pescados (somente valores maiores que 50Kg!): ");

        float pesopeixe = entrada.nextFloat();
        float excesso = pesopeixe - 50;
        float multa = excesso * 4;
        System.out.println("Excesso: " + excesso + "Kg e multa de " + multa + " reais.");

        System.out.println("_________________________________");

        //Exercício 15 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
        System.out.println("Quanto você ganha por hora?");
        float valorhoratr = entrada.nextFloat();
        System.out.println("Quantas horas você trabalhou neste mês?");
        float horastrabalhadasmes = entrada.nextFloat();
        float salariomensal = valorhoratr * horastrabalhadasmes;
        float inss = salariomensal * 0.08f;
        float sindicato = salariomensal * 0.05f;
        float imposto = salariomensal * 0.11f;

        System.out.println("a. Seu salário bruto este mês foi de: " + salariomensal + " reais.");
        System.out.println("b. Você pagou ao INSS: " + inss + " reais.");
        System.out.println("c. Você pagou ao sindicato: " + sindicato + " reais.");
        System.out.println("d. Seu salário líquido este mês foi de: " + (salariomensal - inss - sindicato - imposto) + " reais.");
        System.out.println("e. A somatória dos descontos foi de: " + (inss + sindicato + imposto) + " reais.");


        System.out.println("_________________________________");
        //Exercício 16 - Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
        System.out.println("Qual a área a ser pintada, em metros quadrados?");
        float areatinta = entrada.nextFloat();
        int metros_pintados_uma_lata = 18 * 3;
        float preço_lata = 80;
        float quantaslatas = areatinta / metros_pintados_uma_lata;
        System.out.println("Deve-se comprar " + quantaslatas + " latas de tinta e o preço total será " + quantaslatas * preço_lata + " reais.");

        System.out.println("_________________________________");
        //Exercício 17 - Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
        System.out.println("Qual a área a ser pintada, em metros quadrados?");
        double areatinta2 = entrada.nextDouble();
        int metros_pintados_uma_lata2 = 18 * 6;
        double quantaslatas2 = areatinta2 / metros_pintados_uma_lata2;
        double litrosgaloes = 3.6;
        int precogalao = 25;
        double metros_pintados_galao = litrosgaloes * 6;
        double quantosgaloes =  areatinta2 / metros_pintados_galao;
        double litrostotais = areatinta2 / 6;
        double lataegalao = areatinta2 / (quantaslatas2 + quantosgaloes);

        System.out.println("a. Comprando apenas latas de 18 litros deve-se comprar " + quantaslatas2 + " latas" + " e o preço será de " + (quantaslatas2 * preço_lata) + " reais.");
        System.out.println("b. Comprando apenas galões de 3,6 litros deve-se comprar " + quantosgaloes + " latas" + " e o preço será de " + (quantosgaloes * precogalao) + " reais.");

        double sei = quantaslatas2 * 1.1;
        System.out.println("c. Comprando latas e galões " + quantaslatas2);





        System.out.println("_________________________________");
        //Exercício 18 - Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
        System.out.println("Para saber o tempo de download digite o tamanho do arquivo em MB:");
        float tempo = entrada.nextFloat();
        System.out.println("Agora informe a velocidade de download do link de internet em Mbps:");
        float velocidade = entrada.nextFloat();
        float tempodedownload = tempo / velocidade;
        float tempodedownloademminutos = tempodedownload / 60;
        System.out.println("O download levará " + tempodedownloademminutos + " minutos");

        System.out.println("_________________________________");

    }
}