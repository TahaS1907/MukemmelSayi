import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number,sum=0;
        System.out.println("Please enter a number:");
        number= scanner.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }

            }
        if(sum==number){System.out.println(number+" "+"is a perfect number.");}
        else System.out.println(number+" "+"isn't a perfect number.");
        }
    }
