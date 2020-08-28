/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author DOER <CEO de La Gran Pvta Squad>
 */
public class Pokemon {
    private int id;
    private String nombre;
    
    /*El clase objeto es el molde y la instancia es la galleta*/
    
    public Pokemon(){
        this.id = -1;
        this.nombre = "";
    }
    
    public Pokemon(int id,String n){
        this.id=id;
        nombre=n;
    }
    
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }

    public void setNombre(String n){
        this.nombre=n;
    }
    public String getNombre(){
        return this.nombre;
    }
    
}
