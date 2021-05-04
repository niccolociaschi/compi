
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class controllo extends Thread {

    semaforo pieno;
    semaforo vuoto;
    uomo u;
   donna d;

    public controllo(semaforo pieno, semaforo vuoto, uomo u, donna d) {  // è il costruttore
        this.pieno = pieno;
        this.vuoto = vuoto;
        this.u = u;
        this.d = d;
    }
    public void run() {
        try {
            u.EntraBagno();  
            d.EntraBagno();  
            u.EsciBagno();   // fanno partire i metodi 
            d.EsciBagno();    
        } catch (InterruptedException ex) {
            Logger.getLogger(controllo.class.getName()).log(Level.SEVERE, null, ex);
  }
 }
}
}
