/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallercoecys2050produccion;

/**
 *
 * @author DOER <Talleres COECYS 2050 - USAC 2020>
 */
public class TallerCoecys2050 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Init que es nuestra bodega de TDA
        Init i = new Init();
        System.out.println("Ambiente de practica");
        new Juego(i);
        System.out.println("Fin de ambiente de practica");
    }
    
}
