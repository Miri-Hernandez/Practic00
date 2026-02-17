package ito.poo;

public class App {



        static Frutas frutas;
        static void run(){

            frutas= new Frutas("fresa",1000, 2000, 4000, 0);

            System.out.println("Estado  inicial: ");
            System.out.println(frutas);

            frutas.cultibos();

            System.out.println("\nDespues de Cultivar: ");
            System.out.println(frutas);
            System.out.println("Cultivos: " + frutas.getCultibos());
        }
        public static void main(String[] args) {
            run();
        }
    }


