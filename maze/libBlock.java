import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class libBlock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class libBlock extends Actor
{
    /**
     * Act - do whatever the libBlock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Se indica las dimensiones que tendra el objeto
    public libBlock()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/5;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
