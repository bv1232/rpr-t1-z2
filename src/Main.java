import java.util.Scanner;

public class Main {

    public static int SumaCifara(int br){
        int temp=br;
        int suma=0;
        while(temp!=0){
            suma+=temp%10;
            temp/=10;
        }
        return suma;
    }

    public static void main(String[] args) {

        System.out.println("Unesite n: ");
        Scanner unos= new Scanner(System.in);
        int n= unos.nextInt();
        System.out.println("Brojevi od 1 do n koji su djeljivi sumom svojih cifara: ");
        for(int i=1;i<=n;i++){
            if(i%SumaCifara(i)==0){
                System.out.println(i);
            }
        }

    }
}