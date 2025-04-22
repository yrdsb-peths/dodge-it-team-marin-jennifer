import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero penguin = new Hero();
        addObject(penguin, 100, 100);
    }
}
