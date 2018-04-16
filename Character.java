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
public class Character{
    private int playerhp;
    private int maxhp;
    private int playermeleedmg;
    private int xp;
    private int level;
    private int miss;
    private int crit;

    public Character(){
        playerhp=20;
        maxhp=20;
        playermeleedmg=4;
        xp=0;
        level=1;
        crit=10;
        miss=1;
    }
    
    /**
     * @return the playerhp
     */
    public  int getPlayerhp() {
       // if(palyerhp>0)
            return playerhp;
       // else 
         //   throw new Exception ("You have died. Wish you were better at this.");
    }

    /**
     * @param aPlayerhp the playerhp to set
     */
    public  void setPlayerhp(int aPlayerhp) {
        playerhp = playerhp-aPlayerhp;
    }

    /**
     * @return the maxhp
     */
    public  int getMaxhp() {
        return maxhp;
    }

    /**
     * @param aMaxhp the maxhp to set
     */
    public  void setMaxhp(int aMaxhp) {
        maxhp = aMaxhp;
    }

    /**
     * @return the playermeleedmg
     */
    public  int getPlayermeleedmg() {
        return playermeleedmg;
    }

    /**
     * @param aPlayermeleedmg the playermeleedmg to set
     */
    public  void setPlayermeleedmg(int aPlayermeleedmg) {
        playermeleedmg = aPlayermeleedmg;
    }

    /**
     * @return the xp
     */
    public  int getXp() {
        return xp;
    }

    /**
     * @param aXp the xp to set
     */
    public  void setXp(int aXp) {
        xp = aXp;
    }

    /**
     * @return the Level
     */
    public  int getLevel() {
        return level;
    }

    /**
     * @param aLevel the Level to set
     */
    public  void setLevel(int aLevel) {
        level = aLevel;
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
