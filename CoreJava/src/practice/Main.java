package practice;
	public class Main {
		 
	    static 
	    {
			a =10;
			m1();
			System.out.println("hello");
		}
		static int m1() {
			System.out.println("static m1  "+a);
			return m2();
		}
		static int m2() {
			System.out.println("static m2  "+a);
			return Main.a+20;
		}
       static int a = 50;  //a = 0
       
		public static void main(String[] args) {
			System.out.println(a);
		}
		static {
			Main.a = Main.a+m1();
		}
		
	}
