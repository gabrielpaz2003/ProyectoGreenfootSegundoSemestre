import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back extends Actor
{
    /**
     * Act - do whatever the back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public back()
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
            Greenfoot.setWorld(new PantallaInicio());
        }
    }
}
