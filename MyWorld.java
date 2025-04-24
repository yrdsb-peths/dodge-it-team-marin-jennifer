import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 600, 1);
        Greenfoot.setWorld(new menu());
        
        Hero hero = new Hero();
        addObject(hero, 100, 300);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100);
    }
}
