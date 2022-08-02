import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaInicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaInicio extends World
{

    /**
     * Constructor for objects of class PantallaInicio.
     * 
     */
    public PantallaInicio()
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
        play play = new play();
        addObject(play,392,331);
        play.setLocation(360,337);
        options options = new options();
        addObject(options,56,301);
        options.setLocation(70,347);
        options.setLocation(70,311);
        options.setLocation(65,338);
        play.setLocation(364,301);
        play.setLocation(367,276);
        play.setLocation(360,309);
        play.setLocation(365,311);
        play.setLocation(362,313);
        play.setLocation(428,279);
        play.setLocation(407,289);
        play.setLocation(357,303);
    }
}
