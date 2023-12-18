package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.example.Calculadora.*;

/*Teste Caixa branca e caixa preta:
* O teste de caixa branca é normalmente feito pelo desenvolvedor, pois nele se tem acesso ao código fonte.
* Ou seja, são métodos de teste da estrutura interna do software.
* Já a caixa preta não se preocupa com o código e seu funcionamento interno. Ele se baseia nas ações qua a aplicação deve realizar.
*
* Nesse projeto useu testes manuais para testar a visualização do java swing e seus componentes.
* Para o teste dos métodos usei testes automatizados usando o JUnit
* */

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de números complexos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 3));

        JTextField label1A = new JTextField();
        JLabel labelIA = new JLabel(" i ", SwingConstants.LEFT);
        labelIA.setFont((new Font("Arial", Font.ITALIC, 20)));
        JTextField label1B = new JTextField();

        painel.add(label1A);
        painel.add(label1B);
        painel.add(labelIA);

        JTextField label2A = new JTextField();
        JLabel labelIB = new JLabel(" i ", SwingConstants.LEFT);
        labelIB.setFont((new Font("Arial", Font.ITALIC, 20)));
        JTextField label2B = new JTextField();

        painel.add(label2A);
        painel.add(label2B);
        painel.add(labelIB);

        JTextField resultado = new JTextField();
        resultado.setEditable(false);
        JTextField resultado1 = new JTextField();
        resultado1.setEditable(false);
        JTextField resultado2 = new JTextField();
        resultado2.setEditable(false);

        painel.add(resultado);
        painel.add(resultado1);
        painel.add(resultado2);

        //Botões
        String[] buttonLabels = {"Soma", "Subtração", "Módulo"};

        for(String label : buttonLabels){
            JButton button = new JButton(label);
            painel.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    double num1A, num1B, num2A, num2B;

                    try{
                        num1A = Double.parseDouble(label1A.getText());
                        num1B = Double.parseDouble(label1B.getText());

                        num2A = Double.parseDouble(label2A.getText());
                        num2B = Double.parseDouble(label2B.getText());


                        if(label.equals("Soma")){
                            resultado.setText(Soma(num1A, num2A) + "  ");
                            resultado1.setText(Soma(num1B, num2B) + " i");
                        } else if(label.equals("Subtração")){
                            resultado.setText(Subt(num1A, num2A) + "   ");
                            resultado1.setText(Subt(num1B, num2B) + " i");
                        } else if(label.equals("Módulo")){
                            resultado.setText(String.valueOf(Modulo(num1A, num1B)));
                            resultado1.setText(" ");
                        }
                    } catch(Exception ex){
                        resultado.setText("Erro: Entrada inválida " + ex.getMessage());
                    }
                }
            });
        }
        frame.add(painel);
        frame.setVisible(true);
    }
}