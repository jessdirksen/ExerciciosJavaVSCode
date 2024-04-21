
import javax.swing.JOptionPane;

public class Exercicio02lista17042024 {
    /*
     * Faca um algoritmo que leia tres numeros digitados, e os coloque em ordem crescente.
     */
    public static void main(String[] args) {

        String numero1 = JOptionPane.showInputDialog("Insira o primeiro número");
        double numero1digitado = Double.parseDouble(numero1);

        String numero2 = JOptionPane.showInputDialog("Insira o segundo número");
        double numero2digitado = Double.parseDouble(numero2);

        String numero3 = JOptionPane.showInputDialog("Insira o terceiro número");
        double numero3digitado = Double.parseDouble(numero3);

        //primeira comparação
        if (numero1digitado < numero2digitado && numero1digitado < numero3digitado && numero2digitado < numero3digitado){
            System.out.println(numero1digitado);
            System.out.println(numero2digitado);
            System.out.println(numero3digitado);
        


            //segunda comparação
        } else if (numero1digitado < numero2digitado && numero1digitado < numero3digitado && numero3digitado < numero2digitado){
            System.out.println(numero1digitado);
            System.out.println(numero3digitado);
            System.out.println(numero2digitado);

                //terceira comparação
            } else if (numero2digitado < numero1digitado && numero2digitado < numero3digitado && numero1digitado < numero3digitado){
                System.out.println(numero2digitado);
                System.out.println(numero1digitado);
                System.out.println(numero3digitado);

                //quarta comparação
                } else if (numero2digitado < numero1digitado && numero2digitado < numero3digitado && numero3digitado < numero1digitado){
                    System.out.println(numero1digitado);
                    System.out.println(numero3digitado);
                    System.out.println(numero1digitado);

                    //quinta comparação
                    } else if (numero3digitado < numero2digitado && numero3digitado < numero1digitado && numero1digitado < numero2digitado){
                        System.out.println(numero3digitado);
                        System.out.println(numero1digitado);
                        System.out.println(numero2digitado);

                        //sexta comparação
                        } else if (numero3digitado < numero2digitado && numero3digitado < numero1digitado && numero2digitado <
                         numero1digitado){
                            System.out.println(numero3digitado);
                            System.out.println(numero2digitado);
                            System.out.println(numero1digitado);
                        }
                        
        }

        
     }