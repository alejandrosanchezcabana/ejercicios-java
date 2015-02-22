package edu.upc.eetac.dsa.alejandro.ex1;

public class Tree {
private int altura;
private String especie;

public Tree(){
	this.altura=0;
	this.especie=null;
}
public Tree(int altura){
	this.altura=altura;
	this.especie=null;
}
public Tree (String especie){
	this.altura=0;
	this.especie=especie;
}
public Tree (int altura, String especie){
	this.altura=altura;
	this.especie=especie;
}

@Override
public String toString(){
	StringBuilder texto=new StringBuilder();
	texto.append("Un ");
	if (especie==null){
		texto.append("arbol");
	}
	else{
		texto.append(especie);
	}
	if (altura!=0){
		texto.append(" de " +altura+ " metros.");
	}
	else{
		texto.append(".");
	}
	return texto.toString();
}
}
