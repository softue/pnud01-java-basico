public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        for (int y=1; y<=height; y++) {
            for (int x=1; x<=width; x++) {
                if ( (x==1) || (x==width) || (y==1) || (y==height)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        for (int y=1; y<=leg; y++) {
            for (int x=1; x<=leg; x++) {
                if ( (x==1) || (y==leg) || (x==y) ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
