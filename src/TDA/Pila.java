/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import Objeto.Nodo1P;
import Objeto.Pokemon;


public class Pila {
    private Nodo1P tope;
    
    public Pila(){
        this.tope = null;
    }
    
    public void apilar(Pokemon p){
        Nodo1P nuevo = new Nodo1P(p);
        if(this.tope==null){
            this.tope = nuevo;
            return;
        }
        nuevo.setSiguiente(this.tope);
        this.tope = nuevo;
    }
    
    public void desapilar(){
        if(this.tope==null){
            System.out.println("Pila vacia");
            return;
        }
        Nodo1P aux = this.tope.getSiguiente();
        this.tope =  null;
        this.tope = aux;
    }
    
    
    public void recorrerPila(){
        System.out.println("-----Recorrer pila-----");
        Nodo1P aux = tope;
        while(aux!=null){
            System.out.println("Nombre: "+aux.getDato().getNombre());
            aux=aux.getSiguiente();
        }
    }
    public void mostrarTope(){
        if(tope==null){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("El tope es: "+tope.getDato().getNombre());
        }
    }

    public Nodo1P getTope() {
        return tope;
    }

    public void setTope(Nodo1P tope) {
        this.tope = tope;
    }
    
}
