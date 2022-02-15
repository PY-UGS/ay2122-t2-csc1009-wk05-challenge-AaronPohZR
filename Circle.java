package CSC1009.wk05_lab;

public class Circle extends Shape{
    public Circle(double dim1, double dim2){
        this.setDim1(dim1);
        this.setDim2(dim2);
    }

    public double area(){
        System.out.println("Inside Area for Circle.");
         return getDim1() * getDim2() * this.getPie();
    }
}
