import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        String caracter;
        Scanner sc = new Scanner(System.in);
        int valorNumerico = 0;
        boolean bandera = true;

        
        System.out.println("Hola, Somos el grupo 5:"+ "\n" 
                                            + "martin.davalos"+"\n"
                                            + "lenin.amangandi"+"\n"
                                            + "alejandro.chicaiza"+"\n"
                                            + "andres.palacios"+ "\n"
                                            + "cesar.zapata");

        while (bandera) {
            System.out.print("\u001B[30m\u001B[42mIntroduce un nivel\u001B[0m" + " : ");
            String numero = sc.nextLine();

            try {
                valorNumerico = Integer.parseInt(numero);
                if (valorNumerico <= 0) {
                    System.out.println("El número debe ser mayor que 0. Inténtalo de nuevo.");
                    bandera = true;
                } else {
                    bandera = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingresa un número válido.");
                bandera = true;
            }
        }

        AmangandiLenin al = new AmangandiLenin();

        System.out.print("\u001B[30m\u001B[42mIntroduce un caracter\u001B[0m" + " : ");
        caracter = sc.nextLine();

        System.out.println("\u001B[35mImprimir Series Numericas\u001B[0m");

        al.alSerie1For(valorNumerico);
        al.alSerie2For(valorNumerico);
        al.alSerie3For(valorNumerico);
        al.alSerie4For(valorNumerico);

        System.out.println();
        System.out.println("\u001B[32mImprimir Serie Caracteres\u001B[0m");

        al.alSerieC1For(valorNumerico);

        System.out.println();
        System.out.println("\u001B[36mImprimir Figuras\u001B[0m");

        al.setCaracter(caracter);
        al.alFigura1For(valorNumerico);
        al.alFigura2For(valorNumerico);
        al.alFigura3For(valorNumerico);
        al.alFigura4For(valorNumerico);

        System.out.println("\u001B[35mImprimir Cadenas Caracter\u001B[0m");
        System.out.print("Por favor ingrese una frase: ");
        String frase = sc.nextLine();

        al.setCaracter(caracter);
        al.alFrase1For(frase);
        al.alFrase9For(frase);

        System.out.println();
        System.out.println("\u001B[33m Imprimir Arrays \u001B[0m");

        System.out.println();
        System.out.println("\u001B[31mImprimir Loading\u001B[0m");

        al.alLoading1();
        al.alLoading2();
        System.out.println();
        al.alLoading3();
        al.alLoading4();
        al.alLoading5();

        System.out.println();

        MartinDavalos MD = new MartinDavalos();

        System.out.println("Digite la cantidad de caracteres a imprimir");
        MD.setMdCantidadCaracteres(sc.nextInt());

        System.out.println("SN5:");
        MD.mdSN5(MD.getMdCantidadCaracteres());

        System.out.println("SN6:");
        MD.mdSN6(MD.getMdCantidadCaracteres());

        System.out.println("SN7:");
        MD.mdSN7(MD.getMdCantidadCaracteres());

        System.out.println("SN8:");
        MD.mdSN8(MD.getMdCantidadCaracteres());

        System.out.println("Digite la cantidad de niveles que desea imprimir para las figuras");
        MD.setMdNiveles(sc.nextInt());

        System.out.println("F5");
        MD.mdF5(MD.getMdNiveles());
        System.out.println("F6");
        MD.mdF6(MD.getMdNiveles());

        System.out.println("F7");
        MD.mdF7(MD.getMdNiveles());

        System.out.println("F8");
        MD.mdF8(MD.getMdNiveles());

        System.out.println("R1");
        System.out.println("Digite el numero del cual desea obtener su factorial");
        MD.setMdA(sc.nextInt());
        System.out.println("El factorial de " + MD.getMdA() + " es " + MD.mdR1(MD.getMdA()));

        System.out.println("R2");
        System.out.println("Digite los numeros de los cuales desea obtener su suma");
        MD.setMdA(sc.nextInt());
        MD.setMdB(sc.nextInt());
        MD.mdR2(MD.getMdA(), MD.getMdB());

        System.out.println("R3");
        System.out.println("Digite los numeros que desea multiplicar");
        MD.setMdA(sc.nextInt());
        MD.setMdB(sc.nextInt());
        System.out.println("El resultado de la multiplicacion entre " + MD.getMdA() + " y " + MD.getMdB() + " es: "
                + MD.mdR3(MD.getMdA(), MD.getMdB()));

        System.out.println("R4");
        System.out.println("Digite los numeros que desea utilizar como base y exponente RESPECTIVAMENTE");
        MD.setMdA(sc.nextInt());
        MD.setMdB(sc.nextInt());
        System.out.println(+MD.getMdA() + " potenciado a " + MD.getMdB() + " es: " + MD.mdR4(MD.getMdA(), MD.getMdB()));

        System.out.println("R5");
        System.out.println("Digite hasta que numero desea contar");
        MD.setMdA(sc.nextInt());
        MD.mdR5(MD.getMdA());

        System.out.println("R6");
        System.out.println("Digite desde que numero desea contar");
        MD.setMdA(sc.nextInt());
        MD.mdR6(MD.getMdA());

    }
}
