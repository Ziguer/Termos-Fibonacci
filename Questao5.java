import java.util.Scanner;
public class Questao5
{
    public static int fibonacci(int n){
        if(n<2){
                return n;
        }
        else{
                return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int i = 1;
        int fiboR;
        System.out.println("Escreva um numero inteiro");
        int n1 = ler.nextInt();
        while(i<=n1){
            fiboR = fibonacci(i);
            System.out.println(i+": "+fiboR);
            i++;
        }
    }
}
