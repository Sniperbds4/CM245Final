/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.util.Random;

/**
 *
 * @author Capiton
 */
public class Dice12 {
    private int n;
    private Random rand=new Random();
    
    public Dice12(){
        this.n=rand.nextInt(12)+1;
    }
    
    public Dice12(int n){
        this.n=rand.nextInt(12)+1;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }
}