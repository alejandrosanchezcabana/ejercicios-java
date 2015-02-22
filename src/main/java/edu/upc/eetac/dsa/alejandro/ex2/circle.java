package edu.upc.eetac.dsa.alejandro.ex2;

public class circle extends AbstractShape{
	private double radio;
	
	public circle(double radio){
		super("circle");
		this.radio=radio;
	}
	
	public double GetRadio(){
		return radio;
	}
	public void SetRadio(double radio){
		this.radio=radio;
	}
	
	//Override
	public double area(){
		return (Math.PI*radio*radio);
	}
}