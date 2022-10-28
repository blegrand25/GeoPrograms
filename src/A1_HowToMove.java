public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.pausetime = 1;
        plane.startingAngle(0);
        plane.setColor(107, 3, 252);
        plane.isTrail = true;
        plane.move(200);
        plane.isTrail = false;
        plane.move(100);
        plane.isTrail = true;
        plane.move(200);
        plane.turn(270);// delete this code and everything after it
        purple();
        plane.turn(-90);
        purple();
        plane.turn(270);
        purple();
        plane.turn(-135);
        blue();
        plane.teleport(703,253);
        plane.turn(-90);
        blue();

        plane.teleport(280,28);
        plane.startingAngle(40);
        plane.move(300);
        plane.turn(50);
        plane.move(100);



// 300, 300, 107 for down the middle


    }

    public void purple() {
        plane.move(200);
        plane.isTrail = false;
        plane.move(100);
        plane.isTrail = true;
        plane.move(200);
    }

    public void blue(){
        plane.move(300);
        plane.isTrail=false;
        plane.move(107);
        plane.isTrail=true;
        plane.move(300);
    }
}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/