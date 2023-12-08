
package com.mycompany.losnegativos;
import java.util.ArrayList;

public class Libro {
    
    public String nombre;
    public String editorial;
    public String tipo;
    public String año;
   public ArrayList<Autor> escrito;
   public ArrayList<Copia> copias;

    public Libro(String nombre, String editorial, String tipo, String año) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.tipo = tipo;
        this.año = año;
        this.escrito = new ArrayList<>();
        this.copias = new ArrayList<>();
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
    public void setCopias(ArrayList<Copia> copias) {
        this.copias = copias;
    }
    
}
