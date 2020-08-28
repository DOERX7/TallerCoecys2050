/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import Objeto.Nodo1P;
import Objeto.Pokemon;

/**
 *
 * @author DOER <Talleres coecys 2050 - USAC 2020>
 */
public class Cola {
    private Nodo1P inicio;
    private Nodo1P final_cola;
    public Cola(){
        this.inicio=null;
        this.final_cola=null;
    }
    public void encolar(Pokemon p){
        Nodo1P nuevo = new Nodo1P(p);
        if(inicio==null){
            this.inicio = nuevo;
            this.final_cola = nuevo;
            return;
        }
        this.final_cola.setSiguiente(nuevo);
        this.final_cola = nuevo;
    }
    
    public void desencolar(){
        if(inicio==null){
            System.out.println("Cola vacia");
            return;
        }
        if(inicio==final_cola){
            /*Esta linea me falto*/
            this.inicio=null;
            this.final_cola=null;
            return;
        }
        Nodo1P aux = inicio.getSiguiente();
        this.inicio=null;
        this.inicio=aux;
        
    }
    
    public void recorrerCola(){
        Nodo1P aux = this.inicio;
        while(aux!=null){
            System.out.println("Nombre: "+aux.getDato().getNombre());
            aux=aux.getSiguiente();
        }
    }
    
    public void mostrarInicio(){
        if(this.inicio==null){
            System.out.println("La cola esta vacia");
        }else{
            System.out.println("El inicio de la cola es: "+this.inicio.getDato().getNombre());
        }
    }

    public void mostrarFinal(){
        if(this.final_cola==null){
            System.out.println("La cola esta vacia");
        }else{
            System.out.println("El final de la cola es: "+this.final_cola.getDato().getNombre());
        }
    }

    public Nodo1P getInicio() {
        return inicio;
    }

    public void setInicio(Nodo1P inicio) {
        this.inicio = inicio;
    }

    public Nodo1P getFinal_cola() {
        return final_cola;
    }

    public void setFinal_cola(Nodo1P final_cola) {
        this.final_cola = final_cola;
    }

    
}
