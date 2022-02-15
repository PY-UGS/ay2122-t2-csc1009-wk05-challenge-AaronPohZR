package CSC1009.wk05_lab;

public class CircleFromGeometricObject extends GeometricObject{

    private double radius;

    public CircleFromGeometricObject(){
    
    }

    public CircleFromGeometricObject(double radius){
        this.radius = radius;
    }

    public CircleFromGeometricObject(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    
    public double getDiameter(){
        return 2 * radius; 
    }

	@Override
	public double getPerimeter() {
		return 0;
	}
	


}
