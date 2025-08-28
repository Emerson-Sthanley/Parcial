/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas.Notas;

/**
 *
 * @author emers
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
   

    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declarando la variable local
        double notas = 7.00;
        
        //Sistema secuencia para determinar la nota y el estado
        if(notas >= 0.00 && notas <6.99 ){
            System.out.println("La nota es de: " +notas + " por ende, el alumno esta Reprobado");
        }
        else if(notas > 7.00 && notas <= 7.99){
            System.out.println( + notas + ", por ende esta aprobado");
        }
        else if(notas >= 8.00 && notas <= 8.99){
            System.out.println("La nota es de: " +notas+ " por ende esta aprobado notablemente");
        }
        else if(notas >= 9.00 && notas <=10.00){
            System.out.println("La nota es de : " +notas+ " por ende esta aprobado con exelcencia");
        }
        else {
            System.out.println("VALOR INVALIDO, POR FAVOR SELECCIONE UNA VALOR NUMERICO ENTRE 0 Y 10");
        }
    }
    
}
