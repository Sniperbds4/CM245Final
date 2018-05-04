/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm245.master;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class CombatandoverworldTester{
    public static movement movetest = new movement(3, 3, 5, 2);
    public static void main(String args[]) {
        ImageIcon front = new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\characterFront.png");
        ImageIcon left = new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\characterLeft.png");
        ImageIcon right = new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\characterRight.png");
        ImageIcon back = new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\characterBack.png");
        Scanner input = new Scanner(System.in);
        int xcoordNew, ycoordNew, xcoordOld, ycoordOld;
        xcoordNew = ycoordNew = 0;
        xcoordOld = 5;
        ycoordOld = 2;
        Character c = new Character();
        
        //movement movetest = new movement(3, 3, xcoordOld, ycoordOld);
        CombatPanel test = new CombatPanel();
        OverworldPanel[][] optest = new OverworldPanel[11][8];
        for (int k = 0; k < 11; k++) {
            for (int j = 0; j < 8; j++) {
                optest[k][j] = new OverworldPanel(k, j);
            }
        }
        JFrame frame = new JFrame("We made this in a month.exe");
        boolean isincombat = false;
        frame.setSize(672, 672);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        try {
            if (isincombat == false) {
                Combat bat = new Combat(c, xcoordNew, ycoordNew);
                JLabel character = new JLabel(front);
                frame.add(character);
                character.setBounds((movetest.getX()) * 96, (movetest.getY()) * 96, 96, 96);
                frame.add(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                frame.requestFocus();
                frame.addKeyListener(new KeyListener() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        switch (e.getKeyCode()) {
                            case 38: {
                                frame.remove(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                movetest.moveUp(optest[movetest.getRoomX()][movetest.getRoomY()].getNExit());
                                frame.add(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                character.setBounds((movetest.getX()) * 96, (movetest.getY()) * 96, 96, 96);
                                character.setIcon(back);
                                frame.validate();
                                frame.repaint();
                                System.out.println(" " + movetest.getRoomX() + " " + movetest.getRoomY() + " ");
                                System.out.println(" " + movetest.getX() + " " + movetest.getY() + " ");
                                frame.requestFocus();
                                boolean combat = encCheck(movetest.getRoomX(), movetest.getRoomY());
                                if (combat == true){
                                    String[] yes = new String[2];
                                    CombatPanelTester.main(yes);
                                }
                                break;
                            }
                            case 37: {
                                frame.remove(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                movetest.moveLeft(optest[movetest.getRoomX()][movetest.getRoomY()].getWExit());
                                frame.add(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                character.setBounds((movetest.getX()) * 96, (movetest.getY()) * 96, 96, 96);
                                character.setIcon(left);
                                frame.validate();
                                frame.repaint();
                                System.out.println(" " + movetest.getRoomX() + " " + movetest.getRoomY() + " ");
                                System.out.println(" " + movetest.getX() + " " + movetest.getY() + " ");
                                frame.requestFocus();
                                boolean combat = encCheck(movetest.getRoomX(), movetest.getRoomY());
                                if (combat == true){
                                    String[] yes = new String[2];
                                    CombatPanelTester.main(yes);
                                }
                                break;
                            }
                            case 39: {
                                frame.remove(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                movetest.moveRight(optest[movetest.getRoomX()][movetest.getRoomY()].getEExit());
                                frame.add(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                character.setBounds((movetest.getX()) * 96, (movetest.getY()) * 96, 96, 96);
                                character.setIcon(right);
                                frame.validate();
                                frame.repaint();
                                System.out.println(" " + movetest.getRoomX() + " " + movetest.getRoomY() + " ");
                                System.out.println(" " + movetest.getX() + " " + movetest.getY() + " ");
                                frame.requestFocus();
                                boolean combat = encCheck(movetest.getRoomX(), movetest.getRoomY());
                                if (combat == true){
                                    String[] yes = new String[2];
                                    CombatPanelTester.main(yes);
                                }
                                break;
                            }
                            case 40: {
                                frame.remove(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                movetest.moveDown(optest[movetest.getRoomX()][movetest.getRoomY()].getSExit());
                                frame.add(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                character.setBounds((movetest.getX()) * 96, (movetest.getY()) * 96, 96, 96);
                                character.setIcon(front);
                                frame.validate();
                                frame.repaint();
                                System.out.println(" " + movetest.getRoomX() + " " + movetest.getRoomY() + " ");
                                System.out.println(" " + movetest.getX() + " " + movetest.getY() + " ");
                                frame.requestFocus();
                                boolean combat = encCheck(movetest.getRoomX(), movetest.getRoomY());
                                if (combat == true){
                                    String[] yes = new String[2];
                                    CombatPanelTester.main(yes);
                                }
                                break;
                            }
                        }
                    }

                    @Override
                    public void keyTyped(KeyEvent e) {
                    }

                    @Override
                    public void keyReleased(KeyEvent e) {
                    }
                }
                );
            } else {
                frame.remove(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                frame.add(test.panel);
                frame.requestFocus();
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static boolean encCheck(int x, int y){
        boolean check = rEncounter.ranEncounter(x, y);
        return check;
    }
}
