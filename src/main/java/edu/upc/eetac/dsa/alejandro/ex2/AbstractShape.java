package edu.upc.eetac.dsa.alejandro.ex2;

public abstract class AbstractShape implements shape{
	private String type;
	
	public AbstractShape (String type){
		this.type=type;
	}
	
	@Override
	public String toString(){
	return ("I'm a "+type);
	}
}
