import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nelson here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nelson extends Actor
{
    //Contador para recolectar los examenes
    int collect = 0;
    /**
     * Act - do whatever the Nelson wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        hitWall();
        hitTest();
    }
    // Metodo cuando hay movimiento
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 3, getY());
            if (hitWall() == true)
            {
                setLocation(getX() - 3, getY());
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 3, getY());
            if (hitWall() == true)
            {
                setLocation(getX() + 3, getY());
            }
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 3);
            if (hitWall() == true)
            {
                setLocation(getX() , getY() + 3);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 3);
            if (hitWall() == true)
            {
                setLocation(getX() , getY() - 3);
            }
        }
        //Se listan los metodos que se pueden llamar 
        youLose();
        youWin();
        hitEnemy();
        hitTest();
        hitEnemy2(); 
    }
    //Este metodo sirve cuando el personaje toca una pared no la traspase
    public boolean hitWall()    
    {
        if (isTouching(libBlock.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //Metodo cuando Nelson choca con un enemigo
    public boolean hitEnemy()    
    {
        if (isTouching(Enemy.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //Metodo cuando Nelson choca con un enemigo
    public boolean hitEnemy2()    
    {
        if (isTouching(Enemy2.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //Metodo que se utilizara cuando el usuario pierda el juego
    public void youLose()
    {
        if (hitEnemy())
        {
            getWorld().addObject(new youLose(),275,275);
            Greenfoot.stop();
        }
        if (hitEnemy2())
        {
            getWorld().addObject(new youLose(),275,275);
            Greenfoot.stop();
        }
    }
    //Metodo cuando el usuario recolecta un examen
    public void hitTest()    
    {
        if (getOneIntersectingObject(test.class) != null)
        {
            collect++;
            getWorld().removeObject(getOneIntersectingObject(test.class));
            Greenfoot.playSound("yeah.wav");
        }
    }
    //Metodo que se utilizara cuando el usuario pierda el juego
    public void youWin()    
    {
        if (isTouching(canva.class) && collect == 7)
        {
            getWorld().addObject(new youWin(),275,275);
            Greenfoot.stop();
        }
    }  
    }
    


