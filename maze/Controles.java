import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controles extends World
{

    /**
     * Constructor for objects of class Controles.
     * 
     */
    public Controles()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,175,310);
        back.setLocation(84,334);
        back.setLocation(71,341);
    }
}
