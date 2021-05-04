
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
public class semaforo {

    int val;

    public semaforo(int v) {  //è il costruttore
        this.val = v;
    }

    synchronized public void p() {
        while (val == 0) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        val--;
    }
    synchronized public void v() {
        val++;
        notify();
    }
}