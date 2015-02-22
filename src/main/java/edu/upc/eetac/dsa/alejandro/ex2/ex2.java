package edu.upc.eetac.dsa.alejandro.ex2;

public class ex2{
	public static void main(String[] args){
		shape[] shapes=new shape[2];
		shapes[0]=new circle(2.5);
		shapes[1]=new Square(2, 5);
		for (shape shape : shapes)
			System.out.println(shape+" with area = "+ shape.area());
	}
}