package Tasks_02;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Введите слово:"); 

        Scanner Sc = new Scanner(System.in);
        String st = Sc.nextLine(); 

        int stLength = st.length();

        int n = stLength/2;

        int k = 0;
        int f = 0;

        while (k < n){
            if (st.charAt(k) != st.charAt(stLength-k-1)) {
                f = 1;
            }
            k = k+1;
        }

        if (f == 0) {
            System.out.println("Строка является палиндромом");  
        }
        else {
            System.out.println("Строка не является палиндромом");
        }

    }
}