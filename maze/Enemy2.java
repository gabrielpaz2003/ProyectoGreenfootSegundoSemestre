import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Actor
{
    int speed = 1;
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
    }
    //Se indica las dimensiones que tendra el objeto
     public Enemy2()
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/11;
        int myNewWidth = (int)myImage.getWidth()/11;
        myImage.scale(myNewWidth, myNewHeight);
    }
    //Metodo para indicar el movimiento que tendra el objeto
    public void moveAround()
    {
        setLocation(getX(),getY() + speed);
        if (isTouching(libBlock.class))
        {
            speed = -speed;
        }
    }
}
