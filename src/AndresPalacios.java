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
        int opcion = scanner.nextInt();
        scanner.nextLine(); 
        
        switch (opcion) {
            case 1:
                APcontarVocales();
                break;
            case 2:
                APcontarConsonantes();
                break;
            case 3:
                APeliminarVocal();
                break;
            case 4:
                APeliminarConsonante();
                break;
            case 5:
                APinvertirFraseVocalesMayusculas();
                break;
            case 6:
                APinvertirFraseConsonantesMayusculas();
                break;
            case 7:
                APfraseMayusculasSinJ();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
    
    public static void APcontarVocales() {
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
    
    public static void APcontarConsonantes() {
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
    
    public static void APeliminarVocal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine().toLowerCase(); // Convertimos la frase a minúsculas para facilitar la comparación
        
        System.out.println("Ingresa una vocal a eliminar:");
        char vocal = scanner.nextLine().toLowerCase().charAt(0);
        
        String nuevaFrase = frase.replaceAll(String.valueOf(vocal), "");
        
        System.out.println("La frase resultante es: \"" + nuevaFrase + "\"");
    }
    
    public static void APeliminarConsonante() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine().toLowerCase(); // Convertimos la frase a minúsculas para facilitar la comparación
        
        System.out.println("Ingresa una consonante a eliminar:");
        char consonante = scanner.nextLine().toLowerCase().charAt(0);
        
        String nuevaFrase = frase.replaceAll(String.valueOf(consonante), "");
        
        System.out.println("La frase resultante es: \"" + nuevaFrase + "\"");
    }
    
    public static void APinvertirFraseVocalesMayusculas() {
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
    
    public static void APinvertirFraseConsonantesMayusculas() {
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
    
    public static void APfraseMayusculasSinJ() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase que contenga la letra 'j':");
        String frase = scanner.nextLine();
        
        String fraseMayusculas = frase.toUpperCase();
        String fraseSinJ = fraseMayusculas.replaceAll("J", "");
        
        System.out.println("La frase en mayúsculas sin la letra 'j' es: \"" + fraseSinJ + "\"");
    }
}