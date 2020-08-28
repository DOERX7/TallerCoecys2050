/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto;

/**
 *
 * @author DOER <Talleres coecys 2050 - USAC 2020>
 */
public class Nodo2P {
    private Nodo2P siguiente;
    private Nodo2P anterior;
    
    private Pokemon dato;

    public Nodo2P() {
        this.siguiente=null;
        this.anterior=null;
    }

    public Nodo2P(Pokemon dato) {
        this.dato = dato;
        this.siguiente=null;
        this.anterior=null;
    }

    public Nodo2P getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo2P siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo2P getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo2P anterior) {
        this.anterior = anterior;
    }

    public Pokemon getDato() {
        return dato;
    }

    public void setDato(Pokemon dato) {
        this.dato = dato;
    }
    
    
    
}
