import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    public Hero() {
        setImage("images/tux.png");  
    }
    
    private int moveCooldown = 0;
    //hero can go up or down when pressing up or down arrows respectively
    // hero can be at the top, middle or bottom
    public void act()
    {
        if (moveCooldown > 0) {
            moveCooldown--;
            return;
        }
        if(Greenfoot.isKeyDown("up") && !atTop()){
            setLocation(100,getY()-200);
            moveCooldown = 10;
        }
        if(Greenfoot.isKeyDown("down") && !atBottom()){
            setLocation(100,getY()+200);
            moveCooldown = 10;
        }
    }
    //returns if hero is at top or bottom
    public boolean atTop(){
        if(getY() == 100){
            return true;
        }
        return false;
    }
    public boolean atBottom(){
        if(getY() == 500){
            return true;
        }
        return false;
    }
}
