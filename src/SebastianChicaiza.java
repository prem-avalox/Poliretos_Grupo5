import java.util.InputMismatchException;
import java.util.Scanner;
public class SebastianChicaiza {
    Scanner sc = new Scanner(System.in);
    public void SCF16(){
        char c1, c2;
        int n = 0;
        boolean numeroValido = false;
        System.out.println("Ingrese el primer caracter para la forma: ");
        c1 = sc.next().charAt(0);
        System.out.println("Ingrese el segundo caracter: ");
        c2 = sc.next().charAt(0);

        while (!numeroValido){
            try {
                do{
                    System.out.println("Ingrese el tamaño que quiere para la forma (tiene que ser un numero impar mayor o igual a 5): ");
                    n = sc.nextInt();
                }while(n < 5 || n%2 == 0);
                numeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Lo ingresado no es un numero entero valido, intente de nuevo: ");
                sc.next();
            }
        }

        char [][] matriz = new char [n][n];
        n--;
        for(int i = 0; i <= n/2;i++){
            if(i%2 == 0){
                matriz [i][i] = c1;
                matriz [i][n-i] = c1;
                matriz [n-i][i] = c1;
                matriz [n-i][n-i] = c1;
            }else{
                matriz [i][i] = c2;
                matriz [i][n-i] = c2;
                matriz [n-i][i] = c2;
                matriz [n-i][n-i] = c2;
            }
        }
        
        for(int i=0; i <= n; i++ ){
            for(int j = 0; j <= n; j++){
                System.out.print(matriz[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println("Ingrese cualquier cosa para avanzar al siguiente ejercicio...");
        sc.next();
    }

    public void SCF17(){
        int n1 = 0, n2 = 0, n = 0;
        boolean numeroValido = false;
       
        while(!numeroValido){
            try {
                System.out.println("Ingrese un numero entero para la forma: ");
                    n1 = sc.nextInt();
                numeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Lo ingresado no es un numero entero valido, intente de nuevo: ");
                sc.next();
            }
        }

        numeroValido = false;
        while(!numeroValido){
            try {
                System.out.println("Ingrese otro numero entero para la forma: ");
                    n2 = sc.nextInt();
                numeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Lo ingresado no es un numero entero valido, intente de nuevo: ");
                sc.next();
            }
        }
        
        numeroValido = false;
        while (!numeroValido){
            try {
                System.out.println("Ingrese el tamaño que quiere para la forma (tiene que ser un numero impar mayor o igual a 5): ");
                do{
                    n = sc.nextInt();
                }while(n < 5 || n%2 == 0);
                numeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Lo ingresado no es un numero entero valido, intente de nuevo: ");
                sc.next();
            }
        }

        char c1 = String.valueOf(n1).charAt(0);
        char c2 = String.valueOf(n2).charAt(0);
        
        char [][] matriz = new char [n][n];
        n--;
        for(int i = 0; i <= n/2;i++){
            if(i%2 == 0){
                matriz [i][i] = c1;
                matriz [i][n-i] = c1;
                matriz [n-i][i] = c1;
                matriz [n-i][n-i] = c1;
            }else{
                matriz [i][i] = c2;
                matriz [i][n-i] = c2;
                matriz [n-i][i] = c2;
                matriz [n-i][n-i] = c2;
            }
        }
        
        for(int i=0; i <= n; i++ ){
            for(int j = 0; j <= n; j++){
                System.out.print(matriz[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println("Ingrese cualquier cosa para avanzar al siguiente ejercicio...");
        sc.next();
    }
    public void SCF18(){   
        int n = 0;
        boolean numeroValido = false;

        while(!numeroValido){
            try {
                do{
                    System.out.println("Ingrese las filas con las que quiere imprimir la piramide de Pascal (debe ser un numero igual o mayor a 1): ");
                    n = sc.nextInt();
                }while(n < 1);
                numeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese algo que sea un número entero, por favor ingrese de nuevo: ");
                sc.next();
            }
        }

        int matriz [][] = new int [n][n];
        
        for (int i = 1; i < n; i++){
            matriz[i][0] = 1;
        }
        for (int i = 0; i < n; i++){
            matriz[i][i] = 2;
        }
       
        int r1 =0, r2 = 0;
       
        for(int k = 2; k < n; k++){
            int contador = k - 1;
            for(int i = 2; i - 2 < contador;i++){
                for(int j = 1; j - 2 < contador; j++){
                    r1 = matriz [i-1][j];
                    r2 = matriz [i-1][j-1];
                    matriz [i][j] = r1 + r2 ; 
                }
            }
        }

        String matriz2[][] = new String [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++ ){
                if(matriz[i][j] == 0){
                    matriz2[i][j] = " ";
                }else{
                    matriz2[i][j] = String.valueOf(matriz[i][j]);
                }
            }
        } 

        for(int i=0; i < n; i++ ){
            for(int j = 0; j < n; j++){
                System.out.print(matriz2[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println("Ingrese cualquier cosa para avanzar al siguiente ejercicio...");
        sc.next();
    }

    public void SCF19(){
        int n = 0;
        boolean numeroValido = false;
        String c1, c2;
        char cc1, cc2;

        System.out.println("Ingrese el primer caracter para la forma: ");
        c1 = sc.nextLine();
        cc1 = c1.charAt(0);
        c1 = new String(new char[]{cc1});
        System.out.println("Ingrese el segundo caracter: ");
        c2 = sc.nextLine();
        cc2 = c2.charAt(0);
        c2 = new String(new char[]{cc2});

        while(!numeroValido){
            try {
                do{
                    System.out.println("Ingrese las filas con las que quiere imprimir la piramide de Pascal (debe ser un numero igual o mayor a 1): ");
                    n = sc.nextInt();
                }while(n < 1);
                numeroValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese algo que sea un número entero, por favor ingrese de nuevo: ");
                sc.next();
            }
        }

        int matriz [][] = new int [n][n];
        
        for (int i = 1; i < n; i++){
            matriz[i][0] = 1;
        }
        for (int i = 0; i < n; i++){
            matriz[i][i] = 2;
        }
       
        int r1 =0, r2 = 0;
       
        for(int k = 2; k < n; k++){
            int contador = k - 1;
            for(int i = 2; i - 2 < contador;i++){
                for(int j = 1; j - 2 < contador; j++){
                    r1 = matriz [i-1][j];
                    r2 = matriz [i-1][j-1];
                    matriz [i][j] = r1 + r2 ; 
                }
            }
        }

        String matriz2[][] = new String [n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++ ){
                if(matriz[i][j] == 0 || matriz[i][j] == 1|| matriz[i][j] == 2){
                    if(matriz[i][j]==0){
                        matriz2[i][j] = " ";
                    }else{
                        matriz2[i][j] = (matriz[i][j] == 2)? c1:c2;
                    }
                }else{
                    matriz2[i][j] = String.valueOf(matriz[i][j]);
                }
            }
        } 

        for(int i=0; i < n; i++ ){
            for(int j = 0; j < n; j++){
                System.out.print(matriz2[i][j]);
                System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println("Ingrese cualquier cosa para avanzar al siguiente ejercicio...");
        sc.next();
    }
}