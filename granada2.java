import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class granada2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class granada2 extends Actor
{
    public int temp=30; 
    /**
     * Act - do whatever the granada2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        acertarAlvo();
    }
    
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation());
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x, y);
    }
     public void acertarAlvo(){
        Actor c = getOneIntersectingObject(soldado.class);
        if (c != null){
    
        Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
        counter.add(1);
            
            getWorld().removeObject(c);
            getWorld().removeObject(this);
            
        }
        if(temp<1){
            vitorialadrões world = new vitorialadrões();
            Greenfoot.setWorld(world);
        }
    }
}

