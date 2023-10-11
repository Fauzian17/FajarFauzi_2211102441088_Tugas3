import greenfoot.*;

public class musuh extends Actor
{
    private int kecepatan = 1; // Kecepatan pergerakan musuh

    public void act()
    {
    }

    private void tembakRoket()
    {
        rocket Rocket = new rocket();
        getWorld().addObject(Rocket, getX(), getY());
    }
}
