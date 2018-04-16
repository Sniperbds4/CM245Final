/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

/**
 *
 * @author Capiton
 */
public class Boss {

    private int hp;
    private int dmg;
    private int miss;
    private int crit;

    public Boss(int area) {
        switch (area) {
            case 4:
                hp = 35;
                dmg = 6;
                break;
            case 5:
                hp = 80;
                dmg = 8;
                break;
            case 6:
                hp = 120;
                dmg = 10;
                break;
            case 7:
                hp = 4000;
                dmg = 12;
                break;
        }
        miss=2;
        crit=9;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = this.hp-hp;
    }

    /**
     * @return the dmg
     */
    public int getDmg() {
        return dmg;
    }

    /**
     * @param dmg the dmg to set
     */
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    /**
     * @return the miss
     */
    public int getMiss() {
        return miss;
    }

    /**
     * @param miss the miss to set
     */
    public void setMiss(int miss) {
        this.miss = miss;
    }

    /**
     * @return the crit
     */
    public int getCrit() {
        return crit;
    }

    /**
     * @param crit the crit to set
     */
    public void setCrit(int crit) {
        this.crit = crit;
    }
}
