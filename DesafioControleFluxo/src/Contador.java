import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal  = new Scanner (System.in);

            System.out.println("Digite o primeiro parâmetro: ");
                int parametroUm = terminal.next();

            System.out.println("Digite o segundo parâmetro: ");
                int parametroDois = terminal.next();

            try { contar (parametroUm, parametroDois);
            }

            
    }
}
