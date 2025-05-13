package nicolas.speroni.dam.mp09.uf03.a01.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Encriptador {
    private static final String CLAVE_SECRETA = "1234567890123456"; // 16 caracteres

    public static String encriptar(String datos) throws Exception {
        SecretKeySpec clave = new SecretKeySpec(CLAVE_SECRETA.getBytes(), "AES");
        Cipher cifrador = Cipher.getInstance("AES");
        cifrador.init(Cipher.ENCRYPT_MODE, clave);
        byte[] datosEncriptados = cifrador.doFinal(datos.getBytes());
        return Base64.getEncoder().encodeToString(datosEncriptados);
    }

    public static String desencriptar(String datosEncriptados) throws Exception {
        SecretKeySpec clave = new SecretKeySpec(CLAVE_SECRETA.getBytes(), "AES");
        Cipher cifrador = Cipher.getInstance("AES");
        cifrador.init(Cipher.DECRYPT_MODE, clave);
        byte[] datosDescifrados = cifrador.doFinal(Base64.getDecoder().decode(datosEncriptados));
        return new String(datosDescifrados);
    }
}
