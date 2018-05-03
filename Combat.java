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
public class Combat {

    private boolean fighting;
    private int area;
    private int pHP;
    private int pDMG;
    private int pMiss;
    private int pCrit;
    private int eHP;
    private int eDMG;
    private int eMiss;
    private int eCrit;
    

    public Combat() {
    }

    public Combat(Character c, int x, int y) {
        if (x > 0 && x < 4) {
            area = 1;
        } else if (x > 10 && x < 6) {
            area = 2;
        } else if (y > 3 && y < 7) {
            area = 3;
        } else if (x < 1) {
            area = 4;
        } else if (x > 9) {
            area = 5;
        } else if (y < 1) {
            area = 6;
        } else {
            area = 7;
        }
        if (area <= 3) {
            Enemy e = new Enemy(area);
            this.eHP = e.getHp();
            this.eDMG = e.getDmg();
            this.eMiss = e.getMiss();
            this.eCrit = e.getCrit();
        } else {
            Boss e = new Boss(area);
            this.eHP = e.getHp();
            this.eDMG = e.getDmg();
            this.eMiss = e.getMiss();
            this.eCrit = e.getCrit();
        }
        this.pHP = c.getPlayerhp();
        this.pDMG = c.getPlayermeleedmg();
        this.pMiss = c.getMiss();
        this.pCrit = c.getCrit();
        this.fighting = true;
    }

    public boolean Attack() throws Exception {
        eHP =-pDMG * damageMod(eMiss, pCrit);
        if (eHP <= 0) {
            return false;
        } 
        pHP=-eDMG*damageMod(pMiss,eCrit);
        if(pHP<=0){
            throw new Exception ("You have died. Wish you were better at this.");
        }
        else{
            //c.setPlayerhp(pHP);
            return true;
        }
    }
    
    public boolean Item() throws Exception{
        System.out.print("You can't use items.");
        pHP=-eDMG*damageMod(pMiss,eCrit);
        if(pHP<=0){
            throw new Exception ("You have died. Wish you were better at this.");
        }
        return true;
    }
    
    public boolean Run() throws Exception{
        System.out.print("You can't run from a fight.");
        pHP=-eDMG*damageMod(pMiss,eCrit);
        if(pHP<=0){
            throw new Exception ("You have died. Wish you were better at this.");
        }
        return true;
    }

    public int damageMod(int missVal, int critVal) {
        Random ran = new Random();
        int damageMult = 1;
        int val = (ran.nextInt(10) + 1);
        if (val <= missVal) {
            damageMult = 0;
        }
        if (val >= critVal) {
            damageMult = 2;
        }
        return damageMult;
    }
}
