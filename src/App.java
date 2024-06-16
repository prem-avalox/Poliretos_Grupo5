import java.util.Scanner;

public class App { 
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       
        System.out.println("Hola, Somos el grupo 5:"+ "\n" 
                                            + "martin.davalos"+"\n"
                                            + "lenin.amangandi"+"\n"
                                            + "alejandro.chicaiza"+"\n"
                                            + "andres.palacios"+ "\n"
                                            + "cesar.zapata");


        MartinDavalos MD= new MartinDavalos();
        
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
        System.out.println("El factorial de "+ MD.getMdA()+" es "+ MD.mdR1(MD.getMdA()));
        
        System.out.println("R2");
        System.out.println("Digite los numeros de los cuales desea obtener su suma");
        MD.setMdA(sc.nextInt());
        MD.setMdB(sc.nextInt());
        MD.mdR2(MD.getMdA(), MD.getMdB());

        System.out.println("R3");
        System.out.println("Digite los numeros que desea multiplicar");
        MD.setMdA(sc.nextInt());
        MD.setMdB(sc.nextInt());
        System.out.println("El resultado de la multiplicacion entre "+ MD.getMdA()+" y "+ MD.getMdB()+" es: "+ MD.mdR3(MD.getMdA(), MD.getMdB()));

        
        System.out.println("R4");
        System.out.println("Digite los numeros que desea utilizar como base y exponente RESPECTIVAMENTE");
        MD.setMdA(sc.nextInt());
        MD.setMdB(sc.nextInt());
        System.out.println(+ MD.getMdA()+" potenciado a "+ MD.getMdB()+" es: "+ MD.mdR4(MD.getMdA(), MD.getMdB()));


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
