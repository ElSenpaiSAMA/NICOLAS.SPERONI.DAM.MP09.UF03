package nicolas.speroni.dam.mp09.uf03.a01.cliente;

import nicolas.speroni.dam.mp09.uf03.a01.model.Libro;
import nicolas.speroni.dam.mp09.uf03.a01.utils.Comunicador;

import java.io.IOException;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        String servidor = "localhost";
        int puerto = 12345;

        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez");

        try (Socket socket = new Socket(servidor, puerto)) {
            System.out.println("Conectado al servidor");

            Comunicador.enviarObjeto(libro, socket);
            System.out.println("Libro enviado: " + libro);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
