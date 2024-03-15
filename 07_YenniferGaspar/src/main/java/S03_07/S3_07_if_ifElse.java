/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S03_07;

/**
 *
 * @author Jeny
 */
public class S3_07_if_ifElse {
    public static void main(String[]args) {
        boolean a = false;
        int b = 5;
// if simple
    if (a) {
        System.out.println("hola");
    }
//if else
    if (a){
        System.out.println("ejecucion true");
    }else {
        System.out.println("ejecucion false");
    }   
    
    if(b == 10){
        System.out.println("b vale  10");
    }else if (b == 20){
        System.out.println("b vale  20");
    }else if (b == 30){
        System.out.println("b vale  30");
    }else{
        System.out.println("no cumple");
    }
    
    
    }
    
}

