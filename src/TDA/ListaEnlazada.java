/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA;

import Objeto.Nodo1P;
import Objeto.Pokemon;


public class ListaEnlazada {
    Nodo1P inicio;
    
    public ListaEnlazada(){
        this.inicio = null;
    }
    
    //estaVacia
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        }
        return false;
    }
    
    //insertar
    public void insertar(Pokemon p){
        Nodo1P nuevo = new Nodo1P(p);
        if(estaVacia()){
            this.inicio=nuevo;
        }else{
            Nodo1P aux = inicio;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    public void eliminarPorNombre(String nombre){
        Nodo1P aux = inicio;
   
        if(nombre.equals(inicio.getDato().getNombre())){
            aux = inicio.getSiguiente();
            this.inicio=null;
            this.inicio = aux;
            return;
        }
        //necesitamos el anterior y el siguiente
        //que tenemos que buscar cuando el nombre, coincida con el de en medio
        while(aux.getSiguiente()!=null){
            if(nombre.equals(aux.getSiguiente().getDato().getNombre())){
                //tengo que recuperar el nodo que iba despues de el que voy a eliminar
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
            }
            aux=aux.getSiguiente();
        }
    }
    
    public void mostrar(){
        System.out.println("-----Mostrar-----");
        Nodo1P aux = inicio;
        while(aux!=null){
            System.out.println("Nombre: "+aux.getDato().getNombre());
            aux=aux.getSiguiente();
        }
    }
    public void buscarPorNombre(String nombre){
        Nodo1P aux = inicio;
        while(aux!=null){
            if(aux.getDato().getNombre().equals(nombre)){
                System.out.println("Pokemon encontrado!");
                System.out.println("Nombre: "+aux.getDato().getNombre());
                break;
            }
            aux=aux.getSiguiente();
        }
    }
    public void modificarNombrePorNombre(String nombreAntiguo,String nombreNuevo){
        Nodo1P aux = inicio;
        while(aux!=null){
            if(aux.getDato().getNombre().equals(nombreAntiguo)){
//                aux.setDato(new Pokemon(100,"mewtwo"));
                aux.getDato().setNombre(nombreNuevo);
                break;
            }
            aux=aux.getSiguiente();
        }
        
    }
}
