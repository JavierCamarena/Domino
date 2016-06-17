/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author xaovs
 */
public class Cliente {
    public static void main(String[] args) throws IOException {
        String serverIp = "localhost";
        int puerto = 9100;
        Socket socket = new Socket(serverIp,puerto);
    }
}
