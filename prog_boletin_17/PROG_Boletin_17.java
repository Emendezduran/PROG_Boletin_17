/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_boletin_17;

/**
 *
 * @author emendezduran
 */
public class PROG_Boletin_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //1er Ejercicio 
        
        Gato g1 = new Gato();
        Papagaio p1 = new Papagaio();
        
        
        g1.caminarCaminando();
        g1.nadarNadando();
        p1.caminarCaminando();
        
       //2do Ejercicio 
       
       Felino f1 = new Tigre();
       f1.caminarCaminando();
       f1.nadarNadando();
       
       Felino f2 = new Gato();
       f2.caminarCaminando();
       f2.nadarNadando();
       
       Aves a1 = new Avestruza();
       a1.caminarCaminando();
       
       Papagaio p2 = new Papagaio(); 
       p2.caminarCaminando();
       p2.volarVolando();
       
       Morcego m1 = new Morcego();
       m1.caminarCaminando();
       m1.volarVolando();
          
    }
    
}
