import java.util.Scanner;
public class SquareByPassing{
	
	 static int square(int a) {
		return a*a;
	}
	 
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println(square(sc.nextInt()));
	    sc.close();
	
	}

}
