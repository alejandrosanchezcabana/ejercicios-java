package edu.upc.eetac.dsa.alejandro.ex5;

public class ex5 {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass threadClass = new ThreadClass("thread");
        Thread thread = new Thread(new RunnableClass(), "runnable");
        threadClass.start();
        thread.start();

        threadClass.join();
        thread.join();

        System.out.println("Fin");
    }
}