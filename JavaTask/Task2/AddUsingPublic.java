public class AddUsingPublic{
	
	 public int add(int a,int b) {
		return a+b;
	}
	 
     public static void main(String[] args) {
		int a=10;
		int b=20;
		AddUsingPublic m=new AddUsingPublic();
	    System.out.println(m.add(a,b));
	
	}

}
