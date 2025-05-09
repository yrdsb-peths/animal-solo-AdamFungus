import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor
{
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        eat();
        if(Greenfoot.isKeyDown("left")) {
            move(-1);
        } else if(Greenfoot.isKeyDown("right")) {
            {
                move(1);
            }
        }
    }
    
    public void eat() {
        if(isTouching(Food.class)) {
            removeTouching(Food.class);
            MyWorld world =(MyWorld) getWorld();
            world.createFood();   
            world.increaseScore();
        }
        
    }
}
