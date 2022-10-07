interface Shapes {
    double area();
    double perimeter();
}


//Circle radius = r
class Circle implements Shapes{
    double r;

    Circle(double r){
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2* Math.PI* r;
    }

}

//Triangle a, b, c = sides w/ s
class Triangle implements Shapes{
    double a;
    double b;
    double c;

    Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p= perimeter()/2;

        double result = (p*(p-a)*(p-b)*(p-c));
        if(result<0) result = result * -1;

        return Math.sqrt(result);
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}

//Rectangle, Square, Rhombus, etc.. all parallelograms and all similar
//Parallelogram - h and b
class Parallelogram implements Shapes{
    double h;
    double b;

    Parallelogram(double h, double b){
        this.h = h;
        this.b = b;
    }

    @Override
    public double area() {
        return h * b;
    }

    @Override
    public double perimeter() {
        return 2* (h+b);
    }

}

//Rectangle - length and width - l and w
class Rectangle implements Shapes{
    double l;
    double w;

    Rectangle(double l,double w){
        this.l = l;
        this.w= w;
    }

    @Override
    public double area() {
        return l*w;
    }

    @Override
    public double perimeter() {
        return 2*(l+w);
    }

}

//Square - side - s
class Square implements Shapes{
    double s;

    Square(double s){
        this.s = s;
    }

    @Override
    public double area() {
        return s* s;
    }

    @Override
    public double perimeter() {
        return 4* s;
    }
}


//Now we have the polygons - Pentagons, Hexagons, Triangles ect.
//We could put some parallelograms here (like squares), but we're keeping this simple(ish)
//Pentagon - side - s
class Pentagon implements Shapes{
    double s;

    Pentagon(double s){
        this.s = s;
    }

    @Override
    public double area() {
        return (5 *(s*s)) / (4*Math.tan(Math.PI/5));
    }

    @Override
    public double perimeter() {
        return 5* s;
    }

}

//Hexagon - side - s
//Essentially the same as above just with 6 sides instead of 5
class Hexagon implements Shapes{
    double s;

    Hexagon(double s){
        this.s = s;
    }

    @Override
    public double area() {
        return (6*(s*s))/(4*Math.tan(Math.PI/6));
    }

    @Override
    public double perimeter() {
        return 6* s;
    }

}

//Heptagon - 7 sides - s
class Heptagon implements Shapes{
    double s;

    Heptagon(double s){
        this.s = s;
    }

    @Override
    public double area() {
        return 3.634*Math.pow(s,2);
    }

    @Override
    public double perimeter() {
        return 7* s;
    }

}

//Ellipse or oval
//x and y represent the minor and major axes
class Ellipse implements Shapes{
    double y;
    double x;

    Ellipse(double y, double x){
        this.y = y;
        this.x = x;
    }

    @Override
    public double area() {
        return (Math.PI * y * x);
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI * Math.sqrt(0.5 * y * y * x * x));
    }

}