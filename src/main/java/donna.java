
import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class donna {

    semaforo vuoto; //inizializzi

    public donna(semaforo vuoto) {  //è il costruttore
        this.vuoto = vuoto;
    }

    public void EntraBagno() throws InterruptedException {
        vuoto.p();  
        System.out.println("una donna sta occupando un postoin bagno");
        sleep(7000); //lo mette in attesa
    }

    public void EsciBagno() {
        vuoto.v();  // lascia andare il thread
        System.out.println("Una donna ha lasciato il posto in bagno");
    }
}