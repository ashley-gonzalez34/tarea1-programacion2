
package tarea1progrados;
import java.util.Scanner;


public class TAREA1PROGRADOS {
    Scanner conver = new Scanner  (System.in);
    
    public  TAREA1PROGRADOS(){
        
        float preciodolar=0 ,dolares,quetzal,precioeuro,euros,quetzal1;
        
        
        Scanner nom = new Scanner (System.in);
        System.out.println("Hola Bienvenido ,que quisieras convertir en euros o dolares??!!!");
        System.out.println("Ingrese su  nombre...por favor ");
        String nomb = nom.nextLine();
       
        
        System.out.println("Ingrese el precio del dolar");
        preciodolar= conver.nextFloat();
        System.out.println("Ingrese el numero para convertir a dolares");
        dolares=conver.nextFloat();
        
        quetzal =dolares*preciodolar;
       
        System.out.println("Ingrese el precio del euro");
        precioeuro= conver.nextFloat();
        System.out.println("Ingrese el numero para convertir a euro");
        euros=conver.nextFloat();
        
        quetzal1 =euros*precioeuro;
        
        
        System.out.println("Su nombre es : "+ nomb );
        System.out.println(dolares+"los dolares equivalen a "+quetzal+" quetzales");
        System.out.println(euros+"los euros equivalen a "+quetzal1+" quetzales");
        
        
        
        
       
                
            }

    
    
    public static void main(String[] args) {
        TAREA1PROGRADOS solucion = new TAREA1PROGRADOS(); 
       
    }
    
}
