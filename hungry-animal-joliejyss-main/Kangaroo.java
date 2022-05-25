import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kangaroo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kangaroo extends Actor
{
    GreenfootSound bubblePop = new GreenfootSound("QKTA234-pop.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[11];
    GreenfootImage[] idleLeft = new GreenfootImage[11];
    
    String facing = "right";
    //SimpleTimer amimationTimer = new SimpleTimer();
    /**
     * Act - do whatever the Kangaroo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Kangaroo()
    {
        for (int i = 0; i < 11; i++)
        {
            idleRight[i] = new GreenfootImage("images/idle" + i + ".png.png");
            idleRight[i].scale(120,100);
        }        
        for (int i = 0; i<idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/idle" + i + ".png.png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(120,100);
        }
    }
    
    //animationTimer.mark();
    int imageIndex = 0;
    public void animateKangaroo()
    {
        /*if (animationTimer.millisElasped() < 500)
        {
            return;
        }
        animationTimer.mark();
        */
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else 
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
        
    }
    
    
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("a")){
            move(-3);
            facing = "left";
        }
        if (Greenfoot.isKeyDown("d")){
            move(3);
            facing = "right";
        }
        if (Greenfoot.isKeyDown("space")){
            turn(2);
        }
        
        if (isTouching(Cherry.class)){
            bubblePop.play();
            removeTouching(Cherry.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnCherry();
        }
        
        animateKangaroo();
    }
}
