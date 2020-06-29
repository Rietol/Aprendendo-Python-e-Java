package desafiom;

import java.util.Scanner;
        
public class DesafioM {
    
    public static void main(String[] args) {
    int n, j;
    j = 1;
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite um número: ");
    n = scan.nextInt();
    while (n >= j) { //Usando 2 loop for é mais efetivo
        for (int i = 1 ; i <= j; i++ ) {
            System.out.print(i + " ");
        }
        j++;
        System.out.println();
    }
    
    }
    
}
