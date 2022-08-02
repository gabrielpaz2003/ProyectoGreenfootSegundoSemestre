import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Se indica las dimensiones que tendra el objeto
    public Enemy()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/10;
        int myNewWidth = (int)myImage.getWidth()/10;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        moveAround();
    }
    //Metodo para indicar el movimiento que tendra el objeto
    public void moveAround()
    {
        move(2);
        turn(2);
    }
}
