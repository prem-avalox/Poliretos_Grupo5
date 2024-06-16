import java.util.Collections;

public class AmangandiLenin {

    // Series numericas

    public void alSerie1For(int valorNumerico) {
        int termino1, termino2, termino3;
        termino1 = 0;
        termino2 = 1;
        System.out.println();
        for (int i = 1; i <= valorNumerico; ++i) {
            if (i == 1) {
                System.out.print(termino1 + " ");
                continue;
            }
            if (i == 2) {
                System.out.print(termino2 + " ");
                continue;
            }
            termino3 = termino2 + termino1;
            termino1 = termino2;
            termino2 = termino3;
            System.out.print(termino3 + " ");
        }
    }

    public void alSerie2For(int valorNumerico) {
        int valor = 1;
        System.out.println();
        for (int i = 0; i < valorNumerico; i++) {
            System.out.print(valor + " ");
            if (i % 2 == 0) {
                valor += 2;
            } else {
                valor++;
            }
        }
    }

    public void alSerie3For(int valorNumerico) {
        int[] numeradores;
        int[] denominadores;
        numeradores = new int[valorNumerico];
        denominadores = new int[valorNumerico];
        numeradores[0] = 0;
        numeradores[1] = 1;
        denominadores[0] = 1;
        denominadores[1] = 3;
        System.out.println();
        for (int i = 2; i < valorNumerico; i++) {
            numeradores[i] = numeradores[i - 1] + numeradores[i - 2];
            denominadores[i] = denominadores[i - 1] + 2;
        }
        for (int i = 0; i < numeradores.length; i++) {
            System.out.print(numeradores[i] + "/" + denominadores[i] + "  ");
        }
    }

    public void alSerie4For(int valorNumerico) {
        int numerador1 = 0, numerador2 = 1, denominadorpar = 4;
        System.out.println();
        switch (valorNumerico) {
            case 1:
                System.out.print("0/2 ");
                break;
            case 2:
                System.out.print("0/2 " + "1/4 ");
                break;
            default:
                System.out.print("0/2 " + "1/4 ");
                for (int i = 0; i < valorNumerico - 2; i++) {
                    int numarador3 = numerador1 + numerador2;
                    denominadorpar += 2;
                    System.out.print(numarador3 + "/" + denominadorpar + " ");
                    numerador1 = numerador2;
                    numerador2 = numarador3;
                }
                break;
        }
    }


    //Serie Caracter

    private int valorNumerico;

    public void alSerieC1For(int valorNumerico) {
        char par, impar;
        par = '+';
        impar = '-';
        System.out.println();
        for (int i = 0; i < valorNumerico; i++) {
            if (i % 2 == 0)
                System.out.print(par + " ");
            else
                System.out.print(impar + " ");
        }
    }

    // Figuras

    private String caracter;
    private String frase;

    public AmangandiLenin() {
        setCaracter(this.caracter);
        setFrase(frase);
        this.valorNumerico = 0;

    }

    public void alFigura1For(int valorNumerico) {
        for (int i = 0; i < valorNumerico; i++) {
            for (int j = 0; j < valorNumerico; j++) {
                if (i == 0 || i == valorNumerico - 1 || j == 0 || j == valorNumerico - 1) {
                    System.out.print(this.caracter + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void alFigura2For(int valorNumerico) {
        for (int i = 0; i < valorNumerico; i++) {
            for (int j = 0; j < valorNumerico; j++) {
                if (i == 0 || i == valorNumerico - 1 || j == 0 || j == valorNumerico - 1) {
                    if ((i + j) % 2 == 0) {
                        System.out.print(this.caracter + " ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void alFigura3For(int valorNumerico) {
        System.out.println();
        for (int filas = 1; filas <= valorNumerico; filas++) {
            for (int nroCaracteres = 0; nroCaracteres < filas; nroCaracteres++) {
                System.out.print(this.caracter + " ");
            }
            System.out.println();
        }
    }

    public void alFigura4For(int valorNumerico) {
        System.out.println();
        for (int filas = 1; filas <= valorNumerico; filas++) {
            for (int numEspacios = valorNumerico; numEspacios > filas; numEspacios--)
                System.out.print("  ");
            for (int numCaracter = 0; numCaracter < filas; numCaracter++)
                System.out.print(this.caracter + " ");
            System.out.println();
        }
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {

        if (caracter == null || caracter.trim().isEmpty()) {
            this.caracter = "*";
        } else {
            this.caracter = caracter;
        }
    }

    // Cadenas Caracter

    public void alFrase1For(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char caracter = Character.toLowerCase(frase.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        System.out.println("El número de vocales en la frase es: " + contador);
    }

    public void alFrase9For(String frase) {
        char[] fraseCaracteres;
        fraseCaracteres = frase.toCharArray();
        System.out.println();
        for (int i = 0; i < fraseCaracteres.length; i++) {
            if (i % 2 == 0)
                System.out.print(Character.toUpperCase(fraseCaracteres[i]));
            else
                System.out.print(Character.toLowerCase(fraseCaracteres[i]));
        }
    }

    public void setFrase(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            this.frase = "Poliretos";
        } else {
            this.frase = frase;
        }
    }

    // Loadings

    public void alLoading1() {
        String charge[] = { "|", "/", "-", "\\", "|" };
        for (int i = 1; i <= 100; i++) {
            System.out.print("\r" + charge[i % 4] + " " + i + "%");
            try {
                Thread.sleep(150);
            } catch (InterruptedException ie) {
            }
        }
        System.out.println();
    }

    public void alLoading2() {
        int longitudBarra = 20;
        int porcentaje = 0;
        while (porcentaje <= 100) {
            System.out.print("[");
            for (int i = 0; i < longitudBarra; i++) {
                if (i < (porcentaje * longitudBarra / 100)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%  ");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
            porcentaje++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void alLoading3() {
        int longitudBarra = 20;
        int porcentaje = 0;
        while (porcentaje <= 100) {
            System.out.print("[");
            for (int i = 0; i < longitudBarra; i++) {
                if (i == (porcentaje * longitudBarra / 100)) {
                    System.out.print("-");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("] " + porcentaje + "%");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
            porcentaje++;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void alLoading4() {
        int retraso = 400;
        String[] patron = { "0oo", "o0o", "oo0" };
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r" + patron[i % patron.length] + " " + i + "%");
            try {
                Thread.sleep(retraso);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void alLoading5() {
        int retraso = 100;
        String[] punta = { ">", "-" };
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            int numIguales = i / 5;
            int numEspacios = 20 - numIguales;
            String barra = String.join("", Collections.nCopies(numIguales, "=")) +
                    punta[i % punta.length] +
                    String.join("", Collections.nCopies(numEspacios, " "));
            System.out.print("\r[" + barra + "] " + i + "%");
            try {
                Thread.sleep(retraso);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
