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
        System.out.println("Insercion ordenada de: "+p.getId()+" - "+p.getNombre());
        Nodo2P nuevo = new Nodo2P(p);
        
        if(this.inicio==null){
            this.inicio=nuevo;
            return;
        }

        /*Que pasa si es menor que el primero*/
        if(nuevo.getDato().getId()<this.inicio.getDato().getId()){
            nuevo.setSiguiente(this.inicio);
            nuevo.setAnterior(null);
            this.inicio.setAnterior(nuevo);
            this.inicio = nuevo;
            return;
        }
        Nodo2P anterior = this.inicio;
        Nodo2P posterior = this.inicio.getSiguiente();
        /*Insertar en medio*/
        while(posterior!=null){
            if(nuevo.getDato().getId()<posterior.getDato().getId() && nuevo.getDato().getId()>anterior.getDato().getId()){
                nuevo.setSiguiente(posterior);
                nuevo.setAnterior(anterior);
                
                posterior.setAnterior(nuevo);
                anterior.setSiguiente(nuevo);
                break;
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
            /*
        
        Si a.compareTo(b)
        si a>b resultado un numero positivo
        si a<b resultado un numero negativo
        si a==b reusultado un 0
        
        https://beginnersbook.com/2013/12/java-string-compareto-method-example/
        String str1 = "String method tutorial";
        String str2 = "compareTo method example";
        String str3 = "String method tutorial";

       int var1 = str1.compareTo( str2 );
       System.out.println("str1 & str2 comparison: "+var1);

       int var2 = str1.compareTo( str3 );
       System.out.println("str1 & str3 comparison: "+var2);

       int var3 = str2.compareTo("compareTo method example");
       System.out.println("str2 & string argument comparison: "+var3);
       
        Salida:
        str1 & str2 comparison: -16
        str1 & str3 comparison: 0
        str2 & string argument comparison: 0
        
        
        */
            
        public void insertarAlfabeticamenteOrdenadoAsc(Pokemon p){
        System.out.println("Insercion ordenada de: "+p.getId()+" - "+p.getNombre());
        Nodo2P nuevo = new Nodo2P(p);
        
        if(this.inicio==null){
            this.inicio=nuevo;
            return;
        }

        /*Que pasa si es menor que el primero*/
        if(nuevo.getDato().getNombre().compareTo(this.inicio.getDato().getNombre())<0){
            nuevo.setSiguiente(this.inicio);
            nuevo.setAnterior(null);
            this.inicio.setAnterior(nuevo);
            this.inicio = nuevo;
            return;
        }
        Nodo2P anterior = this.inicio;
        Nodo2P posterior = this.inicio.getSiguiente();
        /*Insertar en medio*/
        while(posterior!=null){
            if(nuevo.getDato().getNombre().compareTo(posterior.getDato().getNombre())>0 && nuevo.getDato().getNombre().compareTo(anterior.getDato().getNombre())<0){
                nuevo.setSiguiente(posterior);
                nuevo.setAnterior(anterior);
                
                posterior.setAnterior(nuevo);
                anterior.setSiguiente(nuevo);
                break;
            }
            anterior = posterior;
            posterior=posterior.getSiguiente();
        }
        /*
        insercion al final, si no esta en medio ni al principio, entonces es mayor que todos los demas
        */
        nuevo.setAnterior(anterior);
        anterior.setSiguiente(nuevo);
    }
    
    public void insertarAlfabeticamenteOrdenadoDesc(Pokemon p){
                System.out.println("Insercion ordenada de: "+p.getId()+" - "+p.getNombre());
        Nodo2P nuevo = new Nodo2P(p);
        
        if(this.inicio==null){
            this.inicio=nuevo;
            return;
        }

        /*Que pasa si es menor que el primero*/
        if(nuevo.getDato().getNombre().compareTo(this.inicio.getDato().getNombre())>0){
            nuevo.setSiguiente(this.inicio);
            nuevo.setAnterior(null);
            this.inicio.setAnterior(nuevo);
            this.inicio = nuevo;
            return;
        }
        Nodo2P anterior = this.inicio;
        Nodo2P posterior = this.inicio.getSiguiente();
        /*Insertar en medio*/
        while(posterior!=null){
            if(nuevo.getDato().getNombre().compareTo(posterior.getDato().getNombre())>0 && nuevo.getDato().getNombre().compareTo(anterior.getDato().getNombre())<0){
                nuevo.setSiguiente(posterior);
                nuevo.setAnterior(anterior);
                
                posterior.setAnterior(nuevo);
                anterior.setSiguiente(nuevo);
                break;
            }
            anterior = posterior;
            posterior=posterior.getSiguiente();
        }
        /*
        insercion al final, si no esta en medio ni al principio, entonces es mayor que todos los demas
        */
        nuevo.setAnterior(anterior);
        anterior.setSiguiente(nuevo);
    }
    
    
    
    public void insertarAlPrincipio(Pokemon p){
        Nodo2P nuevo = new Nodo2P(p);
        if(inicio==null){
            inicio = nuevo;
            return;
        }
        nuevo.setSiguiente(this.inicio);
        nuevo.setAnterior(null);
        this.inicio.setAnterior(nuevo);
        this.inicio = nuevo;
    }
    public void insertarAlFinal(Pokemon p){
        Nodo2P nuevo = new Nodo2P(p);
        Nodo2P aux = this.inicio;
        if(this.inicio==null){
            this.inicio = nuevo;
            return;
        }
        while(aux.getSiguiente()!=null){
            aux=aux.getSiguiente();
        }
        nuevo.setAnterior(aux);
        aux.setSiguiente(nuevo);
    }
    
    public void mostrar(){
        System.out.println("Lista doblemente enlazada de pokemones");
        Nodo2P aux = this.inicio;
        if(this.inicio==null){
            System.out.println("Esta vacia");
        }
        while(aux!=null){
            System.out.println("ID:"+aux.getDato().getId()+" Nombre:"+aux.getDato().getNombre());
            aux=aux.getSiguiente();
        }
        System.out.println("Fin de la lista");
    }
    public void modificar(String nombreAntiguo,String nombreNuevo){
        System.out.println("Cambiando el nombre del pokemon "+nombreAntiguo+" nombre nuevo: "+nombreNuevo);
        Nodo2P aux = this.inicio;
        if(this.inicio==null){
            System.out.println("Esta vacia");
        }
        while(aux!=null){
            if(aux.getDato().getNombre().equals(nombreAntiguo)){
                aux.getDato().setNombre(nombreNuevo);
            }
            System.out.println("ID:"+aux.getDato().getId()+" Nombre:"+aux.getDato().getNombre());
            aux=aux.getSiguiente();
        }
        
    }
    public void eliminarPorNombre(String nombreBuscado){
        /*
        3 escenarios
        1. eliminar el inicio
        2. eliminar en medio
        3. eliminar al final
        */
        
        System.out.println("Eliminando a:"+nombreBuscado);
        if(inicio==null){
            System.out.println("Lista vacia");
            return;
        }
        //Esta al principio
        
        if(this.inicio.getDato().getNombre().equals(nombreBuscado)){
            Nodo2P aux=this.inicio.getSiguiente();
            this.inicio=aux;
            return;
        }
        //Esta en medio
        /*
        Necesito tener el anterior y el siguiente
        voy a eliminar precisamente "aux"
        por lo que evaluare aux y posterior sera el siguiente del aux
        
        dejo la condicion de while(aux.getSiguiente()!=null){ porque si el que quiero eliminar es el ultimo
        entonces no voy a querer conectarlo todo, sino solo desconectarlo del penultimo
        */
        Nodo2P anterior = null;
        Nodo2P posterior = null;
        Nodo2P aux = this.inicio;
        while(aux!=null){
            if(aux.getDato().getNombre().equals(nombreBuscado)){
                //como se si es el ultimo?, porque su siguiente es igual a nulo
                posterior = aux.getSiguiente();
                if(posterior==null){
                    aux.setAnterior(null);
                    anterior.setSiguiente(null);
                    break;
                }
                //Si no es el ultimo entonces realizo esta movida:
                //Desconecto el que quiero eliminar
                aux.setSiguiente(null);
                aux.setAnterior(null);
                //Conecto los demas para no perder la lista
                anterior.setSiguiente(posterior);
                posterior.setAnterior(anterior);
                
                /*
                una forma de hacerlo sin anterior ni posterior es utilizando el siguiente del aux
                pero entonces el orden cambia, es bueno reflexionar porque

                aux.getSiguiente().setAnterior(aux.getAnterior());
                aux.getAnterior().setSiguiente(aux.getSiguiente());

                aux.setSiguiente(null);
                aux.setAnterior(null);
                
                */
            }
            anterior=aux;
            aux=aux.getSiguiente();
        }

    }
    
}
