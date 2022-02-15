package CSC1009.wk05_lab;

public class Triangle extends Shape{
    public Triangle(double dim1, double dim2){
        this.setDim1(dim1);
        this.setDim2(dim2);
    }

    public double area(){
        System.out.println("Inside Area for Triangle.");
        return (getDim1() * getDim2())/2 ;
    }
}
