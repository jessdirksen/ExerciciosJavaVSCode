package Exercicios29042024;
/*
 * Crie um algoritmo que recebe 2 números e multiplica o num1 pelo num2 através
de somas repetidas.(Exemplo:2 e 3 = 2 + 2 + 2 => 6)
https://atividadesenac.vercel.app/atividades.html#
 */

import javax.swing.JOptionPane;

public class exercicio03 {
    public static void main(String[] args) {
        
        int resultado = 0;

        String insert_valo1 = JOptionPane.showInputDialog("Insira o primeiro valor: ");
        int valor1 = Integer.parseInt(insert_valo1);

        String insert_valor2 = JOptionPane.showInputDialog("Insira o segundo valor: ");
        int valor2 = Integer.parseInt(insert_valor2);

        for (int i=0; i < valor2; i++){
            resultado += valor1;
            System.out.println(resultado);
        }
        
       



    }

}
