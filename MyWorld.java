import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Animal animal = new Animal();
        addObject(animal, 300, 300);
        
        
        Score score = new Score();
        addObject(score, 100, 20);
        
        createFood();
    }
    public void createFood() {
        Food food = new Food();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(food, x, y);
    }
}
