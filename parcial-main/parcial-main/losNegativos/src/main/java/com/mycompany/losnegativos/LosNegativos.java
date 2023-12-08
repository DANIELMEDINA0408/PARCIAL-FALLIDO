package com.mycompany.losnegativos;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import static spark.Spark.get;
import static spark.Spark.post;
import com.google.gson.Gson;
    
public class LosNegativos {
    
    public static void main(String[] args) {
        
    Autor autor = new Autor("Daniel", "Venezolano", "1856");
    Libro libro = new Libro("Hambre", "Panamericana", "Terror", "1802");
    Copia copia = new Copia("V564", "Disponible", libro);
    ArrayList<Libro> libros = new ArrayList<>();
    ArrayList<Lector> lectores = new ArrayList<>();
    Gson gson = new Gson();
    
    libro.escrito = new ArrayList<>();
    libros.add(libro);
    autor.libros.add(libro);
    libro.escrito.add(autor);
    libro.copias.add(copia);
    
     get("/libros", (var req, var res) -> {
        res.type("aplication/json");
         return gson.toJson(libros);
        });
     
     get("/lector", (var req, var res) -> {
        res.type("aplication/json");
         return gson.toJson(lectores);
        });
        
     get("/agregar", (var req, var res) -> {
        res.type("aplication/json");
         return gson.toJson(libros);
        });
        
        
    }}