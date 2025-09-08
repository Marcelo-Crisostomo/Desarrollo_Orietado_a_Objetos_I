package model;


public class Videojuego {
    private String titulo;
    private String genero;
    private int precio;

    public Videojuego(String titulo, String genero, int precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
    }

    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public int getPrecio() { return precio; }

    @Override
    public String toString() {
        return titulo + " | " + genero + " | $" + precio;
    }
}