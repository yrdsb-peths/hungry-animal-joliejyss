import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kangaroo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kangaroo extends Actor
{
    /**
     * Act - do whatever the Kangaroo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("a")){
            move(-3);
        }
        if (Greenfoot.isKeyDown("d")){
            move(3);
        }
        if (isTouching(Cherry.class)){
            removeTouching(Cherry.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnCherry();
        }
        if (Greenfoot.isKeyDown("space")){
            turn(2);
        }
        
        
    }
}
