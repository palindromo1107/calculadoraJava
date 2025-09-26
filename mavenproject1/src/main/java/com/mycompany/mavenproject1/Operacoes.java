package com.mycompany.mavenproject1;

public class Operacoes {

    private String opera;
    private int a;
    private int b;

    public void operador(String operar){ opera = operar; }

    public void n1(int num){ a = num; }

    public void n2(int num){ b = num; }

    public int resultado(){

        switch (opera) {
            case "+": return a + b;

            case"-": return a - b;

            case "*": return a * b;

            case "/": return (a == 0 || b == 0) ? 0 : (int) (a / b) ;

            default: return 0;
        }

    }

}
