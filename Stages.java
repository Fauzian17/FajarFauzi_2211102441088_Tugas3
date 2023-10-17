import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Stages here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stages extends World
{

    /**
     * Constructor for objects of class Stages.
     * 
     */
    private int Counter = 0;
    private int Spacing = 200;
    private static final int Max=3;
    public Stages()
    {    
        super(1000, 600, 1);
        GreenfootImage img = new GreenfootImage("blue.jpg");
        this.setBackground(img);
        this.addObject(new burung(),400,200);
        this.getCellSize();
        
    }
    
    public void act(){
        int rocketCount= getObjects(rocket.class).size();
        if(Greenfoot.getRandomNumber(100)<2&&rocketCount<Max){
            addObject(new rocket(),getWidth(),Greenfoot.getRandomNumber(getHeight()));
        }
        int awanCount= getObjects(awan.class).size();
        if(Greenfoot.getRandomNumber(100)<2&&awanCount<Max){
            addObject(new awan(),Greenfoot.getRandomNumber(200),1);
        }
        int green_rocketCoun=getObjects(green_rocket.class).size();
        if(Greenfoot.getRandomNumber(100)<2&&green_rocketCoun<Max){
            addObject(new green_rocket(),getWidth(),Greenfoot.getRandomNumber(getHeight()));
        }
        
    }
    private void prepare()
    {
        Player player = new Player();
        addObject(player, 100, 300);
        
        rocket Rocket = new rocket();
        green_rocket Rkt = new green_rocket();
        
        
    
    }
    
    void randomRocket(){
        rocket r = this.getObjects(rocket.class).get(0);
        for(int i=0; i<new Random().nextInt(4);i++){
        rocket rkt=new rocket();
        this.addObject(rkt,this.getWidth()-3,new Random().nextInt(this.getHeight()-1));
    }
    }
    void randomawan(){
        awan aw = this.getObjects(awan.class).get(0);
        for(int i=0; i<new Random().nextInt(4);i++){
        rocket rkt=new rocket();
        this.addObject(aw,this.getWidth()-3,new Random().nextInt(this.getHeight()-1));
        }
    }
     void randomGreenRocket(){
        green_rocket r = this.getObjects(green_rocket.class).get(0);
        for(int i=0; i<new Random().nextInt(4);i++){
        green_rocket Rkt=new green_rocket();
        this.addObject(Rkt,this.getWidth()-3,new Random().nextInt(this.getHeight()-1));
    }
    }
}

