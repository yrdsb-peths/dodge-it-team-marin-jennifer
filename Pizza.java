import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pizza extends Actor
{
    public Pizza() {
        setImage("images/pizza_cheese.png");
    }
    //always moving to left
    //if touching hero, add bomb to show game over
    public void act()
    {
        move(-10);
        
        if(getX() <= 0) {
            resetPizza();
        }
        
        if(isTouching(Hero.class)){
            //add a game over symbol
            Skull skull = new Skull();
            Skull skull2 = new Skull();
            Skull skull3 = new Skull();
            getWorld().addObject(skull, 300, 300);
            getWorld().addObject(skull2, 200, 300);
            getWorld().addObject(skull3, 400, 300);
            getWorld().removeObject(this);
        }
    }
    //reset banana to right of screen, randomize if at bottom, middle, or top
    public void resetPizza(){
        int num = Greenfoot.getRandomNumber(5);
        if(num == 0){
                setLocation(600, 100);
        } else if (num == 1) {
            setLocation(600, 200);
        } else if (num == 2) {
            setLocation(600, 300);
        } else if (num == 3) {
            setLocation(600, 400);
        }else{
            setLocation(600, 500);
        }
    }
}
