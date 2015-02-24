package edu.upc.eetac.dsa.alejandro.ex4;

import java.io.*;

public class LectorEscritor {
	private int integer;
	private double decimal;
	private char character;
	
	public LectorEscritor (int integer, double decimal, char character){
		this.integer=integer;
		this.decimal=decimal;
		this.character=character;
	}
	public int GetInteger(){
		return integer;
	}
	public void SetInteger(int integer){
		this.integer=integer;
	}
	public double GetDecimal(){
		return decimal;
	}
	public void SetDecimal(double decimal){
		this.decimal=decimal;
	}
	public char GetChar(){
		return character;
	}
	public void SetChar(char character){
		this.character=character;
	}
	
	public void SaveToFile(String filename)throws IOException{
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(filename));
		dos.writeInt(integer);
		dos.writeDouble(decimal);
		dos.writeChar(character);
		dos.close();
	}
	public final static LectorEscritor readFromFile(String filename) throws IOException{
		DataInputStream dis = new DataInputStream(new FileInputStream(filename));
		int integer=dis.readInt();
		double decimal =dis.readDouble();
		char character=dis.readChar();
		return new LectorEscritor(integer, decimal, character);
	}
}
