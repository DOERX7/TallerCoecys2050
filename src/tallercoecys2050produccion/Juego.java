/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallercoecys2050produccion;

import Objeto.Pokemon;


public class Juego {
    Init i;
    
    public Juego(Init i){
        this.i=i;
//        juegoListaEnlazada();
//        juegoPila();
//        juegoCola();
        juegoDoblementeEnlazada();
    }
    
    
    public void juegoListaEnlazada(){
        System.out.println("--Inicio lista enlazada--");
        Pokemon p = new Pokemon();
        p.setId(1);
        p.setNombre("Bulbasaur");
        i.getListaPokemonesKanto().insertar(p);
        Pokemon px = new Pokemon(7,"charmander");

        i.getListaPokemonesKanto().insertar(px);

        i.getListaPokemonesKanto().insertar(new Pokemon(2,"Venusar"));
        i.getListaPokemonesKanto().insertar(new Pokemon(3,"Pikachu"));
        i.getListaPokemonesKanto().insertar(new Pokemon(4,"Gardeboy"));
        
        i.getListaPokemonesKanto().mostrar();
        i.getListaPokemonesKanto().eliminarPorNombre("Bulbasaur");
        i.getListaPokemonesKanto().eliminarPorNombre("Pikachu");
     
        
        i.getListaPokemonesKanto().buscarPorNombre("Venusar");
        
        i.getListaPokemonesKanto().modificarNombrePorNombre("charmander","Charizard");
        i.getListaPokemonesKanto().mostrar();
        System.out.println("--Fin lista enlazada--");
        
    }
    
    public void juegoPila(){
        System.out.println("--Inicio pila--");
        Pokemon p1 = new Pokemon(1,"Bulbasaur");
        Pokemon p2 = new Pokemon(2,"Ivysaur");
        Pokemon p3 = new Pokemon(3,"Venusaur");
        Pokemon p4 = new Pokemon(4,"Charmander");
        Pokemon p5 = new Pokemon(5,"Charmeleon");
        Pokemon p6 = new Pokemon(6,"Charizard");
        
        System.out.println("--Antes de insertar--");
        this.i.getPilaPokemon().recorrerPila();
        this.i.getPilaPokemon().mostrarTope();
        
        System.out.println("--Insertando--");
        this.i.getPilaPokemon().apilar(p1);
        this.i.getPilaPokemon().recorrerPila();
        this.i.getPilaPokemon().mostrarTope();

        this.i.getPilaPokemon().apilar(p2);
        this.i.getPilaPokemon().recorrerPila();
        this.i.getPilaPokemon().mostrarTope();

        this.i.getPilaPokemon().apilar(p3);
        this.i.getPilaPokemon().recorrerPila();
        this.i.getPilaPokemon().mostrarTope();

        this.i.getPilaPokemon().apilar(p4);
        this.i.getPilaPokemon().recorrerPila();
        this.i.getPilaPokemon().mostrarTope();

        this.i.getPilaPokemon().apilar(p5);
        this.i.getPilaPokemon().recorrerPila();
        this.i.getPilaPokemon().mostrarTope();

        this.i.getPilaPokemon().apilar(p6);
        this.i.getPilaPokemon().recorrerPila();
        this.i.getPilaPokemon().mostrarTope();

        System.out.println("--Desapilando--");
        while(this.i.getPilaPokemon().getTope()!=null){
            this.i.getPilaPokemon().mostrarTope();
            this.i.getPilaPokemon().recorrerPila();
            this.i.getPilaPokemon().desapilar();
        }
        System.out.println("--Fin pila--");
    }
    
    public void juegoCola(){
        System.out.println("Esta linea no estaba");
        System.out.println("--Inicio cola--");
        Pokemon p7 = new Pokemon(7,"Squirtle");
        Pokemon p8 = new Pokemon(8,"Wartortle");
        Pokemon p9 = new Pokemon(9,"Blastoise");
        Pokemon p10 = new Pokemon(7,"Caterpie");
        Pokemon p11 = new Pokemon(8,"Metapod");
        Pokemon p12 = new Pokemon(9,"Butterfree");
        
        System.out.println("--Antes de insertar--");
        this.i.getColaPokemon().recorrerCola();
        this.i.getColaPokemon().mostrarFinal();
        this.i.getColaPokemon().mostrarInicio();

        this.i.getColaPokemon().encolar(p7);
        this.i.getColaPokemon().mostrarInicio();
        this.i.getColaPokemon().mostrarFinal();
        this.i.getColaPokemon().recorrerCola();

        this.i.getColaPokemon().encolar(p8);
        this.i.getColaPokemon().mostrarInicio();
        this.i.getColaPokemon().mostrarFinal();
        this.i.getColaPokemon().recorrerCola();
        
        this.i.getColaPokemon().encolar(p9);
        this.i.getColaPokemon().mostrarInicio();
        this.i.getColaPokemon().mostrarFinal();
        this.i.getColaPokemon().recorrerCola();

        this.i.getColaPokemon().encolar(p10);
        this.i.getColaPokemon().mostrarInicio();
        this.i.getColaPokemon().mostrarFinal();
        this.i.getColaPokemon().recorrerCola();

        this.i.getColaPokemon().encolar(p11);
        this.i.getColaPokemon().mostrarInicio();
        this.i.getColaPokemon().mostrarFinal();
        this.i.getColaPokemon().recorrerCola();

        this.i.getColaPokemon().encolar(p12);
        this.i.getColaPokemon().mostrarInicio();
        this.i.getColaPokemon().mostrarFinal();
        this.i.getColaPokemon().recorrerCola();
        
        System.out.println("--Desencolando--");
        while(this.i.getColaPokemon().getFinal_cola()!=null){
            this.i.getColaPokemon().recorrerCola();
            this.i.getColaPokemon().mostrarFinal();
            this.i.getColaPokemon().mostrarInicio();
            this.i.getColaPokemon().desencolar();
        }
        System.out.println("--Fin cola--");
    }
    
    public void juegoDoblementeEnlazada(){
        System.out.println("Inserciones");
        Pokemon p1 = new Pokemon(1,"Chikorita");
        Pokemon p2 = new Pokemon(2,"Bayleef");
        Pokemon p3 = new Pokemon(3,"Meganium");
        Pokemon p4 = new Pokemon(4,"Cyndaquil");
        Pokemon p5 = new Pokemon(5,"Quilava");
        Pokemon p6 = new Pokemon(6,"Typhlosion");
        Pokemon p7 = new Pokemon(7,"Totodile");
        System.out.println("Inicia juego Doblemente enlazada");
        System.out.println("---Inserciones al principio---");
        i.getListaPokemonesJontho().insertarAlPrincipio(p1);
        i.getListaPokemonesJontho().insertarAlPrincipio(p2);
        i.getListaPokemonesJontho().insertarAlPrincipio(p3);
        i.getListaPokemonesJontho().insertarAlPrincipio(p4);
        i.getListaPokemonesJontho().insertarAlPrincipio(p5);
        i.getListaPokemonesJontho().insertarAlPrincipio(p6);
        i.getListaPokemonesJontho().insertarAlPrincipio(p7);
        i.getListaPokemonesJontho().mostrar();
        System.out.println("Eliminando especificamente por ID");
        System.out.println("El primero");
        i.getListaPokemonesJontho().eliminarPorNombre("Chikorita");
        i.getListaPokemonesJontho().mostrar();
        System.out.println("El ultimo");
        i.getListaPokemonesJontho().eliminarPorNombre("Typhlosion");
        i.getListaPokemonesJontho().mostrar();
        System.out.println("Los que quedan");
        i.getListaPokemonesJontho().eliminarPorNombre("Bayleef");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Totodile");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Cyndaquil");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Meganium");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Quilava");
        i.getListaPokemonesJontho().mostrar();
        
        System.out.println("---Inserciones al final---");
        i.getListaPokemonesJontho().insertarAlFinal(p1);
        i.getListaPokemonesJontho().insertarAlFinal(p2);
        i.getListaPokemonesJontho().insertarAlFinal(p3);
        i.getListaPokemonesJontho().insertarAlFinal(p4);
        i.getListaPokemonesJontho().insertarAlFinal(p5);
        i.getListaPokemonesJontho().insertarAlFinal(p6);
        i.getListaPokemonesJontho().insertarAlFinal(p7);
        i.getListaPokemonesJontho().mostrar();
        System.out.println("Eliminando especificamente por ID");
        System.out.println("El primero");
        i.getListaPokemonesJontho().eliminarPorNombre("Chikorita");
        i.getListaPokemonesJontho().mostrar();
        System.out.println("El ultimo");
        i.getListaPokemonesJontho().eliminarPorNombre("Typhlosion");
        i.getListaPokemonesJontho().mostrar();
        System.out.println("Los que quedan");
        i.getListaPokemonesJontho().eliminarPorNombre("Bayleef");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Totodile");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Cyndaquil");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Meganium");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Quilava");
        i.getListaPokemonesJontho().mostrar();
        
        System.out.println("--- Insercion ordenada numericamente ---");
        i.getListaPokemonesJontho().insertarNumericamente(p4);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarNumericamente(p6);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarNumericamente(p1);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarNumericamente(p7);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarNumericamente(p3);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarNumericamente(p2);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarNumericamente(p5);
        i.getListaPokemonesJontho().mostrar();
        
        System.out.println("Eliminando especificamente por ID");
        System.out.println("El primero");
        i.getListaPokemonesJontho().eliminarPorNombre("Chikorita");
        i.getListaPokemonesJontho().mostrar();
        System.out.println("El ultimo");
        i.getListaPokemonesJontho().eliminarPorNombre("Typhlosion");
        i.getListaPokemonesJontho().mostrar();
        System.out.println("Los que quedan");
        i.getListaPokemonesJontho().eliminarPorNombre("Bayleef");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Totodile");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Cyndaquil");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Meganium");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Quilava");
        i.getListaPokemonesJontho().mostrar();
        

        System.out.println("--- Insercion ordenada alfabeticamente DESC ---");
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoDesc(p4);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoDesc(p6);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoDesc(p1);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoDesc(p7);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoDesc(p3);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoDesc(p2);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoDesc(p5);
        i.getListaPokemonesJontho().mostrar();
        
                System.out.println("Eliminando especificamente por ID");
        System.out.println("El primero");
        i.getListaPokemonesJontho().eliminarPorNombre("Chikorita");
        i.getListaPokemonesJontho().mostrar();
        System.out.println("El ultimo");
        i.getListaPokemonesJontho().eliminarPorNombre("Typhlosion");
        i.getListaPokemonesJontho().mostrar();
        System.out.println("Los que quedan");
        i.getListaPokemonesJontho().eliminarPorNombre("Bayleef");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Totodile");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Cyndaquil");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Meganium");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().eliminarPorNombre("Quilava");
        i.getListaPokemonesJontho().mostrar();
        
        System.out.println("--- Insercion ordenada alfabeticamente ASC ---");
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoAsc(p4);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoAsc(p6);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoAsc(p1);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoAsc(p7);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoAsc(p3);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoAsc(p2);
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().insertarAlfabeticamenteOrdenadoAsc(p5);
        i.getListaPokemonesJontho().mostrar();
        
        System.out.println("Modificar");
        i.getListaPokemonesJontho().modificar("Totodile","Charizardo");
        i.getListaPokemonesJontho().mostrar();
        i.getListaPokemonesJontho().modificar("Chikorita","La pera");
        i.getListaPokemonesJontho().mostrar();
        
        System.out.println("Finaliza juego Doblemente enlazada");
    }
    
    
}
