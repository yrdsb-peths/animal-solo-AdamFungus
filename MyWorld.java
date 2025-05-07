import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Animal animal = new Animal();
        addObject(animal, 300, 300);
        
        Food food = new Food();
        addObject(food, 300, 0);
    }
}
