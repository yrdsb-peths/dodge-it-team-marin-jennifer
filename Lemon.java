import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lemon extends Actor
{
    public void act()
    {
        move(-50);
        
        if(getX() <= 0) {
            resetLemon();
        }
        
        if(isTouching(Hero.class)){
            //add a game over symbol
            Bomb bomb = new Bomb();
            getWorld().addObject(bomb, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBanana(){
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0){
            setLocation(600, 100);
        }
        else{
            setLocation(600, 300);
        }
    }
}