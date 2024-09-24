// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class PigWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class PigWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class PigWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new  Burger();
        addObject(burger, 457, 90);
        Burger burger2 =  new  Burger();
        addObject(burger2, 297, 276);
        Burger burger3 =  new  Burger();
        addObject(burger3, 221, 119);
        Burger burger4 =  new  Burger();
        addObject(burger4, 69, 321);
        Pig pig =  new  Pig();
        addObject(pig, 263, 175);
        Snake snake =  new  Snake();
        addObject(snake, 494, 216);
    }
}
