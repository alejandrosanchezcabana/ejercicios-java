package edu.upc.eetac.dsa.alejandro.ex4;

import java.io.File;
import java.io.IOException;


public class ex4 {
	public static void ex4(String args[]) throws IOException{
		LectorEscritor escritor = new LectorEscritor(5,7.1,'a');
		escritor.SaveToFile("Fichero");
		LectorEscritor lector = LectorEscritor.readFromFile("Fichero");
		System.out.println("El entero es: "+lector.GetInteger());
		System.out.println("El decimal es: "+lector.GetDecimal());
		System.out.println("El caracter es: "+lector.GetChar());
			
        File file = new File("Fichero");
        file.delete();
	}
}
