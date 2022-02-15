package CSC1009.wk05_lab;

public class RectangleFromGeometricObject extends GeometricObject{

    private double width;
    private double height;

    public RectangleFromGeometricObject(){

    }

    public RectangleFromGeometricObject(double width, double height){
        this.width = width;
        this.height = height;
    }

    public RectangleFromGeometricObject(double width, double height, String color, boolean filled){
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

	@Override
	public double getRadius() {
        return 0;
	}

	@Override
	public double getDiameter() {
		return 0;
	}



}
