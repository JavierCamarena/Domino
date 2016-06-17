/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import clasesGenericas.ListaDeFichas;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

/**
 *
 * @author xaovs
 */
public class Servidor {
    
    public static void main(String[] args) throws IOException {
        int clientes = 2;
        Juego juego = new Juego();
        ServerSocket listener = new ServerSocket(9100);
        System.out.println("Servidor iniciado. Esperando jugadores...");
        System.out.println("Creando Domino");
        ListaDeFichas listaDeFichas = new ListaDeFichas();
        listaDeFichas.crearDomino();
        listaDeFichas.imprimeLista();
        if(args.length > 0){
            clientes = Integer.parseInt( args[0] );
        }
        
        for(int i = 0; i < clientes; i++){
            Jugador j = new Jugador(listener.accept(), "Jugador"+(i+1));
            juego.jugadores.add(j);
        }
        
        juego.jugando();
        
    }
        
}

class Juego{
    public ArrayList<Jugador> jugadores;
    private int turno = 0;
        
    public Juego(){
        this.jugadores = new ArrayList<>();
            
    }
        
    public void jugando(){
            for (int i = 0; i < 10; i++) {
                System.out.println(turno);
                turno = (turno+1) % 4;
        }
    }
        
}