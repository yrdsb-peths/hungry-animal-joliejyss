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

        //Bear hi = new Bear();
        //addObject(hi, 200, 300);

        Kangaroo hello = new Kangaroo();
        addObject(hello, 300, 350);

        //Cherry c = new Cherry();
        //addObject(c, 200, 10);

        //Strawberry s = new Strawberry();
        //addObject(s, 400, 10);

        spawnCherry();
        //spawnStrawberry();

        addObject (scoreLabel, 50, 50);
        
        
        
    }

    public void spawnCherry()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;

        Cherry yes = new Cherry();
        addObject(yes, x, y);
    }

    public void spawnStrawberry()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;

        Strawberry oui = new Strawberry();
        addObject(oui, x, y);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
    
    public void gameOver(){
        Label gameOverLabel = new Label ("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
