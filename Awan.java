import greenfoot.*;

public class awan extends Properti{
    public void act(){
        setLocation(getX(),getY()+1);
        if(isAtEdge())
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
    }
}