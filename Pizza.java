import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor {
    private String type;
    private int size;
    private Actor toppings;

    public Pizza(String theType, int theSize) {
        type = theType;
        size = theSize;

        // Modify image size based on parameters
        getImage().scale(10 * size, 10 * size);

        // Change text color and write the type on the image
        getImage().setColor(Color.BLUE);
        getImage().drawString(type, 0, 20);
    }

    @Override
    protected void addedToWorld(World world) {
        toppings = new Cheese(); // Default topping
        world.addObject(toppings, getX(), getY());
    }
}
