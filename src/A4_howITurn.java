

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.teleport(472,274);
        plane.startingAngle(120);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(255, 247, 20);
        plane.move(150);
        plane.turn(120);
        plane.setColor(255, 20, 224);
        plane.move(150);
        plane.setColor(0,242,8);
        plane.turn(120);
        plane.move(150);

    }


}
