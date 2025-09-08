public class Fruta {             // Clase llamada Fruta
   /* private String nombre;                // private: solo accesible dentro de esta clase
    protected String color;              // protected: accesible en la misma clase, paquete y subclases
    int peso;                            // default (sin modificador): accesible solo dentro del mismo paquete
    public double precio;                // public: accesible desde cualquier clase


    String color;                  // Atributo: color de la fruta// Texto: nombre de la fruta (String)
    int pesoGramos;                 // Entero: peso en gramos (int)
    double precio;                  // Decimal: precio de la fruta (double)
    boolean estaMadura;             // Lógico: indica si está madura (boolean)

*/


    /*public Fruta(String nombreFruta) {  // Constructor con parámetro: se ejecuta al crear un objeto y recibe un nombre
        nombre = nombreFruta;             // Asigna el valor recibido al atributo 'nombre' de la clase
    }
    Fruta f = new Fruta("Piña");  // nombre = "Piña"
*/


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }



}