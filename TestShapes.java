//Assignment was to help understand interfaces
//In this case we used shapes 
import java.text.DecimalFormat;
import java.util.*;

//I'm not super creative for numbers, so I just used famous ones from songs - 867-5309, 555-1212, 777-9311
public class TestShapes {
    public static void main(String[] args) {
        Shapes circle = new Circle(8);
        Shapes parallelogram = new Parallelogram(6,7);
        Shapes rectangle = new Rectangle(5, 30);
        Shapes square = new Square(9);
        Shapes triangle = new Triangle(5,5,5);
        Shapes pentagon = new Pentagon(12);
        Shapes hexagon = new Hexagon(12);
        Shapes heptagon = new Heptagon(7);
        Shapes ellipse= new Ellipse(7,9);

        ArrayList<Shapes> tshapes = new ArrayList<Shapes>();
        tshapes.add(circle);
        tshapes.add(parallelogram);
        tshapes.add(rectangle);
        tshapes.add(square);
        tshapes.add(triangle);
        tshapes.add(pentagon);
        tshapes.add(hexagon);
        tshapes.add(heptagon);
        tshapes.add(ellipse);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println("Lab 4 : Geometric Shapes");
        System.out.println();
        for(Shapes shape:tshapes){
            System.out.println("Area of "+ shape.getClass().getSimpleName() + " : " + df.format(shape.area()));
            System.out.println("Perimeter of "+ shape.getClass().getSimpleName() + " : "+df.format(shape.perimeter()));
            System.out.println();
        }



    }
}
