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
public class Dice20 {
    private int n;
    private Random rand=new Random();
    
    public Dice20(){
        this.n=rand.nextInt(20)+1;
    }
    
    public Dice20(int n){
        this.n=rand.nextInt(20)+1;
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