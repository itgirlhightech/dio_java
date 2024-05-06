package About;

import java.util.Locale;
import java.util.Scanner;

public class me {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("digite seu nome:  ");
        String nome = scanner.next();

        System.out.println("digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("digite sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println("Olá, me chamo " + nome + "  " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é  " + altura + "cm ");
    }

}
