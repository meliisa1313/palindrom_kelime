import java.util.Scanner;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println(isPalindrome("bakim"));





        }
    public static  boolean isPalindrome(String string) {
        int i=0; //baslangıç
        int j= string.length()-1;
        while (i<j) {
            if (string.charAt(i) == string.charAt(j)) {
                return true;
            }
            i++;
            j--;
        }
        return false;
    }



    }



