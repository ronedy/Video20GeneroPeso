


package Video20GeneroKev;

import java.util.*;
import javax.swing.JOptionPane;

public class Genero {
    
    public void hacer(){
        
        String genero = ""; //se inicializa para evitar errores
        
        do{
           
            genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
            
        }
        while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        //se repetia hasta que ponia el caso bueno
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Tu altura en centímetros: "));
        
        int pesoideal = 0; //se inicializa con 0 tambien
        
        if(genero.equalsIgnoreCase("H")){
            
            pesoideal = altura-110;
            
        }else if(genero.equalsIgnoreCase("M")){
            
            pesoideal = altura-120;
        }
        
        System.out.println("Tu peso ideal es de " + pesoideal);
    }
}
