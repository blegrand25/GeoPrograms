public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.pausetime = 0;
        plane.trailWidth = 4;
       squareGrid();


    }



    public void squarerow(int row) {
        for (int col = 0; col < 10; col = col + 1)// 5 is the ending condition -- x=x+1 ----- for (start; condition; x=x=1
        {// 0 still prints a row
            plane.setColor(row*25,100,col*20);
            plane.teleport(col*100, row*100);
            System.out.println(col);
            plane.square(100);

        }
    }

    public void squareGrid(){
        for (int row = 0; row < 8; row = row +1){
            squarerow(row);
        }
    }

}
// "for" means repeating something multiple times
