/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallercoecys2050produccion;

import TDA.Cola;
import TDA.DoblementeEnlazada;
import TDA.ListaEnlazada;
import TDA.Pila;

/**
 *
 * @author DOER <CEO de La Gran Pvta Squad>
 */
class Init {
    private ListaEnlazada listaPokemonesKanto;
    
    private Pila pilaPokemon;
    private Cola colaPokemon;
    
    private DoblementeEnlazada listaPokemonesJontho;
    public Init(){
        listaPokemonesKanto = new ListaEnlazada();
        listaPokemonesJontho = new DoblementeEnlazada();   
        pilaPokemon = new Pila();
        colaPokemon = new Cola();
    }

    public ListaEnlazada getListaPokemonesKanto() {
        return listaPokemonesKanto;
    }

    public void setListaPokemonesKanto(ListaEnlazada listaPokemonesKanto) {
        this.listaPokemonesKanto = listaPokemonesKanto;
    }

    public DoblementeEnlazada getListaPokemonesJontho() {
        return listaPokemonesJontho;
    }

    public void setListaPokemonesJontho(DoblementeEnlazada listaPokemonesJontho) {
        this.listaPokemonesJontho = listaPokemonesJontho;
    }

    public Cola getColaPokemon() {
        return colaPokemon;
    }

    public void setColaPokemon(Cola colaPokemon) {
        this.colaPokemon = colaPokemon;
    }

    public Pila getPilaPokemon() {
        return pilaPokemon;
    }

    public void setPilaPokemon(Pila pilaPokemon) {
        this.pilaPokemon = pilaPokemon;
    }
    
}
