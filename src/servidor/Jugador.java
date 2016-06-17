/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import clasesGenericas.Ficha;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xaovs
 */
public class Jugador {
    private Socket socket;
    public String nombre;
    public PrintWriter output;
    
    
    public Jugador(Socket socket,String nombre){
        this.socket = socket;
        this.nombre = nombre;
        try {
            output = new PrintWriter(socket.getOutputStream());
        } catch (IOException ex) {
            System.out.println("Error al crear el socket de salida");
        }
    }
    
    public void play(){
        
    }
    
    public void notificaMovimientoOponente(Ficha f,int lado ){
        String mensaje = "MOV ";
        int val[]= f.getValores();
        mensaje+= val[0];
        mensaje+= val[1];
        mensaje+= lado;
        output.println(mensaje);
    }
    public void mensaje(String mensaje){
        output.println(mensaje);
    }
}
