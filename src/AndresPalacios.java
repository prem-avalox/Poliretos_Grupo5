import java.util.Scanner;

public class AndresPalacios {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona una opción:");
        System.out.println("1. Contar vocales en una frase.");
        System.out.println("2. Contar consonantes en una frase.");
        System.out.println("3. Eliminar una vocal de la frase.");
        System.out.println("4. Eliminar una consonante de la frase.");
        System.out.println("5. Presentar la frase invertida con vocales en mayúscula.");
        System.out.println("6. Presentar la frase invertida con consonantes en mayúscula.");
        System.out.println("7. Presentar la frase en mayúsculas y eliminar la letra 'j'.");
        System.out.println("8. Presentar una secuencia alternante de '+' y '-'.");
        System.out.println("9. Presentar una secuencia creciente de '+'.");
        System.out.println("10. Presentar una secuencia específica de '+'.");
        System.out.println("11. Presentar una secuencia alternante de '+', '-', '*', '/'.");
        System.out.println("12. Presentar una secuencia de '\\', '|', '/', '-', '|', '\\'.");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcion) {
            case 1:
                APC01();
                break;
            case 2:
                APC02();
                break;
            case 3:
                APC03();
                break;
            case 4:
                APC04();
                break;
            case 5:
                APC05();
                break;
            case 6:
                APC06();
                break;
            case 7:
                APC07();
                break;
            case 8:
                APSC1();
                break;
            case 9:
                APSC2();
                break;
            case 10:
                APSC3();
                break;
            case 11:
                APSC4();
                break;
            case 12:
                APSC5();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void APC01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine().toLowerCase(); // Convertimos la frase a minúsculas para facilitar la comparación
        
        int contadorVocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }
        
        System.out.println("La frase \"" + frase + "\" tiene " + contadorVocales + " vocales.");
    }

    public static void APC02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine().toLowerCase(); // Convertimos la frase a minúsculas para facilitar la comparación
        
        int contadorConsonantes = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter >= 'a' && caracter <= 'z') { // Verificamos si es una letra del alfabeto
                if (caracter != 'a' && caracter != 'e' && caracter != 'i' && caracter != 'o' && caracter != 'u') {
                    contadorConsonantes++;
                }
            }
        }
        
        System.out.println("La frase \"" + frase + "\" tiene " + contadorConsonantes + " consonantes.");
    }

    public static void APC03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine().toLowerCase(); // Convertimos la frase a minúsculas para facilitar la comparación
        
        System.out.println("Ingresa una vocal a eliminar:");
        char vocal = scanner.nextLine().toLowerCase().charAt(0);
        
        String nuevaFrase = frase.replaceAll(String.valueOf(vocal), "");
        
        System.out.println("La frase resultante es: \"" + nuevaFrase + "\"");
    }

    public static void APC04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine().toLowerCase(); // Convertimos la frase a minúsculas para facilitar la comparación
        
        System.out.println("Ingresa una consonante a eliminar:");
        char consonante = scanner.nextLine().toLowerCase().charAt(0);
        
        String nuevaFrase = frase.replaceAll(String.valueOf(consonante), "");
        
        System.out.println("La frase resultante es: \"" + nuevaFrase + "\"");
    }

    public static void APC05() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine().toLowerCase(); // Convertimos la frase a minúsculas para facilitar la comparación
        
        StringBuilder fraseInvertida = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                fraseInvertida.append(Character.toUpperCase(caracter));
            } else {
                fraseInvertida.append(caracter);
            }
        }
        
        System.out.println("La frase invertida con vocales en mayúscula es: \"" + fraseInvertida.toString() + "\"");
    }

    public static void APC06() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine().toLowerCase(); // Convertimos la frase a minúsculas para facilitar la comparación
        
        StringBuilder fraseInvertida = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            char caracter = frase.charAt(i);
            if (caracter >= 'b' && caracter <= 'z' && caracter != 'e' && caracter != 'i' && caracter != 'o' && caracter != 'u') {
                fraseInvertida.append(Character.toUpperCase(caracter));
            } else {
                fraseInvertida.append(caracter);
            }
        }
        
        System.out.println("La frase invertida con consonantes en mayúscula es: \"" + fraseInvertida.toString() + "\"");
    }

    public static void APC07() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase que contenga la letra 'j':");
        String frase = scanner.nextLine();
        
        String fraseMayusculas = frase.toUpperCase();
        String fraseSinJ = fraseMayusculas.replaceAll("J", "");
        
        System.out.println("La frase en mayúsculas sin la letra 'j' es: \"" + fraseSinJ + "\"");
    }

    public static void APSC1() {
        int repeticiones = 10;
        StringBuilder secuencia = new StringBuilder();
        
        for (int i = 0; i < repeticiones; i++) {
            if (i % 2 == 0) {
                secuencia.append("+ ");
            } else {
                secuencia.append("- ");
            }
        }
        System.out.println(secuencia.toString().trim());
    }

    public static void APSC2() {
        int repeticiones = 5;
        StringBuilder secuencia = new StringBuilder();

        for (int i = 1; i <= repeticiones; i++) {
            for (int j = 0; j < i; j++) {
                secuencia.append("+");
            }
            
            if (i < repeticiones) {
                secuencia.append(" ");
            }
        }
        System.out.println(secuencia.toString());
    }

    public static void APSC3() {
        int[] repeticiones = {1, 2, 3, 5, 7};
        StringBuilder secuencia = new StringBuilder();

        for (int i = 0; i < repeticiones.length; i++) {
            for (int j = 0; j < repeticiones[i]; j++) {
                secuencia.append("+");
            }
            if (i < repeticiones.length - 1) {
                secuencia.append(" ");
            }
        }
        System.out.println(secuencia.toString());
    }

    public static void APSC4() {
        char[] secuencia = {'+', '-', '*', '/'};
        int repeticiones = 15;
        StringBuilder secuenciaFinal = new StringBuilder();

        for (int i = 0; i < repeticiones; i++) {
            secuenciaFinal.append(secuencia[i % secuencia.length]).append(" ");
        }
        System.out.println(secuenciaFinal.toString().trim());
    }

    public static void APSC5() {
        char[] secuencia = {'\\', '|', '/', '-', '|', '\\'};
        int repeticiones = 15;
        StringBuilder secuenciaFinal = new StringBuilder();

        for (int i = 0; i < repeticiones; i++) {
            secuenciaFinal.append(secuencia[i % (secuencia.length - 1)]).append(" ");
        }

    
        System.out.println(secuenciaFinal.toString().trim());
    }
}
