//Matheus Gomes de Souza RA: 2760482121041
//Thaís Favaro Padilha  RA: 2760482121003

package com.mycompany.forum;

public class Civil extends Usuario {
    
    private int CPF; 

    public Civil(int CPF, String nome) { //Construtor
        super(nome);
        this.CPF = CPF;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

}
