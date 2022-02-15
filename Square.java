package CSC1009.wk05_lab;

public class Square extends Shape{

    public Square(double dim1, double dim2){
        this.setDim1(dim1);
        this.setDim2(dim2);
    }

    public double area(){
        System.out.println("Inside Area for Square.");
        return getDim1() * getDim2();
    }
}
