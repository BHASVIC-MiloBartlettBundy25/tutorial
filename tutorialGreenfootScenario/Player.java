import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
    }
    public void moveAround()
    {
        move(speed);
        if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        } 
        if (Greenfoot.isKeyDown("space"))
        {
            speed = speed + 2;
        }
        else if (Greenfoot.isKeyDown("v"))
        {
            speed = 1;
        }
    }
}
