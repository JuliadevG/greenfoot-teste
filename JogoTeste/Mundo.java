import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound ("bellaciao.mp3");
    
    public void started()
    {
    bgMusic.playLoop();
    }
    public void stopped()
    {
    bgMusic.pause();
    }   

    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        started();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        ladrão ladrão = new ladrão();
        addObject(ladrão,211,367);
        soldado soldado = new soldado();
        addObject(soldado,559,360);
        soldado.setLocation(391,388);
        soldado.setLocation(375,389);
        soldado.setLocation(594,323);

        ladrão.setLocation(516,341);
        soldado.setLocation(387,351);

        ladrão.setLocation(597,325);
        removeObject(ladrão);
        soldado.setLocation(568,284);
        removeObject(soldado);
        ladrão ladrão2 = new ladrão();
        addObject(ladrão2,226,369);
        soldado soldado2 = new soldado();
        addObject(soldado2,580,350);
        Counter counter = new Counter();
        addObject(counter,221,32);
        Counter2 counter2 = new Counter2();
        addObject(counter2,511,35);
        ladrão2.setLocation(370,170);
        ladrão2.setLocation(258,402);
        ladrão2.setLocation(228,418);
        ladrão2.setLocation(133,536);
        soldado2.setLocation(623,538);
        counter.setLocation(111,36);
        counter2.setLocation(664,42);
        ladrão2.setLocation(156,420);
        soldado2.setLocation(634,432);
        soldado2.setLocation(634,428);
        counter2.setLocation(680,33);

        viatura viatura = new viatura();
        addObject(viatura,727,572);
        soldado2.setLocation(721,352);
        ladrão2.setLocation(88,374);
        soldado2.setLocation(677,400);
    }
}
