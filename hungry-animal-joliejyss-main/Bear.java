import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("j")){
            move(-2);
        }
        if (Greenfoot.isKeyDown("l")){
            move(2);
        }
        if (isTouching(Strawberry.class)){
            removeTouching(Strawberry.class);
        }
    }
}