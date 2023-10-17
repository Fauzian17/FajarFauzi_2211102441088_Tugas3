import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class burung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class burung extends Player
{
    /**
     * Act - do whatever the burung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public burung(){
    GreenfootImage brg=new GreenfootImage("brg1.png");
    int lebar=60;
    int tinggi=60;
    brg.scale(lebar,tinggi);
    setImage(brg);
    }
    
    int lastNumberNo=1;
    int animationDelay=10;
    void animate(){
        if(animationDelay<10){
            animationDelay++;
            return;
        }
        
        animationDelay=0;
        if(lastNumberNo==9){
            lastNumberNo = 1;
        }else{
            lastNumberNo++;
        }
        GreenfootImage newImage=new GreenfootImage("brg"+lastNumberNo+".png");
        int lebar=60;
        int tinggi=60;                               ;
        newImage.scale(lebar,tinggi);
        setImage(newImage);
    }
    
    private int speed=2;
    public void act()
    {
        // Add your action code here.
        animate();
        
         // Gerakkan burung berdasarkan input pengguna
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + speed);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
        }
        if(isTouching(rocket.class)){
            Greenfoot.stop();
        }
    }
}
