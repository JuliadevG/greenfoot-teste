import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vitorialadrões here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vitorialadrões extends World
{

    /**
     * Constructor for objects of class vitorialadrões.
     * 
     */
    public vitorialadrões()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    public void act(){
    
    if(Greenfoot.isKeyDown("enter")){
        setBackground(new GreenfootImage("vitorialadrao.png"));
    }
    if(Greenfoot.isKeyDown("enter")){
            setBackground(new GreenfootImage("creditos.png"));
        }
    }
}

