/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudo_guilherme;
import java.util.Scanner;
/**
 *
 * @author Maria Fiori
 */
public class Estudo_guilherme {

    public static void main(String[] args) {
     
        Scanner teclado = new  Scanner ( System.in );
        int idade;
        
        System.out.println("verifique se seu voto e obrigatorio ou facultativo");
        
        System.out.println("coloque sua idade:");
        idade = teclado.nextInt();
        
        if(idade<=15){
         System.out.println("voto proibido");
        } else if(idade >=18 && idade<=59){
             System.out.println("voto obrigatorio");
        }else{
            System.out.println("voto facultativo");
        }
        
    }
} 
    