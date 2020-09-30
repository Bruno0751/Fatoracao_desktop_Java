//Fatorial
package br.com.web.view;
import java.util.Scanner;
/**
 * @author Bruno Gressler da Silveira
 * @version 1
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int fatorial;
	int resposta = 1;
        byte op;
        
	do{
            System.out.print("0 --- Sair\n"
                    + "1 --- Calculadora de Fatorial\n\n"
                    + "Digite a Opção: ");
            op = leia.nextByte();
            switch(op){
                case 0:
                    Tela.limparTela();
                    System.out.println("Sistema Encerrado");
                    System.exit(0);
                break;
                case 1:
                    Tela.limparTela();
                    System.out.print("Digite o Número a Ser Fatorado: ");
                    fatorial = leia.nextInt();

                    for( ; fatorial >= 1; --fatorial){
                            resposta *= fatorial;
                    }

                    System.out.println("O Fatorial é: " + resposta + "\n\n");
                    
                break;
                default:
                    Tela.limparTela();
                    System.out.println("Opção Inválida");
                break;
            }
            
        }while(op != 0);
        
    }  
}
