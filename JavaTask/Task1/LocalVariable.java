import java.util.Scanner;
public class LocalVariable{
	static void print(Scanner sc){
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  print(sc);
	}  
}
