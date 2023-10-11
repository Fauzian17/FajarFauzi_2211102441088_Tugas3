import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket extends Actor
{
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void roket(){
        GreenfootImage newImage= new GreenfootImage("rckt.png");
        int lebar=50;
        int tinggi=50;                               
        newImage.scale(lebar,tinggi);
        setImage(newImage);
    }
    
    private int speed=2;
    private int xMin = 50;
    private int xMax = 750;
    private boolean keKanan = false;
    public void act()
    {
        // Add your action code here.
        roket();
        
         if (keKanan) {
            move(speed); 
        } else {
            move(-speed); 
        }

        if (getX() <= xMin || getX() >= xMax) {
            keKanan = !keKanan;
        }
        if (getX() >= getWorld().getWidth()-1)
        {
            getWorld().removeObject(this);
        }
    }
}