package CSC1009.wk05_lab;

import java.util.Date;

public abstract class GeometricObject{
    
    private String color = "white";
    private boolean filled;
    java.util.Date createdDate = new java.util.Date();
    
    public GeometricObject(){
        createdDate = new Date();
    }

    public GeometricObject(String color, boolean filled){
        createdDate = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    public String toString(){
        return "created on " + createdDate + "\ncolor: " + color + " and filled : " + filled;
    }
    
    public abstract double getRadius();
    public abstract double getArea();
    public abstract double getDiameter();
    public abstract double getPerimeter();

}
