import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 600, 1);
        Greenfoot.setWorld(new Menu());
        
        Hero hero = new Hero();
        addObject(hero, 100, 300);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100);
        
        Pizza pizza = new Pizza();
        if(Menu.getDifficulty()>0){
            addObject(pizza, 600, 200);
            showText("Guess which one is more dangerous ( ˇ෴ˇ )", 300, 50);
        }else{
            showText("Dodge these super slow bananas", 300, 50);
        }
    }
}
