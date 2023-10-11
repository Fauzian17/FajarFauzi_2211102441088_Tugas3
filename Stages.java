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
    private int rocketCounter = 0;
    private int rocketSpacing = 200;
    private static final int Max_rocket=3;
    public Stages()
    {    
        super(700, 500, 1);
        GreenfootImage img = new GreenfootImage("blue.jpg");
        this.setBackground(img);
        this.addObject(new burung(),400,200);
        this.getCellSize();
        
    }
    
    public void act(){
        int rocketCount= getObjects(rocket.class).size();
        if(Greenfoot.getRandomNumber(100)<2&&rocketCount<Max_rocket){
            addObject(new rocket(),getWidth(),Greenfoot.getRandomNumber(getHeight()));
        }
        
    }
    private void prepare()
    {
        Player player = new Player();
        addObject(player, 100, 300);

        rocket Rocket = new rocket();
    }
    
    void randomRocket(){
        rocket r = this.getObjects(rocket.class).get(0);
        for(int i=0; i<new Random().nextInt(4);i++){
        rocket rkt=new rocket();
        this.addObject(rkt,this.getWidth()-3,new Random().nextInt(this.getHeight()-1));
    }
    }
}
