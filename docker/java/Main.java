import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

       

        System.out.println("Hello");
        System.out.println("ログインは「1」、会員登録は「2」、アプリを終了する場合は「3」を入力してください");
        Scanner yourselect = new Scanner(System.in);
        int yoursTask = yourselect.nextInt();
        System.out.println(yoursTask);
        System.out.println("Hello");

        System.out.println("Hello");
        System.out.println("Hello");
    }
}