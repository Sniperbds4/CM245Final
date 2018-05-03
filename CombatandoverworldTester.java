/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class CombatandoverworldTesterRandall{

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int xcoordNew, ycoordNew, xcoordOld, ycoordOld;
        xcoordNew = ycoordNew = 0;
        xcoordOld = 5;
        ycoordOld = 2;
        Character c = new Character();
        REncounter ran = new REncounter();
        movement movetest = new movement(3, 3, xcoordOld, ycoordOld);
        CombatPanel test = new CombatPanel();
        OverworldPanel[][] optest = new OverworldPanel[11][8];
        for (int k = 0; k < 11; k++) {
            for (int j = 0; j < 8; j++) {
                optest[k][j] = new OverworldPanel(k, j);
            }
        }
        JFrame frame = new JFrame("We made this in a month.exe");
        boolean isincombat = ran.ranEncounter(xcoordNew, ycoordNew);
        frame.setSize(672, 672);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        try {
            if (isincombat == true) {
                Combat bat = new Combat(c, xcoordNew, ycoordNew);
                JLabel character = new JLabel(new ImageIcon("C:\\Users\\Colton\\Documents\\NetBeansProjects\\CM245\\src\\cm245\\resources\\characterFront.png"));
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
                                frame.validate();
                                frame.repaint();
                                System.out.println(" " + movetest.getRoomX() + " " + movetest.getRoomY() + " ");
                                System.out.println(" " + movetest.getX() + " " + movetest.getY() + " ");
                                frame.requestFocus();
                                break;
                            }
                            case 37: {
                                frame.remove(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                movetest.moveLeft(optest[movetest.getRoomX()][movetest.getRoomY()].getWExit());
                                frame.add(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                character.setBounds((movetest.getX()) * 96, (movetest.getY()) * 96, 96, 96);
                                frame.validate();
                                frame.repaint();
                                System.out.println(" " + movetest.getRoomX() + " " + movetest.getRoomY() + " ");
                                System.out.println(" " + movetest.getX() + " " + movetest.getY() + " ");
                                frame.requestFocus();
                                break;
                            }
                            case 39: {
                                frame.remove(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                movetest.moveRight(optest[movetest.getRoomX()][movetest.getRoomY()].getEExit());
                                frame.add(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                character.setBounds((movetest.getX()) * 96, (movetest.getY()) * 96, 96, 96);
                                frame.validate();
                                frame.repaint();
                                System.out.println(" " + movetest.getRoomX() + " " + movetest.getRoomY() + " ");
                                System.out.println(" " + movetest.getX() + " " + movetest.getY() + " ");
                                frame.requestFocus();
                                break;
                            }
                            case 40: {
                                frame.remove(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                movetest.moveDown(optest[movetest.getRoomX()][movetest.getRoomY()].getSExit());
                                frame.add(optest[movetest.getRoomX()][movetest.getRoomY()].getpanel());
                                character.setBounds((movetest.getX()) * 96, (movetest.getY()) * 96, 96, 96);
                                frame.validate();
                                frame.repaint();
                                System.out.println(" " + movetest.getRoomX() + " " + movetest.getRoomY() + " ");
                                System.out.println(" " + movetest.getX() + " " + movetest.getY() + " ");
                                frame.requestFocus();
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
}
