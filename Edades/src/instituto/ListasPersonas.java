package instituto;
/**
 * @author Adrian
 */
public class ListasPersonas {
    
    public double sumaEdad(Personas[] p){
        
        double sumEdad=0;
        
        for (Personas r:p){
            sumEdad=sumEdad+r.getEdad();
        }
     
        double resultado=sumEdad/p.length;
        return resultado;
        
    }
    
    public double edadMax(Personas[] p){
        
        double edadMax = 0;
        
        for (int i=0 ; i < p.length ; i++) {
           
         if(p[i].getEdad()>edadMax){
            edadMax = p[i].getEdad();
            } 
        
        }
        
        return edadMax;
     
    }
       
}

