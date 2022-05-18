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
    public int score = 0;
    public Label scoreLabel = new Label(score, 80);
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        Kangaroo hello = new Kangaroo();
        addObject(hello, 300, 350);

        spawnCherry();

        addObject (scoreLabel, 50, 50);
        
        
        
    }

    public void spawnCherry()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;

        Cherry yes = new Cherry();
        addObject(yes, x, y);
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
