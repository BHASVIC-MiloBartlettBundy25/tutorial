import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(null))
        {
            MouseInfo info = Greenfoot.getMouseInfo();
            addObject(new Animal(Greenfoot.getRandomNumber(360), Greenfoot.getRandomNumber(5)+ 1, 4),info.getX(),info.getY());
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
}
