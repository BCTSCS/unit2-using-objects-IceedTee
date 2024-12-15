import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PizzaWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PizzaWorld extends World
{

    /**
     * Constructor for objects of class PizzaWorld.
     * 
     */
    public PizzaWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); // Size of the world
        Pizza pizza1 = new Pizza("Pepperoni", 5);
        Pizza pizza2 = new Pizza("Cheese", 8);

        addObject(pizza1, 200, 200);
        addObject(pizza2, 400, 200);
 
    }
}
