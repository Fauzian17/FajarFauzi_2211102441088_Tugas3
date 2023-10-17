import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class green_rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class green_rocket extends rocket
{
    /**
     * Act - do whatever the green_rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void rocket(){
        GreenfootImage newImage= new GreenfootImage("rokt.png");
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
        rocket();
        
         if (keKanan) {
            move(speed); 
        } else {
            move(-speed); 
        }
        
        setLocation(getX(),getY()+1);
        if(isAtEdge())
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),2);
    
    }
}
