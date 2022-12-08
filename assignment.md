
1) Create java classes for concrete geometric shapes such as Circle, Rectangle, Triangle, etc. with methods and members to allow the calculation of the area and perimeter of the shape.  The concrete shapes will implement the interface Shape.   Use encapsulation such that primitive members are private and accessed using getters.   Class attributes may be set using constructors or setters.   

Your shapes should be of type Shape and implement the (abstract) Shape interface. 

interface Shape {
        public double getArea();
        public double getPerimeter();
}

Example:  

class Circle implements Shape {

//   Add implementation details here
}

Use the appropriate @Override annotation for your implementations.   

You should create a main class called for example called TestShape to test your calculations.  Inside this class,  concrete shape classes should be assigned to type Shape as follows (not the shape subclass): 

Shape circle = new Circle(radius);

That is, don't do this:
//  Don't do this: 
Circle circle = new Circle(radius);

2)   Now create an ArrayList (or another List type)  and add your shapes to your list.   Notice the use of the generic <Shape> that defines the type of objects to be stored in your List container.  

Example:  

ArrayList<Shape> shapes=new ArrayList<>();
shapes.add(circle);
shapes.add(rectangle);
shapes.add(triangle);

3) In your main class or a method called from main, iterate over the results, printing the className of your shape followed by the area and perimeter calculations,  e.g. as follows using a for, or foreach  loop: 

// Limit precision to two or three decimal points. 
DecimalFormat df = new DecimalFormat();
df.setMaximumFractionDigits(2);
for (Shape shape:shapes) {
    System.out.println(shape.getClass().getSimpleName() + " area: " + df.format(shape.getArea()));
      System.out.println(shape.getClass().getSimpleName() + " perimeter " + df.format(shape.getPerimeter()));
}

Or using an iterator: 

         System.out.println("\n");
         ListIterator<Shape> iterator = shapes.listIterator();
         while (iterator.hasNext()) {
                 Shape shape = iterator.next();
                  System.out.println(shape.getClass().getSimpleName() + " area: " + df.format( shape.getArea()));
                  System.out.println(shape.getClass().getSimpleName() + " perimeter " + df.format(shape.getPerimeter()));
}

Note that the println statement prints the class name of the concrete Shape class, e.g. Rectangle, Triangle, Circle.  

Try to do this on your own, but if you get stuck,  you can download a start file: TestShapes (1).java Download TestShapes (1).java.  You will need to fill in the sections indicated by "Implement me".  

Submission:  Submit working source code with no compilation errors,  plus a screenshot of your test result output.

Extra credit:  Add more shape types to your design. 
