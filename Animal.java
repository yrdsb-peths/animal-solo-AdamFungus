import greenfoot.*;

public class Animal extends Actor
{
    GreenfootSound animalSound = new GreenfootSound("kitty.mp3");
    
    
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
            animalSound.play();
        }
    }
}
