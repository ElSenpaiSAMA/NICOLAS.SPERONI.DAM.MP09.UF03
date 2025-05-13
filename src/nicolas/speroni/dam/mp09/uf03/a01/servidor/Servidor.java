package nicolas.speroni.dam.mp09.uf03.a01.servidor;

import nicolas.speroni.dam.mp09.uf03.a01.model.Libro;
import nicolas.speroni.dam.mp09.uf03.a01.utils.Comunicador;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        int puerto = 12345;
        try (ServerSocket servidor = new ServerSocket(puerto)) {
            System.out.println("Servidor escuchando en el puerto " + puerto + "...");

            Socket cliente = servidor.accept();
            System.out.println("Cliente conectado desde " + cliente.getInetAddress());

            Libro libroRecibido = (Libro) Comunicador.recibirObjeto(cliente);
            System.out.println("Libro recibido: " + libroRecibido);

            cliente.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
