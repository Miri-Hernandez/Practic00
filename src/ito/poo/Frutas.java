package ito.poo;

 public class Frutas {
     private String nombre;
     private float terrenos;
     private float costoProduccion;
     private float precioVenta;
     private int numPeriodos;
     private int cultibos;

     public Frutas(String nombre, float terrenos, float costoProduccion, float precioVenta, int numperiodo){
         this.nombre = nombre;
         this.terrenos = terrenos;
         this.costoProduccion = costoProduccion;
         this.precioVenta = precioVenta;
         this.numPeriodos = numperiodo;
         this.cultibos = 0;
     }
     public void cultibos(){
         this.cultibos++;

     }
     public String getNombre() {

         return nombre;
     }
     public float getTerrenos (){

         return terrenos;
     }
     public float getCostoProduccion (){

         return costoProduccion;
     }
     public float getPrecioVenta () {
         return precioVenta;
     }
     public int getNumPeriodos(){
         return numPeriodos;
     }
     public int getCultibos(){
         return cultibos;
     }


     @Override
     public String toString() {
         return "Frutas:{" + nombre + "," +  terrenos + "," + costoProduccion + "," + precioVenta + "," + numPeriodos + "," + cultibos + "}";
     }

 }


