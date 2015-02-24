package edu.upc.eetac.dsa.alejandro.ex3;

public class ex3 {
	public static void main(String[] args){
		if (args.length!=1){
			System.err.println("El nombre del fichero es erroneo");
			System.exit(-1);
		}
		try{
			double average = AverageCalculator.average(args[0]);
			System.out.println("La media es: "+average);
		}catch (FileParsingException e){
			e.printStackTrace();
		}catch (BigNumberException e){
			e.printStackTrace();
		}
	}
}
