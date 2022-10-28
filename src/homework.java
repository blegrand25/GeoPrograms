public class homework extends World{

    public void go(){
        plane.pausetime = 2;
        plane.isTrail = true;
        plane.teleport(88,663);
        house();
        plane.teleport(390,764);
        tree();
        for(int x=0;x<5;x=x+1) {
            System.out.println(x);
            plane.teleport(540,764);
            table();
        }
    }

    public void house(){
        plane.startingAngle(90);
        plane.trailWidth = plane.random(3,6);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(240);
        plane.move(100);
        plane.turn(-120);
        plane.move(100);
    }

    public void tree(){
        plane.startingAngle(-90);
        plane.setColor(111,12,12);
        plane.move(150);
        plane.setColor(plane.random (30, 140),plane.random(75, 42), plane.random(85, 220));
        plane.turn(90);
        plane.move(50);
        plane.turn(-90);
        plane.move(100);
        plane.turn(-90);
        plane.move(100);
        plane.turn(-90);
        plane.move(100);
        plane.turn(-90);
        plane.move(50);
    }

    public void table(){
        plane.setColor(plane.random(70,255), plane.random(45,80), plane.random(123, 175));
        plane.startingAngle(270);
        plane.move(100);
        plane.turn(-90);
        plane.move(200);
        plane.turn(-90);
        plane.move(100);

    }


    // int r = plane.random(1,2);
    // if (r = = 1 ){
    // if (r == 2) {
    // square ();
    // }
    // r = = 1 "is r equal to 1?" yes or no and r = 1 assign the value 1 to variable r
    // if statements look like if (condition) {
    // plane. = code to run if condition is true}
    // give your if statement a condition in the brackets and then place your method in the open brackets
    // int (place what you want in here) then put the same thing in the parentheses in your method
    // x = 3 : assigning the variable to make it that number
    // x == 3: asking if it is equal to three
    // homework; make a grid of squares using a loop





}
