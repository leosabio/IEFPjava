import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
        // Exercícios JAVA

        //Exercício 1 - Faça um Programa que mostre a mensagem "Alo mundo" na tela.

        System.out.println("Alô mundo");

        System.out.println("_________________________________");
        //Exercício 2 - Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

        System.out.println("Digite um número X");

        Scanner entrada = new Scanner(System.in);
        int X = 10;
        System.out.println("O número digitado foi " + X);

        System.out.println("_________________________________");
        //Exercício 3 - Faça um Programa que peça dois números e imprima a soma.
        System.out.println("Digite 2 números para somar x + y");
        int X2 = 10;
        int Y2 = 20;
        System.out.println("X+Y= " + (X2 + Y2));

        System.out.println("_________________________________");
        //Exercício 4 - Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        System.out.println("Digite 4 notas para ter a sua média final: ");
        float n1 = 11.2F;
        float n2 = 10.5F;
        float n3 = 15.2F;
        float n4 = 17.5F;
        System.out.println ("As 4 notas digitadas foram: " + n1 + "; " + n2 + "; " + n3 + "; " + n4);
        System.out.println ("A sua média então é: " + (n1 + n2 + n3 + n4) / 4);

        System.out.println("_________________________________");
        //Exercício 5 - Faça um Programa que converta metros para centímetros.
        System.out.println("Digite um número em métros para ser convertido para centimetros:");

        float metros = 10.8F;
        System.out.println("O número digitado foi " + metros);
        System.out.println(metros + "m em cm correspondem a: " + metros * 100 + "cm");

        System.out.println("_________________________________");

        //Exercício 6 - Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        System.out.println("Diga o raio de um círculo para calcular sua área: ");
        float raio = 21.78F;

        System.out.println("A área do círculo com raio = " + raio + " é " + Math.PI * Math.pow(raio, 2));




    }
}