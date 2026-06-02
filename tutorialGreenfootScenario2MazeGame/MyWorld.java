import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int time = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 600, 1); 
        prepare();
    }
    public void act()
    {
        time++;
        if (time % 360 == 0){
            addObject(new Enemy(),Greenfoot.getRandomNumber(750), Greenfoot.getRandomNumber(550));
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WallHeightLong wallHeightLong = new WallHeightLong();
        addObject(wallHeightLong,740,454);
        wallHeightLong.setLocation(741,443);
        WallHeightLong wallHeightLong2 = new WallHeightLong();
        addObject(wallHeightLong2,740,216);
        wallHeightLong2.setLocation(742,213);
        WallHeightLong wallHeightLong3 = new WallHeightLong();
        addObject(wallHeightLong3,16,370);
        wallHeightLong3.setLocation(15,373);
        WallHeightLong wallHeightLong4 = new WallHeightLong();
        addObject(wallHeightLong4,373,204);
        wallHeightLong4.setLocation(373,219);
        WallHeightLong wallHeightLong5 = new WallHeightLong();
        addObject(wallHeightLong5,154,360);
        wallHeightLong5.setLocation(154,368);
        WallHeightLong wallHeightLong6 = new WallHeightLong();
        addObject(wallHeightLong6,13,192);
        wallHeightLong6.setLocation(9,151);
        wallHeightLong3.setLocation(10,389);
        WallWidthLong wallWidthLong = new WallWidthLong();
        addObject(wallWidthLong,125,585);
        wallWidthLong.setLocation(160,597);
        wallWidthLong.setLocation(143,594);
        WallWidthLong wallWidthLong2 = new WallWidthLong();
        addObject(wallWidthLong2,394,592);
        wallWidthLong2.setLocation(435,592);
        WallWidthLong wallWidthLong3 = new WallWidthLong();
        addObject(wallWidthLong3,71,4);
        WallWidthLong wallWidthLong4 = new WallWidthLong();
        addObject(wallWidthLong4,321,4);
        wallWidthLong4.setLocation(367,4);
        WallWidthLong wallWidthLong5 = new WallWidthLong();
        addObject(wallWidthLong5,556,0);
        wallWidthLong5.setLocation(607,4);
        WallWidthMedium wallWidthMedium = new WallWidthMedium();
        addObject(wallWidthMedium,645,589);
        wallWidthMedium.setLocation(661,592);
        WallWidthMedium wallWidthMedium2 = new WallWidthMedium();
        addObject(wallWidthMedium2,72,521);
        wallWidthMedium2.setLocation(87,522);
        WallWidthMedium wallWidthMedium3 = new WallWidthMedium();
        addObject(wallWidthMedium3,444,524);
        wallWidthMedium3.setLocation(452,516);
        WallHeightSmall wallHeightSmall = new WallHeightSmall();
        addObject(wallHeightSmall,221,555);
        wallHeightSmall.setLocation(226,562);
        WallHeightSmall wallHeightSmall2 = new WallHeightSmall();
        addObject(wallHeightSmall2,303,555);
        wallHeightSmall2.setLocation(304,562);
        WallHeightSmall wallHeightSmall3 = new WallHeightSmall();
        addObject(wallHeightSmall3,522,551);
        wallHeightSmall3.setLocation(522,556);
        WallHeightMedium wallHeightMedium = new WallHeightMedium();
        addObject(wallHeightMedium,595,530);
        wallHeightMedium.setLocation(596,518);
        WallHeightMedium wallHeightMedium2 = new WallHeightMedium();
        addObject(wallHeightMedium2,667,370);
        wallHeightMedium2.setLocation(670,451);
        wallHeightMedium.setLocation(592,449);
        WallWidthMedium wallWidthMedium4 = new WallWidthMedium();
        addObject(wallWidthMedium4,592,449);
        WallWidthMedium wallWidthMedium5 = new WallWidthMedium();
        addObject(wallWidthMedium5,595,298);
        WallHeightMedium wallHeightMedium3 = new WallHeightMedium();
        addObject(wallHeightMedium3,520,368);
        WallHeightSmall wallHeightSmall4 = new WallHeightSmall();
        addObject(wallHeightSmall4,671,335);
        WallWidthSmall wallWidthSmall = new WallWidthSmall();
        addObject(wallWidthSmall,488,445);
        WallWidthSmall wallWidthSmall2 = new WallWidthSmall();
        addObject(wallWidthSmall2,343,448);
        wallWidthSmall2.setLocation(342,447);
        WallWidthSmall wallWidthSmall3 = new WallWidthSmall();
        addObject(wallWidthSmall3,185,444);
        WallWidthSmall wallWidthSmall4 = new WallWidthSmall();
        addObject(wallWidthSmall4,115,384);
        WallHeightSmall wallHeightSmall5 = new WallHeightSmall();
        addObject(wallHeightSmall5,76,441);
        wallHeightSmall5.setLocation(79,412);
        WallHeightSmall wallHeightSmall6 = new WallHeightSmall();
        addObject(wallHeightSmall6,76,479);
        wallHeightSmall6.setLocation(78,482);
        WallHeightSmall wallHeightSmall7 = new WallHeightSmall();
        addObject(wallHeightSmall7,226,406);
        WallHeightSmall wallHeightSmall8 = new WallHeightSmall();
        addObject(wallHeightSmall8,301,413);
        WallWidthSmall wallWidthSmall5 = new WallWidthSmall();
        addObject(wallWidthSmall5,264,523);
        WallHeightSmall wallHeightSmall9 = new WallHeightSmall();
        addObject(wallHeightSmall9,372,482);
        WallHeightMedium wallHeightMedium4 = new WallHeightMedium();
        addObject(wallHeightMedium4,450,367);
        WallWidthLong wallWidthLong6 = new WallWidthLong();
        addObject(wallWidthLong6,412,298);
        wallWidthLong6.setLocation(265,290);
        removeObject(wallWidthLong6);
        WallWidthSmall wallWidthSmall6 = new WallWidthSmall();
        addObject(wallWidthSmall6,412,297);
        WallHeightSmall wallHeightSmall10 = new WallHeightSmall();
        addObject(wallHeightSmall10,596,552);
        wallHeightSmall10.setLocation(592,554);
        WallWidthMedium wallWidthMedium6 = new WallWidthMedium();
        addObject(wallWidthMedium6,558,223);
        wallWidthMedium6.setLocation(524,223);
        WallWidthSmall wallWidthSmall7 = new WallWidthSmall();
        addObject(wallWidthSmall7,625,224);
        wallWidthSmall7.setLocation(628,224);
        WallHeightMedium wallHeightMedium5 = new WallHeightMedium();
        addObject(wallHeightMedium5,522,141);
        wallHeightMedium5.setLocation(522,146);
        WallHeightMedium wallHeightMedium6 = new WallHeightMedium();
        addObject(wallHeightMedium6,447,83);
        WallWidthMedium wallWidthMedium7 = new WallWidthMedium();
        addObject(wallWidthMedium7,631,73);
        wallWidthMedium7.setLocation(594,72);
        WallWidthSmall wallWidthSmall8 = new WallWidthSmall();
        addObject(wallWidthSmall8,695,73);
        WallWidthSmall wallWidthSmall9 = new WallWidthSmall();
        addObject(wallWidthSmall9,263,296);
        WallHeightMedium wallHeightMedium7 = new WallHeightMedium();
        addObject(wallHeightMedium7,232,221);
        wallHeightMedium7.setLocation(225,218);
        WallHeightMedium wallHeightMedium8 = new WallHeightMedium();
        addObject(wallHeightMedium8,303,146);
        wallHeightMedium8.setLocation(308,187);
        wallHeightMedium8.setLocation(309,159);
        WallHeightMedium wallHeightMedium9 = new WallHeightMedium();
        addObject(wallHeightMedium9,81,212);
        wallHeightMedium9.setLocation(79,226);
        WallWidthMedium wallWidthMedium8 = new WallWidthMedium();
        addObject(wallWidthMedium8,150,150);
        WallHeightSmall wallHeightSmall11 = new WallHeightSmall();
        addObject(wallHeightSmall11,77,106);
        wallHeightSmall11.setLocation(77,118);
        wallHeightSmall11.setLocation(81,105);
        WallHeightSmall wallHeightSmall12 = new WallHeightSmall();
        addObject(wallHeightSmall12,227,33);
        WallHeightSmall wallHeightSmall13 = new WallHeightSmall();
        addObject(wallHeightSmall13,151,40);
        WallWidthSmall wallWidthSmall10 = new WallWidthSmall();
        addObject(wallWidthSmall10,114,74);
        wallHeightMedium8.setLocation(306,153);
        WallWidthSmall wallWidthSmall11 = new WallWidthSmall();
        addObject(wallWidthSmall11,337,74);
        Mouse mouse = new Mouse();
        addObject(mouse,46,560);
        wallHeightLong5.setLocation(153,484);
        wallHeightLong5.setLocation(152,372);
        removeObject(wallHeightLong5);
        wallWidthMedium2.setLocation(145,518);
        removeObject(wallWidthMedium2);
        wallHeightSmall2.setLocation(308,551);
        removeObject(wallHeightSmall2);
        wallWidthSmall3.setLocation(201,444);
        removeObject(wallWidthSmall3);
        WallWidthSmall wallWidthSmall3111 = new WallWidthSmall();
        addObject(wallWidthSmall3111,188,385);
        WallHeightMedium wallHeightMedium10 = new WallHeightMedium();
        addObject(wallHeightMedium10,153,304);
        wallHeightMedium10.setLocation(154,304);
        WallWidthSmall wallWidthSmall12 = new WallWidthSmall();
        addObject(wallWidthSmall12,40,521);
        Cheese cheese = new Cheese();
        addObject(cheese,106,35);
        Teleporter teleporter = new Teleporter();
        addObject(teleporter,120,110);
        Teleporter teleporter2 = new Teleporter();
        addObject(teleporter2,560,183);

        Enemy enemy = new Enemy();
        addObject(enemy,Greenfoot.getRandomNumber(750),Greenfoot.getRandomNumber(550));
        Enemy enemy2 = new Enemy();
        addObject(enemy2,Greenfoot.getRandomNumber(750),Greenfoot.getRandomNumber(550));
        Enemy enemy3 = new Enemy();
        addObject(enemy3,Greenfoot.getRandomNumber(750),Greenfoot.getRandomNumber(550));
        enemy2 enemy22 = new enemy2();
        addObject(enemy22,395,41);
        enemy.setLocation(692,115);
        enemy2 enemy23 = new enemy2();
        addObject(enemy23,692,115);
        enemy22.setLocation(265,253);
        enemy.setLocation(701,119);
        WinningPlatform winningPlatform = new WinningPlatform();
        addObject(winningPlatform,711,19);
    }
}
