/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S04_07;
    import javax.swing.JOptionPane;
/**
 *
 * @author Jeny
 */
public class S4_07_Ejercicio01 {
    public static void main (String[]args) {
        
        int numero = (int) (Math.random()*5);

        int numeroUsuario = 0;

        do {
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("ingresa un dato"));
            
           if (numeroUsuario == numero){
               System.out.println("Felicidades adivinaste el numero");
            } else{
               System.out.println("Numero incorrecto");
            }
       
           
        } while (numero != numeroUsuario);
        
        System.out.println("Felicidades adivinaste el numero");
    }
}

