package practice;
import java.util.*;
import java.lang.*;
public class excercise1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		float b = scan.nextFloat();
		scan.close();
		double ans = Math.pow(a, 2)+Math.pow(b,2)+ (double)2*(a*b);
		int c = 3;
		c=c++; // c = 3 then it will increment
		System.out.println(c);
	}

}
