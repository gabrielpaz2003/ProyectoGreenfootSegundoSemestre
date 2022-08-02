import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class youLose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class youLose extends Actor
{
    /**
     * Act - do whatever the youLose wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public youLose()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/1;
        int myNewWidth = (int)myImage.getWidth()/2;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        // Add your action code here.
    }
}
