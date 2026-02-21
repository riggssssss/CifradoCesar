package org.example;

public class MiCifrado {

    // Mi metodo cifra el texto haciendo primero un cifrado cesar y luego dandole la
    // vuelta a la frase entera
    public static String cifrar(String mensaje, int clave) {
        String cifradoCesar = CifradoCesar.cifrar(mensaje, clave);
        StringBuilder alReves = new StringBuilder(cifradoCesar);
        return alReves.reverse().toString();
    }

    // Para descifrar hago justo lo contrario: le doy la vuelta y luego lo descifro
    // con el cesar normal
    public static String descifrar(String mensajeCifrado, int clave) {
        StringBuilder alReves = new StringBuilder(mensajeCifrado);
        String vueltoNormal = alReves.reverse().toString();
        return CifradoCesar.descifrar(vueltoNormal, clave);
    }

    public static void main(String[] args) {
        System.out.println("Pruebas algoritmo propio:");

        String texto = "hola mundo";
        int clave = 4;

        System.out.println("Texto a cifrar: " + texto);
        String cifrado = cifrar(texto, clave);
        System.out.println("Texto cifrado: " + cifrado);

        String descifrado = descifrar(cifrado, clave);
        System.out.println("Texto descifrado: " + descifrado);
    }
}
