/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import Objeto.Nodo2P;
import Objeto.Pokemon;

/**
 *
 * @author DOER <Talleres coecys 2050 - USAC 2020>
 */
public class DoblementeEnlazada {
    Nodo2P inicio;
    
    public DoblementeEnlazada(){
        this.inicio = null;
    }
    
    public void insertarNumericamente(Pokemon p){
        Nodo2P nuevo = new Nodo2P(p);
        
        if(this.inicio==null){
            this.inicio=nuevo;
            return;
        }
        Nodo2P anterior = null;
        Nodo2P posterior = this.inicio;
        /*Que pasa si es menor que el primero*/
        if(nuevo.getDato().getId()<this.inicio.getDato().getId()){
            nuevo.setSiguiente(this.inicio);
            nuevo.setAnterior(null);
            this.inicio.setAnterior(nuevo);
            this.inicio = nuevo;
            return;
        }
        /*Insertar en medio*/
        while(posterior!=null){
            if(nuevo.getDato().getId()<posterior.getDato().getId() && nuevo.getDato().getId()>anterior.getDato().getId()){
                nuevo.setSiguiente(posterior);
                nuevo.setAnterior(anterior);
                
                posterior.setAnterior(nuevo);
                anterior.setSiguiente(nuevo);
            }
            anterior = posterior;
            posterior=posterior.getSiguiente();
        }
        /*
        insercion al final
        */
        nuevo.setAnterior(anterior);
        anterior.setSiguiente(nuevo);
    }
    
}
