import java.util.Scanner;
public class InstanceMultiply{
   int a;
   int b;
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
	 InstanceMultiply obj=new InstanceMultiply();
	 obj.a=sc.nextInt();
	 obj.b=sc.nextInt();
	 System.out.print(obj.a*obj.b);
	}
}