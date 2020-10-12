//Fatorial
package br.com.web.view;
import java.util.Scanner;
import javax.swing.JOptionPane;
import model.User;
/**
 * @author Bruno Gressler da Silveira
 * @version 2
 * @since 11/10/20
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        User objUser = new User();
        
        int fatorial;
	int resposta = 1;
        
        
	do{
            objUser.setOp(Byte.parseByte(JOptionPane.showInputDialog(null, "0 --- Sair\n"
                    + "1 --- Calculadora de Fatorial\n\n"
                    + "Digite a Opção: ")));
            
            switch(objUser.getOp()){
                case 0:
                    JOptionPane.showMessageDialog(null, "Sistema Encerrado");
                    System.exit(0);
                break;
                case 1:
                    fatorial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Número a Ser Fatorado: "));

                    for( ; fatorial >= 1; --fatorial){
                            resposta *= fatorial;
                    }

                    JOptionPane.showMessageDialog(null, "O Fatorial é: " + resposta + "\n\n");
                    
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                break;
            }
            
        }while(objUser.getOp() != 0);
        
    }  
}
