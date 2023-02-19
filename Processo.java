//Matheus Gomes de Souza RA: 2760482121041
//Thaís Favaro Padilha  RA: 2760482121003

package com.mycompany.forum;

public class Processo {
    
    private int idProcesso; //Atributos de um processo
    private String tipo;
    private int ano;
    private String status;
    private String nomeProcesso;

    public Processo(int idProcesso, String tipo, int ano, String status, String nomeProcesso) { //construtor 
        this.idProcesso = idProcesso;
        this.tipo = tipo;
        this.ano = ano;
        this.status = status;
        this.nomeProcesso = nomeProcesso;
    }
    public int getIdProcesso() {
        return idProcesso;
    }
    public String getTipo() {
        return tipo;
    }
    public int getAno() {
        return ano;
    }
    public String getStatus() {
        return status;
    }
    public String getNomeProcesso() {
        return nomeProcesso;
    }

    public void setIdProcesso(int idProcesso) {
        this.idProcesso = idProcesso;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNomeProcesso(String nomeProcesso) {
        this.nomeProcesso = nomeProcesso;
    }
    
    public void consulta(){ //Imprime na tela os atributos do processo
        System.out.println("\nDADOS DO PROCESSO\nNome: " + this.nomeProcesso + "\nTipo: " + this.tipo + "\nAno: " + this.ano + "\nStatus: " + this.status + "\nID: "+ this.idProcesso + "\n");
    }
    
}
