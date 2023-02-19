//Matheus Gomes de Souza RA: 2760482121041
//Thaís Favaro Padilha  RA: 2760482121003

package com.mycompany.forum;
import java.util.Scanner;

public class Forum {

    public static void main(String[] args) {
        
        int opcao1 = 0, opcao2 = 1, idProcesso, ano, campo, indice, cont = 0, CPF;
        String tipo, status, nomeProcesso, OAB, nome;
        
        Scanner scanner = new Scanner(System.in);
                                 
        System.out.println("Selecione o tipo de usuário:\n1 - Advogado\n2 - Civil");    //Recebe do usuário o tipo de usuário
        opcao1 = scanner.nextInt();             
        
        if(opcao1 == 1){    //Caso for 1, significa que ele é um advogado
            System.out.println("Informe sua OAB:"); //É pedido suas informações para instanciar um objeto da classe advogado
            OAB = scanner.nextLine();
            clearbuffer(scanner);   // Limpa o buffer de teclado
            System.out.println("Informe seu nome:");
            nome = scanner.nextLine();       
            Advogado adv = new Advogado(OAB, nome); //Instancia um objeto da classe advogado
               
            while(opcao2 != 0){  // é mostrado as opções que um objeto da classe advogado pode fazer
            
                System.out.println("Escolha uma opção:\n1 - Para registrar um processo\n2 - Para Consultar os processos\n3 - Para alterar dados de um processo já registrado\n0 - Para sair");
                opcao2 = scanner.nextInt(); //Limpa o buffer de teclado
            
                if(opcao2 == 1){    //Caso for 1, ele deverá informar os campos do processo.
                    System.out.println("Digite os valores do processo:");
                    System.out.println("ID do processo:");
                    idProcesso = scanner.nextInt();
                    clearbuffer(scanner); //Limpa o buffer de teclado
                    System.out.println("Tipo do processo:");
                    tipo = scanner.nextLine();                  
                    System.out.println("Ano do processo:");
                    ano = scanner.nextInt();
                    clearbuffer(scanner); //Limpa o buffer de teclado
                    System.out.println("Status do processo:");
                    status = scanner.nextLine();                  
                    System.out.println("Nome do processo:");
                    nomeProcesso = scanner.nextLine();
                    adv.criaProcesso(idProcesso, tipo, ano, status, nomeProcesso, cont); //Instancia um objeto com as informações coletadas e passa a variável cont como indice.
                    cont++; // Variável contadora para que quando for instanciar um próximo objeto do tipo processo não ser o mesmo indice anterior.
                }
                else if(opcao2 == 2){   //Caso for 2, apenas mostrará todos os processos já cadastrados.
                    adv.consultaAll();
                }
                else if(opcao2 == 3){ //Caso for 3, ele deverá informar o indice que se encontra o objeto em que deseja alterar algum campo
                    System.out.println("Digite a posição do processo");
                    indice = scanner.nextInt();                    
                    System.out.println("Digite o número correspondente ao campo que deseja alterar\n1 - Tipo do processo\n2 - Ano do processo\n3 - Status do processo\n4 - Nome do processo");
                    campo = scanner.nextInt(); //Lê qual campo o usuário deseja alterar
                    adv.alterarCampo(indice, campo);  //Chama o método responsável por alterar o campo, é passado o indice e o campo que deseja alterar
                }
            }
        }else if(opcao1 == 2){ //Caso for 2, significa que ele é um civíl
            System.out.println("Digite seu nome:"); //É pedido suas informações para instanciar um objeto da classe civil
            nome = scanner.nextLine();
            clearbuffer(scanner); //Limpa o buffer de teclado
            System.out.println("Digite seu CPF:");
            CPF = scanner.nextInt();         
            
            Civil cv = new Civil(CPF, nome); //Instancia um objeto da classe civil com as informações digitadas pelo usuário
            
            cv.consultaAll(); //Como trata-se de um civil, ele apenas conseguirar ver os processos já resgistrados
        }       
    }
    private static void clearbuffer(Scanner scanner){ //Esta função é usada para limpar o buffer de teclado
        if (scanner.hasNextLine()){
            scanner.nextLine();
        }
    }
}
