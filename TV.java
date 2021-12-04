/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment.pkg1;

/**
 *
 * @author DELL
 */
public class TV {
    
    int channel;
    int volumeLevel;
    boolean on;
    
    public TV(){
    }
    
    public void turnOn(){
        on =true;
    }
    
     public void turnOff(){
        on =false;
    }
    
    public void setVolume(int newVolumeLevel){
    
        if (newVolumeLevel >= 1 && newVolumeLevel <= 7){
            volumeLevel = newVolumeLevel;
        }
    } 
    public void setChanenl(int newChannel){
        
        if  (newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }  
    }
    public void channelUp(){
        if (channel < 120)
            
            channel++;
        else 
            System.out.println("Last Channel");
    }
     public void channelDown(){
        if (channel > 1)
            
            channel--;
        else 
            System.out.println("First Channel");
    }
     public void volumeUp(){
        if (volumeLevel < 7)
            
            volumeLevel++;
        else 
            System.out.println("max volume");
    }
     public void volumeDown(){
        if (volumeLevel > 1)
            
            volumeLevel--;
        else 
            System.out.println("min volume");
    }
}
