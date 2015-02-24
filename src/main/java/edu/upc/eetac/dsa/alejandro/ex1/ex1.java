package edu.upc.eetac.dsa.alejandro.ex1;

/**
 * Hello world!
 */
public class ex1 {
    public static void main(String[] args) {
    	Tree[]arboles2=new Tree[12];
        //Tree[] arboles = new Tree[4];
        arboles2[0] = new Tree(4);
        arboles2[1] = new Tree("Roble");
        arboles2[2] = new Tree();
        arboles2[3] = new Tree(5, "Pino");
        arboles2[4] = new Tree(14);
        arboles2[5] = new Tree("Olmo");
        arboles2[6] = new Tree();
        arboles2[7] = new Tree(15, "Pino blanco");
        arboles2[8] = new Tree(24);
        arboles2[9] = new Tree("Sauce");
        arboles2[10] = new Tree();
        arboles2[11] = new Tree(25, "Encina");
        for (Tree t : arboles2)
            System.out.println(t);
    }
}
 