public class Loki extends World {

    public void go() {
        plane.pausetime = 2;
        plane.isTrail = true;
        plane.teleport(472,274);
        breah(2);


        // plane.random (int start, int end)
//make methods that change the size of things to be different for homework
    }
    public void triangle(){
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
        plane.turn(120);
        plane.move(150);

    }

    public void square(){
        plane.startingAngle(90);
        plane.move(150);
        plane.turn(90);
        plane.move(150);
        plane.turn(90);
        plane.move(150);
        plane.turn(90);
        plane.move(150);
        plane.turn(90);

    }

    public void house(){
        triangle();
        square();
    }

    public void bigsquare(int length){
        plane.startingAngle(90);
        plane.move(length);
        plane.turn(90);
        plane.move(length);
        plane.turn(90);
        plane.move(length);
        plane.turn(90);
        plane.move(length);
        plane.turn(90);
    }

    public void thor() {
        plane.setColor(36, 212, 255);
        plane.teleport(644,130);
        plane.startingAngle(90);
        plane.move(100);
        plane.turn(180);
        plane.isTrail=false;
        plane.move(75);
        plane.isTrail=true;
        plane.turn(270);
        plane.move(70);
        plane.turn(7);

    }

    public void asgard(){

    }

    public void hammer(){

    }

    public void breah(int font){
        plane.startingAngle(90);
        plane.move(150);
        plane.turn(-270);
        plane.move(50);
        plane.turn(45);
        plane.move(20);
        plane.turn(45);
        plane.move(15);
        plane.turn(45);
        plane.move(30);
        plane.turn(45);
        plane.move(30);
        plane.turn(-45);
        plane.move(20);
        plane.turn(45);



    }
// control statements: if (){
//
// }
    //-if statements : whatever conditions are met (yes do this, no dont do it)


}
