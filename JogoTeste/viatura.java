import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class viatura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class viatura extends Actor
{
    
    GifImage mygif = new GifImage("viatura.gif");
    /**
     * Act - do whatever the viatura wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(mygif.getCurrentImage());
    }
}

