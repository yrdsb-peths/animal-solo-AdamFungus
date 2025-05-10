import greenfoot.*;

public class Food extends Actor
{
    static int count = 0;
    static int speed = 1;

    public void act()
    {
        count++;
        setSpeed();
        setLocation(getX(), getY() + speed);
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }

    public void setSpeed() {
        if (count == 300) {
            speed ++;
            count = 0;
        }
    }
}


