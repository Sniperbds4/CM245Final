package FINALPROJECT.graphics;

import FINALPROJECT.game.Game;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.image.VolatileImage;
import javafx.stage.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryce Rush
 */
public class Renderer {
    
    private static Frame frame;
    private static Canvas canvas;
    
    private static int canvasWidth = 0;
    private static int canvasHeight = 0;
    
    private static final int GAME_WIDTH = 1200;
    private static final int GAME_HEIGHT = 750;
    
    private static int gameWidth = 0;
    private static int gameHeight = 0;
    
    private static void getBestSize () {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        
        boolean done = false;
        
        while(!done) {
            canvasWidth += GAME_WIDTH;
            canvasHeight += GAME_HEIGHT;
            
            if(canvasWidth > screenSize.width || canvasHeight > screenSize.height) {
                canvasWidth -= GAME_WIDTH;
                canvasHeight -= GAME_HEIGHT;
                done = true;
            }
        }
        
        int xDiff = screenSize.width = canvasWidth;
        int yDiff = screenSize.height = canvasHeight;
        int factor = canvasWidth / GAME_WIDTH;
        
        gameWidth = canvasWidth / factor + xDiff / factor;
        gameHeight = canvasHeight / factor + yDiff / factor;
        
        canvasWidth = gameWidth * factor;
        canvasHeight = gameHeight * factor;
        
       // System.out.println("gameSize: " + gameWidth + "x" + gameHeight)
        
    }
    private static void makeFullscreen () {
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = env.getDefaultScreenDevice();
        
        if(gd.isFullScreenSupported()) {
            frame.setUndecorated(true);
            gd.setFullScreenWindow(frame);
        }
    }
    
    public static void init() {
        getBestSize();
        
        frame = new Frame();
        canvas = new Canvas();
        
        canvas.setPreferredSize(new Dimension(canvasWidth, canvasHeight));
        
        frame.add(canvas);
        
        makeFullscreen();
        
        frame.pack();
//        frame.setResizeable(false);
        frame.setLocationRelativeTo(null);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                Game.quit();
                }
            }); 
        frame.setVisible(true);
        
        startRendering();
        
        }
    private static void startRendering() {
        Thread thread = new Thread() {
            @Override
            public void run () {
                
                GraphicsConfiguration gc = canvas.getGraphicsConfiguration();
                VolatileImage vImage = gc.createCompatibleVolatileImage(gameWidth, gameHeight);
                
                while(true) {
                    if (vImage.validate(gc) == VolatileImage.IMAGE_INCOMPATIBLE) {
                        vImage = gc.createCompatibleVolatileImage(gameWidth, gameHeight);
                    }
                    
                    Graphics g = vImage.getGraphics();
                    
                    g.setColor(Color.black);
                    g.fillRect(0, 0, gameWidth, gameHeight);
                    
                    //RENDER SHIT
                    
                    g.dispose();
                    
                    g = canvas.getGraphics();
                    g.drawImage(vImage, 0, 0, canvasWidth, canvasHeight, null);
                    
                    g.dispose();
                }
            }
            
        };
        thread.setName("Render Thread");
        thread.start();
    }
    
    }

