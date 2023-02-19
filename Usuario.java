//Matheus Gomes de Souza RA: 2760482121041
//Thaís Favaro Padilha  RA: 2760482121003

package com.mycompany.forum;

public abstract class Usuario {
    
    private Processo processos[] = new Processo[10]; //um usuário possui um array de objetos do tipo Processo
    private String nome;    //possui nome
    private int aux = 0;    //variável auxiliar
    
    public Usuario(String nome){    //construtor
        this.nome = nome;
    }
    public String getNome() {   
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void consulta1(int ID){  //Consulta apenas um dos processos cadastrados, é esperado informar o indice do processo no array.
        processos[ID].consulta();
    }
    public void consultaAll(){      //Consulta todos os processos já cadastrados no array 
        for(int i = 0; i < aux; i++){
            processos[i].consulta();
        }
    }
    public Processo getProcessos(int ID) {  //Retorna o objeto referente ao indice informado
        return processos[ID];
    }
    public void setProcessos(Processo processo, int id) {   //cria um novo objeto do tipo processo no indice passado como parâmetro
        this.processos[id] = processo; 
        aux++; //Saber o total de processos registrados
    }
}
