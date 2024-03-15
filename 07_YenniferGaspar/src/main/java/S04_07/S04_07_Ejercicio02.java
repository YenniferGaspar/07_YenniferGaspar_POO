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
public class S04_07_Ejercicio02 {
    
    
    public static void main (String[]args) {
        
        int numeroHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tus numeros de horas"));
       
        if(numeroHoras > 8){
            System.out.println("trabajaste mas de 8 horas");
            int horasExtras = numeroHoras =8;
            int sueldoTotal = 80+ ( horasExtras * 10);
            
            System.out.println("ttus horas extras son: " + horasExtras);
            System.out.println("tu sueldo extra es: " + (horasExtras * 10));
            System.out.println("tu sueldo es: " + sueldoTotal);
       }else{
           System.out.println("tu sueldo es: " + (numeroHoras * 10));
       }
       
       

    }
}
