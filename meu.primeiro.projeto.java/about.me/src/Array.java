//ublic class Array {
   // public static void main(String[] args) {
       // String alunos [] = { "Elena", "Lucas", "Jeny", "Leo"};

       // for (int x=0; x < alunos.length; x++) {

           // System.out.println("O aluno no indice x=" + x + "  é  " + alunos[x]);
      //  }
 //   }
//}
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();



        try {
            contar(parametroUm, parametroDois);


        }catch (ParametrosInvalidosEception exceção) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if ( parametroUm >= parametroDois) {
            throw new ParametrosInvalidosEception();
        }


        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}