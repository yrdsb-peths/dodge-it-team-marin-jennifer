import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    public Banana() {
        setImage("images/bananas.png");
    }
    //always moving to left
    //if touching hero, add bomb to show game over
    public void act()
    {
        move(-10);
        
        if(getX() <= 0) {
            resetBanana();
        }
        
        if(isTouching(Hero.class)){
            //add a game over symbol
            Bomb bomb = new Bomb();
            getWorld().addObject(bomb, 300, 300);
            getWorld().removeObject(this);
        }
    }
    //reset banana to right of screen, randomize if at bottom, middle, or top
    public void resetBanana(){
    int num = Greenfoot.getRandomNumber(4);
     if(num == 0){
                setLocation(600, 100);
            } else if (num == 1) {
                setLocation(600, 150);
            } else if (num == 2) {
                setLocation(600, 200);
            } else if (num == 3) {
                setLocation(600, 250);
            }
    else{
        setLocation(600, 500);
        
        }
    }
}
