package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Operacoes {

    int opera;

    public Operacoes(int opera){ 
        this.opera = opera;
    }

    public void salvar(String valor){

        //TODO: terminar o codigo!

        ArrayList <String> numeros = new ArrayList<>();

        numeros.add(valor);

        if (numeros.size() >= 3) {

            for (String iterable_element : numeros) {

                Integer.parseInt(iterable_element);

            }

        }

    }

    public int ouperacoes(int entrada, int alpha, int beta){

        if (entrada == 1) { return som(alpha, beta); } 

        else if (entrada == 2) { return sub(alpha, beta); } 

        else if (entrada == 3) { return mult(alpha, beta); } 

        else { return (int)div(alpha, beta); }

    }


    //! OPERAÇÕES

    public int som(int a, int b){ return a + b; }

    public int sub(int a, int b){ int result = ( a > b) ? a - b : b - a ; return result; }

    public int mult(int a, int b){ return a * b; }

    public float div(int a, int b) { float result = a / b; return result;}

}