/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibro {
    //Asociacion
    private Libro[] coleccion;

    public ConjuntoLibro() {
        this.coleccion=new Libro[4];
    }
    
    public boolean anadirLibro(Libro libro){
        for (int i = 0; i <this.coleccion.length; i++) {
            if(this.coleccion[i]==null){
                this.coleccion[i]=libro;
                return true;
            }
        }
        return false;
    }
    public boolean eliminarbyAutor(String autor){
        for (int i = 0; i <this.coleccion.length; i++) {
            if(this.coleccion[i].getAutor().equals(autor)){
                this.coleccion.
        }
    }
    public boolean eliminarbyTitulo(String titulo){
        return false;
    }
    
    public Libro obtenerMejorCalificado(){
        return null;
    }
    public Libro obtenerPeorCalificado(){
        return null;
    }
    public Libro[] obtenerLibros(){
        return this.coleccion;
    }
}
