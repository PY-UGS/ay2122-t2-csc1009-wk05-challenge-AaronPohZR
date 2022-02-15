package CSC1009.wk05_lab;

public class Ellipse extends Shape{
    public Ellipse(double dim1, double dim2){
        this.setDim1(dim1);
        this.setDim2(dim2);
    }

    public double area(){
        System.out.println("Inside Area for Ellipse.");
        return getDim1() * getDim2() * this.getPie();
    }
}
