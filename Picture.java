/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Circle sun1;
    private Circle sun2;
    private Square sky;
    private Square sand;
    private Square walls;
    private Triangle door;
    private Circle roof;
    private Person luke;
    private boolean drawn;
    private boolean blackandwhite;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sun1 = new Circle();
        sun2 = new Circle();
        sky = new Square();
        sand = new Square();
        walls = new Square();
        door = new Triangle();
        roof = new Circle();
        luke = new Person();
        drawn = false;
        blackandwhite = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("blue");
            sky.changeSize(650);
            sky.moveVertical(-150);
            sky.moveHorizontal(-325);
            sky.makeVisible();

            sun1.changeColor("yellow");
            sun1.moveHorizontal(150);
            sun1.moveVertical(-40);
            sun1.changeSize(80);
            sun1.makeVisible();

            sun2.changeColor("yellow");
            sun2.moveHorizontal(50);
            sun2.moveVertical(-60);
            sun2.makeVisible();
            
            sand.changeColor("yellow");
            sand.changeSize(650);
            sand.moveVertical(100);
            sand.moveHorizontal(-340);
            sand.makeVisible();
            
            walls.changeColor("red");
            walls.changeSize(119);
            walls.moveVertical(30);
            walls.moveHorizontal(-210);
            walls.makeVisible();
            
            door.changeColor("magenta");
            door.changeSize(45, 60);
            door.moveHorizontal(-50);
            door.moveVertical(84);
            door.makeVisible();

            roof.changeColor("red");
            roof.changeSize(119);
            roof.moveHorizontal(-130);
            roof.moveVertical(9);
            roof.makeVisible();

            luke.moveVertical(40);
            luke.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("black");
        sun1.changeColor("white");
        sun2.changeColor("white");
        sand.changeColor("black");
        walls.changeColor("white");
        door.changeColor("black");
        roof.changeColor("white");
        luke.changeColor("white");
        blackandwhite = true;
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("blue");
        sun1.changeColor("yellow");
        sun2.changeColor("yellow");
        sand.changeColor("yellow");
        walls.changeColor("red");
        door.changeColor("magenta");
        roof.changeColor("red");
        luke.changeColor("black");
        blackandwhite = false;
    }
}
