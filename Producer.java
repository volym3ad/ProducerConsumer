/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.very.simple;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer extends Thread{
    Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }
    
    public void run(){
        while(!interrupted()){
            queue.push( new Random().nextInt());
            try {
                sleep(10);
            } catch (InterruptedException ex) {
                return ;
            }
        }
    }
    
    
}
