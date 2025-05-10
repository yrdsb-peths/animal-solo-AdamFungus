import greenfoot.*;

public class Food extends Actor
{
    public void act()
    {
        setLocation(getX(), getY() + 1);
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}


