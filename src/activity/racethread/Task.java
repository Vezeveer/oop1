/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.racethread;

import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vezeveer
 */
public class Task implements Runnable {
    javax.swing.JProgressBar progressBar;
    Task(javax.swing.JProgressBar progressBar){
        this.progressBar = progressBar;
    }
    public void run() {
        //First Bar
        doIt(progressBar);
    }

    public void doIt(javax.swing.JProgressBar pb) {
        for (int i = 0; i <= 100; i++) {
            
            try {
                Thread.sleep(Math.abs(UUID.randomUUID().getMostSignificantBits() % 60));
            } catch (InterruptedException ex) {
                Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                pb.setValue(i);
                if (i == 100) {
                    // Check if first place is taken
                    if(!ThreadRace.first){
                        ThreadRace.first = true;
                        pb.setString("First!");
                        ThreadRace.lblResult.setText(Thread.currentThread().getName()+" is the WINNER!");
                    } 
                    // Check if 2nd place is taken
                    else if(!ThreadRace.second){
                        ThreadRace.second = true;
                        pb.setString("Second!");
                    }
                    // Check if 3rd place is taken
                    else if(!ThreadRace.third){
                        ThreadRace.third = true;
                        pb.setString("Third!");
                    }
                    
                    else if(!ThreadRace.fourth){
                        ThreadRace.fourth = true;
                        pb.setString("Fourth!");
                    }
                    
                    else if(!ThreadRace.fifth){
                        ThreadRace.fifth = true;
                        pb.setString("Fifth!");
                        // prevents double race
                        ThreadRace.isRunning = false;
                    }
                     
                }

            }

        }
    }
}
