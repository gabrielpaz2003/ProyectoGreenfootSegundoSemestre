import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        libBlock libBlock = new libBlock();
        addObject(libBlock,0+20,1*50+20);
        libBlock libBlock2 = new libBlock();
        addObject(libBlock2,1*50+20,1*50+20);
        libBlock libBlock3 = new libBlock();
        addObject(libBlock3,1*50+20,2*50+20);
        libBlock libBlock4 = new libBlock();
        addObject(libBlock4,1*50+20,4*50+20);
        libBlock libBlock5 = new libBlock();
        addObject(libBlock5,1*50+20,5*50+20);
        libBlock libBlock6 = new libBlock();
        addObject(libBlock6,1*50+20,6*50+20);
        libBlock libBlock7 = new libBlock();
        addObject(libBlock7,0*50+20,6*50+20);
        libBlock libBlock8 = new libBlock();
        addObject(libBlock8,2*50+20,5*50+20);
        libBlock libBlock9 = new libBlock();
        addObject(libBlock9,3*50+20,6*50+20);
        libBlock libBlock10 = new libBlock();
        addObject(libBlock10,3*50+20,7*50+20);
        libBlock libBlock11 = new libBlock();
        addObject(libBlock11,2*50+20,8*50+20);
        libBlock libBlock12 = new libBlock();
        addObject(libBlock12,1*50+20,8*50+20);
        libBlock libBlock13 = new libBlock();
        addObject(libBlock13,1*50+20,11*50+20);
        libBlock libBlock14 = new libBlock();
        addObject(libBlock14,1*50+20,10*50+20);
        libBlock libBlock15 = new libBlock();
        addObject(libBlock15,2*50+20,11*50+20);
        libBlock libBlock16 = new libBlock();
        addObject(libBlock16,3*50+20,10*50+20);
        libBlock libBlock17 = new libBlock();
        addObject(libBlock17,4*50+20,10*50+20);
        libBlock libBlock18 = new libBlock();
        addObject(libBlock18,4*50+20,9*50+20);
        libBlock libBlock19 = new libBlock();
        addObject(libBlock19,5*50+20,8*50+20);
        libBlock libBlock20 = new libBlock();
        addObject(libBlock20,5*50+20,7*50+20);
        libBlock libBlock21 = new libBlock();
        addObject(libBlock21,5*50+20,6*50+20);
        libBlock libBlock22 = new libBlock();
        addObject(libBlock22,5*50+20,4*50+20);
        libBlock libBlock23 = new libBlock();
        addObject(libBlock23,6*50+20,4*50+20);
        libBlock libBlock24 = new libBlock();
        addObject(libBlock24,4*50+20,4*50+20);
        libBlock libBlock25 = new libBlock();
        addObject(libBlock25,4*50+20,3*50+20);
        libBlock libBlock26 = new libBlock();
        addObject(libBlock26,3*50+20,3*50+20);
        libBlock libBlock27 = new libBlock();
        addObject(libBlock27,3*50+20,0*50+20);
        libBlock libBlock28 = new libBlock();
        addObject(libBlock28,3*50+20,1*50+20);
        libBlock libBlock29 = new libBlock();
        addObject(libBlock29,4*50+20,1*50+20);
        libBlock libBlock30 = new libBlock();
        addObject(libBlock30,6*50+20,3*50+20);
        libBlock libBlock31 = new libBlock();
        addObject(libBlock31,5*50+20,1*50+20);
        libBlock libBlock32 = new libBlock();
        addObject(libBlock32,6*50+20,1*50+20);
        libBlock libBlock33 = new libBlock();
        addObject(libBlock33,8*50+20,1*50+20);
        libBlock libBlock34 = new libBlock();
        addObject(libBlock34,9*50+20,0*50+20);
        libBlock libBlock35 = new libBlock();
        addObject(libBlock35,9*50+20,1*50+20);
        libBlock libBlock36 = new libBlock();
        addObject(libBlock36,8*50+20,3*50+20);
        libBlock libBlock37 = new libBlock();
        addObject(libBlock37,9*50+20,3*50+20);
        libBlock libBlock38 = new libBlock();
        addObject(libBlock38,9*50+20,4*50+20);
        libBlock libBlock39 = new libBlock();
        addObject(libBlock39,10*50+20,1*50+20);
        libBlock libBlock40 = new libBlock();
        addObject(libBlock40,10*50+20,3*50+20);
        libBlock libBlock41 = new libBlock();
        addObject(libBlock41,10*50+20,4*50+20);
        libBlock libBlock42 = new libBlock();
        addObject(libBlock42,7*50+20,6*50+20);
        libBlock libBlock43 = new libBlock();
        addObject(libBlock43,8*50+20,7*50+20);
        libBlock libBlock44 = new libBlock();
        addObject(libBlock44,9*50+20,8*50+20);
        libBlock libBlock45 = new libBlock();
        addObject(libBlock45,6*50+20,8*50+20);
        libBlock libBlock46 = new libBlock();
        addObject(libBlock46,6*50+20,9*50+20);
        libBlock libBlock47 = new libBlock();
        addObject(libBlock47,8*50+20,9*50+20);
        libBlock libBlock48 = new libBlock();
        addObject(libBlock48,6*50+20,10*50+20);
        libBlock libBlock49 = new libBlock();
        addObject(libBlock49,9*50+20,11*50+20);
        libBlock libBlock50 = new libBlock();
        addObject(libBlock50,10*50+20,11*50+20);
        libBlock libBlock51 = new libBlock();
        addObject(libBlock51,11*50+20,10*50+20);
        libBlock libBlock52 = new libBlock();
        addObject(libBlock52,11*50+20,11*50+20);
        libBlock libBlock53 = new libBlock();
        addObject(libBlock53,10*50+20,8*50+20);
        libBlock libBlock54 = new libBlock();
        addObject(libBlock54,9*50+20,9*50+20);
        libBlock libBlock55 = new libBlock();
        addObject(libBlock55,9*50+20,6*50+20);
        libBlock libBlock56 = new libBlock();
        addObject(libBlock56,9*50+20,7*50+20);
        libBlock libBlock57 = new libBlock();
        addObject(libBlock57,10*50+20,6*50+20);
        Nelson nelson = new Nelson();
        addObject(nelson,36,21);
        nelson.setLocation(15,21);
        test test = new test();
        addObject(test,392,159);
        libBlock36.setLocation(221,22);
        test test2 = new test();
        addObject(test2,425,427);
        test2.setLocation(415,421);
        test test3 = new test();
        addObject(test3,114,366);
        test3.setLocation(120,323);
        test test4 = new test();
        addObject(test4,25,119);
        test4.setLocation(17,124);
        test test5 = new test();
        addObject(test5,273,22);
        libBlock17.setLocation(268,474);
        test test6 = new test();
        addObject(test6,421,224);
        test6.setLocation(419,221);
        test6.setLocation(120,517);
        test.setLocation(526,367);
        test.setLocation(522,373);
        libBlock17.setLocation(271,456);
        libBlock17.setLocation(265,474);
        test test7 = new test();
        addObject(test7,269,528);
        test7.setLocation(264,528);
        Enemy enemy = new Enemy();
        addObject(enemy,274,112);
        enemy.setLocation(279,123);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,170,426);
        enemy2.setLocation(181,415);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,383,557);
        enemy3.setLocation(391,557);
        removeObject(enemy2);
        enemy3.setLocation(385,545);
        Enemy2 enemy22 = new Enemy2();
        addObject(enemy22,12,367);
        enemy22.setLocation(29,423);
        enemy22.setLocation(21,384);
        Enemy2 enemy23 = new Enemy2();
        addObject(enemy23,568,60);
        enemy23.setLocation(574,36);
        Enemy2 enemy24 = new Enemy2();
        addObject(enemy24,23,261);
        enemy24.setLocation(18,264);
        enemy24.setLocation(13,271);
        removeObject(enemy22);
        enemy23.setLocation(420,126);
        enemy23.setLocation(402,125);
        libBlock17.setLocation(262,557);
        test7.setLocation(265,524);
        libBlock18.setLocation(221,534);
        libBlock18.setLocation(228,539);
        libBlock18.setLocation(211,570);
        libBlock17.setLocation(283,574);
        libBlock17.setLocation(266,570);
        Enemy2 enemy25 = new Enemy2();
        addObject(enemy25,221,302);
        enemy25.setLocation(219,273);
        enemy25.setLocation(217,273);
        libBlock21.setLocation(282,317);
        libBlock20.setLocation(273,361);
        libBlock19.setLocation(265,412);
        test6.setLocation(12,569);
        libBlock16.setLocation(265,319);
        libBlock14.setLocation(265,369);
        libBlock21.setLocation(265,420);
        libBlock20.setLocation(157,524);
        libBlock19.setLocation(101,524);
        enemy25.setLocation(218,527);
        enemy25.setLocation(212,520);
        removeObject(libBlock21);
        test6.setLocation(24,559);
        test6.setLocation(20,566);
        canva canva = new canva();
        addObject(canva,585,23);
        canva.setLocation(573,27);
    }
}
