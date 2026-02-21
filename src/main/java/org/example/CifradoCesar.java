package org.example;

public class CifradoCesar {
    public static String cifrar(String mensaje, int desplazamiento) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            char caracter = mensaje.charAt(i);

            if (Character.isLetter(caracter)) {
                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                caracter = (char) ((caracter - base + desplazamiento) % 26 + base);
            }

            resultado.append(caracter);
        }

        return resultado.toString();
    }

    public static String descifrar(String mensajeCifrado, int desplazamiento) {
        return cifrar(mensajeCifrado, 26 - desplazamiento);
    }

    public static void main(String[] args) {
        System.out.println("Pruebas del Cifrado Cesar:");

        String texto = "HELLO";
        int clave = 3;
        String cifrado = cifrar(texto, clave);
        String descifrado = descifrar(cifrado, clave);

        System.out.println("Texto a cifrar: " + texto);
        System.out.println("Clave usada: " + clave);
        System.out.println("El texto cifrado es: " + cifrado);
        System.out.println("El texto descifrado es: " + descifrado);

        System.out.println("\nOtra prueba:");
        System.out.println("Cifrar 'secreto' con clave 5: " + cifrar("secreto", 5));
        System.out.println("Descifrar: " + descifrar(cifrar("secreto", 5), 5));
    }
}
