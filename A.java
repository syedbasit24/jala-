package first_java_1;

//basics 1
public class  A{
 public static void main(String ags[]){
     A c1 = new A();
     System.out.println(c1.add (10,20));
 }
 public int add(int a , int b ){
     int  c = a+b;
     return c;
 }
}


//basics 2
public class A{
 public static void main(String args[]){
     System.out.print("basit");
 }
}

//basic 3
public class A{
	 public static void main(String args[]){
	   //  System.out.print("basit");  single line comment
		 
		 
		/*
		 * System.out.print("basit"); System.out.print("basit");
		 * System.out.print("basit");
		 */ //multiline comment
		 
		/** System.out.print("basit");
		 System.out.print("basit");
		 System.out.print("basit");
		 System.out.print("basit");
		 System.out.print("basit");
		 */ //documentation comment
		 
		 
		 
		 
		 
	 }
	}


//basic 4
  int a = 10;
  boolean bool = false;
  char c = 'c';
  float f1 = 3.1f;
  double db =123.4;
  
  System.out.println(a);
  System.out.println(bool);
  System.out.println(c);
  System.out.println(f1);
  System.out.println(db);
  
  //basic5
  
  class A {
	  public static int  v = 10; // global
	  public static void main(String args[]) {
		 public  int v=10; // local
	  }
  }
  
  
  //basic 6
  class A{
	  public static void main(String args[]) {
		  A a1 = new A();
		  a1.name();
		  
	  }
	  public void name() {
		  System.out.println("basit");
	  }
  }
  
		  
  


