import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{

    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        showText("CHOOSE YOUR LEVEL",300,200);
        // Create buttons
        Easy easy = new Easy();
        Medium medium = new  Medium();
        Hard hard = new Hard();

        // Add buttons to the world
        addObject(easy, 300, 300);
        addObject(medium, 300, 400);
        addObject(hard, 300, 500);
    }
}
