package CSC1009.wk05_lab;

import CSC1009.wk05_lab.GeometricObject;
import CSC1009.wk05_lab.Shape;

public class Week05{
    
    public void wk05_question1(){

        GeometricObject circle = new CircleFromGeometricObject(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        GeometricObject rectangle = new RectangleFromGeometricObject(2, 4);
        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimenter is " + rectangle.getPerimeter());

    }

    public void wk05_question2(){
        
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);
        Shape figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Area is " + figref.area());
        figref = s;
        System.out.println("Area is " + figref.area());

    }

}