public class FinalGeoWorldPicture extends World {
    public int red;
    public int green;
    public int blue;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();// method that shows a picture (fie name found on line 12 at of RunMyProgram)

        filter();

    }

    public void filter() {
        for (int row = 0; row < 283; row = row + 1) {// rows
            for (int col = 0; col < 179; col = col + 1) {// columns
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                //if color is yellow, change to pink
                if (blue < 175 && red > 200 && green > 190) {
                    plane.setPixelColor(255, 192, 203);

                }

            }
        }// end of shoe filter

        for (int row = 0; row < 283; row = row + 1) {
            for (int col = 0; col < 179; col = col + 1) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (blue < 70 && red < 260 && green > 35) {
                    plane.setPixelColor(148, 53, 242);
                }

            }
        }
    }
}


