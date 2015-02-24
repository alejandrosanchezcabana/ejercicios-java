package edu.upc.eetac.dsa.alejandro.ex2;

public class Square extends AbstractShape{
	private int altura, anchura;
	
	public Square(int altura, int anchura){
		super ("rectangle");
		this.altura=altura;
		this.anchura=anchura;
	}
	
	public int GetAltura(){
		return altura;
	}
	public int GetAnchura(){
		return anchura;
	}
	public void SetAltura(int altura){
		this.altura=altura;
	}
	public void SetAnchura(int anchura){
		this.anchura=anchura;
	}
	
	
	//Override
	public double area() {
		return anchura*altura;
	}
}
