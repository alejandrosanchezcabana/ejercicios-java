package edu.upc.eetac.dsa.alejandro.ex3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import edu.upc.eetac.dsa.alejandro.ex3.BigNumberException;
import edu.upc.eetac.dsa.alejandro.ex3.FileParsingException;

public class AverageCalculator {
	public final static double average(String file) throws BigNumberException, FileParsingException{
		double sum=0d;
		double count=0d;
		BufferedReader reader=null;
		try{
			reader=new BufferedReader(new FileReader(file));
			String line=null;
			while ((line=reader.readLine())!=null){
				try{
					int number=Integer.parseInt(line);
					if (number>1000)
						throw new BigNumberException("El numero: "+number+" de la linea: "+count+" es superior a 1000");
					sum=sum+number;
					count++;
				}
				catch (NumberFormatException e){
					throw new FileParsingException(e.getMessage());
				}
			}
			catch (java.io.IOException e){
				throw new FileParsingException(e.getMessage());
			}	
		}
		finally{
			try{
				reader.close();
			}
			catch(IOException e){
				System.err.print("No es posible cerrar");
			}
		}
		return sum/count;
	}
}

