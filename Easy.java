import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends Actor
{
    /**
     * Act - do whatever the Easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int difficulty;

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            difficulty = 0;
            Greenfoot.setWorld(new MyWorld());
        }
    }
    public static int getDifficulty(){
        return difficulty;
    }
}
