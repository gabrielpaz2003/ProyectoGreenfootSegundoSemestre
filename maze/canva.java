import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class canva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class canva extends Actor
{
    /**
     * Act - do whatever the canva wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    //Se indica las dimensiones que tendra el objeto
    public canva()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/6;
        int myNewWidth = (int)myImage.getWidth()/6;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
