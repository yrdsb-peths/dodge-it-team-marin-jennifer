import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends Actor
{
    /**
     * Act - do whatever the Hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int difficulty;

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            difficulty = 2;
            Greenfoot.setWorld(new MyWorld());
        }
    }
    public static int getDifficulty(){
        return difficulty;
    }
}
