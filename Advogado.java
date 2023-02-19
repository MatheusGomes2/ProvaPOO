//Matheus Gomes de Souza RA: 2760482121041
//Thaís Favaro Padilha  RA: 2760482121003

package com.mycompany.forum;
import java.util.Scanner;


public class Advogado extends Usuario implements AdvInterface{
    
    private String OAB;

    public Advogado(String OAB, String nome) { //Construtor 
        super(nome);
        this.OAB = OAB;
    }
    public String getOAB() {
        return OAB;
    }
    @Override
    public void criaProcesso(int idProcesso, String tipo, int ano, String status, String nomeProcesso, int id){ //Cria um processo com as informações passadas por parâmetro
        this.setProcessos(new Processo(idProcesso, tipo, ano, status, nomeProcesso), id);
    }
    
    Scanner scanner = new Scanner(System.in);
    @Override
    public void alterarCampo(int id, int campo){ //Altera o campo correspondente do objeto processo selecionado no array
        if(campo == 1){
            System.out.println("Digite o novo valor para tipo:");
            String novo = scanner.nextLine();
            this.getProcessos(id).setTipo(novo);
            System.out.println("Dado atualizado!\n");
            this.getProcessos(id).consulta();
        }
        else if(campo == 2){
            System.out.println("Digite o novo valor para ano:");
            int novo = scanner.nextInt();
            this.getProcessos(id).setAno(novo);
            System.out.println("Dado atualizado!\n");
            this.getProcessos(id).consulta();
        }
        else if(campo == 3){
            System.out.println("Digite o novo valor para status:");
            String novo = scanner.nextLine();
            this.getProcessos(id).setStatus(novo);
            System.out.println("Dado atualizado!\n");
            this.getProcessos(id).consulta();
        }
        else if(campo == 4){
            System.out.println("Digite o novo valor para nome do processo:");
            String novo = scanner.nextLine();
            this.getProcessos(id).setNomeProcesso(novo);
            System.out.println("Dado atualizado!\n");
            this.getProcessos(id).consulta();
        }else{
            System.out.println("Campo selecionado inválido!");    
        }
    }
}
