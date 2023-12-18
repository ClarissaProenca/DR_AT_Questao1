package org.example;

import javax.swing.*;

public class Calculadora {
    public static double Soma(double num1, double num2){
        return num1 + num2;
    }

    public static double Subt(double num1, double num2){
        return num1 - num2;
    }

    public static double Modulo(double num1, double num2){
        double soma = Math.pow(num1, 2) + Math.pow(num2, 2);
        double res = Math.sqrt(soma);
        return res;
    }
}
