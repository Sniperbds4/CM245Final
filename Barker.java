/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Nicholas
 */
public class Barker {
    int currentHealth = 2147;
    int maxHealth = 2147;
    int wpnDmg = 2147;
    int critical = 10;
    int missRate = 1;
    
    public int getCurrentHealth(){
            return this.currentHealth;
        }
    public int setCurrentHealth(int value){
            return this.currentHealth = value;
        }
        
    public int getMaxHealth(){
            return this.maxHealth;
        }
    public int setMaxHealth(int value){
            return this.maxHealth = value;
        }
        
    public int getCritical(){
            return this.critical;
        }
    public int setCritical(int value){
            return this.currentHealth = value;
        } 
        
    public int getMissRate(){
            return this.missRate;
        }
    public int setMissRate(int value){
            return this.missRate = value;
}
}
