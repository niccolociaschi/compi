
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
public class uomo {

    semaforo pieno;

    public uomo(semaforo pieno) {  //è il Costruttore
        this.pieno = pieno;
    }

    public void EntraBagno() throws InterruptedException { 
        pieno.p(); 
        System.out.println("Un uomo ha occupato il posto in bagno ");
        sleep(7000); //lo mette in attesa
    }

    public void EsciBagno() {
        pieno.v(); // lo lascia andare
        System.out.println("Un uomo ha lasciato libero il poato in bagno ");
    }

