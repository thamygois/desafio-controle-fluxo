import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal  = new Scanner (System.in).useLocale(Locale.US);

            System.out.println("Digite o primeiro parâmetro: ");
                int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro: ");
                int parametroDois = terminal.nextInt();

           terminal.close();

       try { contar (parametroUm, parametroDois);
        }

        catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro!" + e);
        } 
    }

         public class ParametrosInvalidosException extends Exception {}

        static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            
           int contagem = 0;
            if (parametroUm > parametroDois) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro!");;
                
            }

            else {
                contagem = parametroDois - parametroUm;

             int contagemInicial = 1;
                for ( ; contagemInicial <= contagem; ) {
                    System.out.println("Imprimindo número: " + contagemInicial);
                    contagemInicial++;
                } }
       
            }
        
       
        
    } 

