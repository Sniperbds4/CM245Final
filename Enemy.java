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
public class Enemy {

    private static int hp;
    private static int dmg;
    private int miss;
    private int crit;

    public Enemy(int area) {
        switch (area) {
            case 1:
                hp = 5;
                dmg = 1;
                break;
            case 2:
                hp = 10;
                dmg = 3;
                break;
            case 3:
                hp = 15;
                dmg = 5;
                break;
        }
        miss=1;
        crit=10;
    }

    /**
     * @return the hp
     */
    public static int getEnemyhp() {
        return hp;
    }

    /**
     * @return the dmg
     */
    public static int getEnemymeleedmg() {
        return dmg;
    }

    /**
     * @param aEnemyhp the hp to set
     */
    public static void setEnemyhp(int aEnemyhp) {
        hp = hp-aEnemyhp;
    }

    /**
     * @param aEnemymeleedmg the dmg to set
     */
    public static void setEnemymeleedmg(int aEnemymeleedmg) {
        dmg = aEnemymeleedmg;
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
