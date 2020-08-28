/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/*
 */
public class Nodo1P {
    private Pokemon dato;
    private Nodo1P siguiente;

    public Nodo1P() {
        this.dato = new Pokemon();
        this.siguiente=null;
    }

    public Nodo1P(Pokemon dato, Nodo1P siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Nodo1P(Pokemon dato) {
        this.dato = dato;
        this.siguiente=null;
    }
    
    public Pokemon getDato() {
        return dato;
    }

    public void setDato(Pokemon dato) {
        this.dato = dato;
    }

    public Nodo1P getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo1P siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
