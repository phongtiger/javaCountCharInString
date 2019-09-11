import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        String a = "Xin chao the gioi";
        char b ='i';
        int count = 0;
        int l = a.length();
        for (int i = 0; i < l; i++) {
            if ((a.charAt(i)==b)) {
                count++;
            }
        }
        System.out.println(b + " xuat hien "+ count +" lan ");
    }
}
