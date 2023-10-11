import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Awan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Awan extends Properti
{
    /**
     * Act - do whatever the Awan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Awan(){
        Random rnd=new Random();
        this.setImage("awan"+rnd.nextInt(3)+"png");
    }
    public void act()
    {
        this.setLocation(this.getX()-1,this.getY());
        move(2);
    }
}
