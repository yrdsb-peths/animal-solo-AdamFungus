import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Adam fung 
 * @version (May 2025)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, getHeight()/2);
    }
    public void act() {
         if(Greenfoot.isKeyDown("space")) {
             MyWorld gameWorld = new MyWorld();
             Greenfoot.setWorld(gameWorld);
         }
    }
}
