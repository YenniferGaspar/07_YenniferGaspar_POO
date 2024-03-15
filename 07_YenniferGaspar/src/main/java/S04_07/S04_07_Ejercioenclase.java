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
public class S04_07_Ejercioenclase {

    public static void main(String[] args) {
        
        // Variables 
        int A , B;

        A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        // Verificar si los números son pares o impares
        
         if (A % 2 == 0 && B % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Ambos números son pares.");
        } else if (A % 2 != 0 && B % 2 != 0) {
            JOptionPane.showMessageDialog(null, "Ambos números son impares.");
        } else if (A % 2 == 0 && B % 2 != 0) {
            JOptionPane.showMessageDialog(null, "El primer número es par y el segundo número es impar.");
        } else {
            JOptionPane.showMessageDialog(null, "El primer número es impar y el segundo número es par.");
        }

    }
}
