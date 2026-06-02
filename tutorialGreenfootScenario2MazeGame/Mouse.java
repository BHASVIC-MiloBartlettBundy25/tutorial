import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 3;
    public Mouse()
    {
        getImage().scale(getImage().getWidth() /2, getImage().getHeight() /2);
    }
    public void act()
    {
        moveAround();
        hitfood();
        hitTeleporter();
        youLose();
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
            if (hitWall()){
                setLocation(getX() - speed, getY());
            }
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
            if (hitWall()){
                setLocation(getX() + speed, getY());
            }
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-speed);
            if (hitWall()){
                setLocation(getX(), getY() + speed);
            }
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + speed);
            if (hitWall()){
                setLocation(getX(), getY() - speed);
            }
        }
    }
    public boolean hitWall()
    {
        if (isTouching(Walls.class)){
            return true;
        }
        return false;
    }
    public void hitfood()
    {
        if (getOneIntersectingObject(Cheese.class) != null)
        {
            getWorld().removeObject(getOneIntersectingObject(Cheese.class));
            speed++;
        }
        
    }
    public void hitTeleporter()
    {
        if (isTouching(Teleporter.class))
        {
            setLocation(27,561);
        }
    
    }
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
    public void youLose()
    {
        if (hitEnemy())
        {
            getWorld().addObject(new YouLose(),375, 275);
            Greenfoot.stop();
        }
    }
}
