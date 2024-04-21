import javax.swing.JOptionPane;

public class Exercicio01lista17042024 {
    /*
     * Faca um algoritmo que leia o nome e as tres notas de um aluno e ao final, escreva o seu nome, 
     * sua media e se ele foi aprovado. Media de aprovacao igual a 8.
     */
public static void main(String[] args) {
    
    double primeiranota = 0;
    double segundanota = 0;
    double terceiranota = 0;
    double media = 0;

    String nomeAluno = JOptionPane.showInputDialog("Insira o nome do aluno");

    String nota1 = JOptionPane.showInputDialog("Insira a primeira nota: ");
    //convertendo a primeira nota para double
    double nota1d = Double.parseDouble(nota1);
    //validação da primeira nota
    if (nota1d > 10) {
        JOptionPane.showMessageDialog(null, "Insira uma nota que tenha valor até 10!");
        //nova variavel nota 1
        String nota1s = JOptionPane.showInputDialog("Insira novamente a primeira nota: ");
        //nova nota inserida entra em nova variavel e convertendo
        double nota1dvalida = Double.parseDouble(nota1s);
        primeiranota = nota1dvalida;  
    } else{
        primeiranota = nota1d;
    }


    String nota2 = JOptionPane.showInputDialog("Insira a segunda nota: ");
    //convertendo a segunda nota para double
    double nota2d = Double.parseDouble(nota2);
    //validação da segunda nota
    if (nota2d > 10){
        JOptionPane.showMessageDialog(null, "Insira uma nota que tenha valor até 10!");
        //segunda nova nota entra em uma nova variavel
        String nota2s = JOptionPane.showInputDialog("Insira novamente a segunda nota: ");
        double nota2dvalida = Double.parseDouble(nota2s);
        segundanota = nota2dvalida;
    } else {
        segundanota = nota2d;
    }
    

    String nota3 = JOptionPane.showInputDialog("Insira a terceira nota: ");
    //convertendo a terceira nota para double
    double nota3d = Double.parseDouble(nota3);
    //validação da terceira nota
    if (nota3d > 10) {
        JOptionPane.showMessageDialog(null, "Insira uma nota que tenha valor até 10!");
        //terceira nova nota entra em uma nova variavel
        String nota3s = JOptionPane.showInputDialog(null, "Insira novamente a terceira nota: ");
        double nota3dvalida = Double.parseDouble(nota3s);
        terceiranota = nota3dvalida;
    } else {
        terceiranota = nota3d;
    }
    media = (primeiranota+segundanota+terceiranota)/3;
    System.out.println(media);
    if (media >= 8){
        JOptionPane.showMessageDialog(null, "Aluno " + nomeAluno + " com média " + media + " foi aprovado!");
    } else {
        JOptionPane.showMessageDialog(null, "Aluno " + nomeAluno + " com média " + media + " foi reprovado!");
    }
}
}
