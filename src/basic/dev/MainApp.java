package basic.dev;

import java.util.Scanner;

/**
 * viet chuong trinh nhap vao 2 so nguyen a,b
 * @author Admin
 *
 */

public class MainApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	 System.out.println("nhap a,b");
	 int a = scan.nextInt();
	 int b = scan.nextInt();
	 
	 System.out.println("tong:" + (a+b));
	 System.out.println("hieu:" + (a+b));
	 System.out.println("tich:"+ (a+b));
	 System.out.println("thuong:" + (double)(a+b));
	 
	 // Gan C
	 System.out.println("so sanh hon: " + (a>b));
	 System.out.println("so sanh nho: " + (a<b));
	 System.out.println("so sanh lon hon hoac bang: " + (a>=b));
	 System.out.println("so sanh be hon hoac bang: " + (a<=b));
	 
	 
	 
	 
		
	}

}
