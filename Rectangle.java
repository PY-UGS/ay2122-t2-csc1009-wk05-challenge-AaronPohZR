package CSC1009.wk05_lab;

public class Rectangle extends Shape{
    
    public Rectangle(double dim1, double dim2){
        this.setDim1(dim1);
        this.setDim2(dim2);
    }

    public double area(){
        System.out.println("Inside Area for Rectangle.");
        return getDim1() * getDim2();
    }
}
