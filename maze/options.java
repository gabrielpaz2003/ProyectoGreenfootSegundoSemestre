import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class options here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class options extends Actor
{
    /**
     * Act - do whatever the options wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public options()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    
    public void act()
    {
        if (Greenfoot.mouseClicked(null))
        {
            Greenfoot.setWorld(new Controles());
        }
    }
}
