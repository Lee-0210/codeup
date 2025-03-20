package _1295;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        for(char ch : a.toCharArray()) {
            if(Character.isLowerCase(ch)) {
               str += Character.toUpperCase(ch);
            } else {
                str += Character.toLowerCase(ch);
            }
        }
        System.out.println(str);
        sc.close();
	 }
}
