package instituto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Adrian
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner ent = new Scanner(System.in);
     
       String Nombre;
       double edad;
       boolean res=true;
       
        System.out.println("Ingrese los elementos del arreglo:");
        int valor = ent.nextInt();
      
 
       Personas[] lista = new Personas[valor];
       Personas p =new Personas();
       
     while(res){
         for (int i=0 ; i < valor ; i++){
       
        System.out.println("Ingrese el nombre");
        Nombre=ent.next();
        System.out.println("Ingrese la edad");
        edad = ent.nextDouble();
        
        p.setNombre(Nombre);
        p.setEdad(edad);
        
        lista[i]=p;
         
        } 
      
      ListasPersonas lp = new ListasPersonas();
      
      System.out.println("La edad maxima es: "+lp.edadMax(lista));
      
      double resultado=lp.sumaEdad(lista);
      System.out.println("El Promedio es: "+resultado);
      
         System.out.println("Desea realizar una nueva accion");
         System.out.println("1 = si ; 0 = no");
         int val=ent.nextInt();
         if (val==0){
            res=false;
         }
     }
   }
          
}
