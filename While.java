import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        while(i<=10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
    }
}

/*while(i<n){
    System.out.println("hi" + i);
    int j=0;
    while(j<i){
        System.out.println("hello" + j);
        j++;
    }
    i++;
}*/