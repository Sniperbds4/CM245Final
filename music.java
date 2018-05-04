/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FINALPROJECT;

import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;

/**
 *
 * @author Bryce Rush
 */
public class music {
    
    private ArrayList<String> musicFiles;
    private int currentSongIndex;
    
    public music(String... files){
        musicFiles = new ArrayList<String>();
        for(String file : files)
            musicFiles.add("./resources/audio/" + file + ".wav");
    }
    private void playSound(String fileName){
        try{
            File soundFile = new File(fileName);
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
            AudioFormat format = ais.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(ais);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-10);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run() {
        playSound(musicFiles.get(currentSongIndex));
    }
    public void stop(){
            clip.stop();
    }
}
