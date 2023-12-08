package com.mycompany.losnegativos;
import java.util.ArrayList;

public class Autor {
    
    public String nombre;
    public String nacionslidad;
    public String fechaNacimiento;
     public ArrayList<Libro> libros; 

    public Autor(String nombre, String nacionslidad, String fechaNacimiento) {
        this.nombre = nombre;
        this.nacionslidad = nacionslidad;
        this.fechaNacimiento = fechaNacimiento;
        this.libros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionslidad=" + nacionslidad + ", fechaNacimiento=" + fechaNacimiento + ", libros=" + libros + '}';
    }
    
    
          
}
