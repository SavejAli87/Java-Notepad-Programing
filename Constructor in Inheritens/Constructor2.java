class A
 {
 {
 System.out.println("init block of class A");
 }
 
 A()
 {
 //super();
 //init block code will be pastex here after compilation
 System.out.println("A");
 
 }
 }
 class B extends A
 {
 
 {
 System.out.println("init block of class B");
 }
 B(int x)
 {
 //
 //
 System.out.println("B");
 
 }
 }
 
 class C extends B
 {
 
 {
 System.out.println("init block of class C");
 }
 
 C()
 {
 super(10);
 //init block code will be pasted here after compilation
 System.out.println("C");
 
 }
 C(int x)
 
 {
 //super();
 //
 System.out.println(x);
 
 }
 
 public static void main(String... s)
 {
 //new C();
  new C(12);
  
  }
  }