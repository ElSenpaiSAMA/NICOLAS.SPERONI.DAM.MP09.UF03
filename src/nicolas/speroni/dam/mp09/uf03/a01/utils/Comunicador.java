package nicolas.speroni.dam.mp09.uf03.a01.utils;

import java.io.*;
import java.net.Socket;

public class Comunicador {
    public static void enviarObjeto(Object objeto, Socket socket) throws IOException {
        ObjectOutputStream salida = new ObjectOutputStream(socket.getOutputStream());
        salida.writeObject(objeto);
        salida.flush();
    }

    public static Object recibirObjeto(Socket socket) throws IOException, ClassNotFoundException {
        ObjectInputStream entrada = new ObjectInputStream(socket.getInputStream());
        return entrada.readObject();
    }
}
