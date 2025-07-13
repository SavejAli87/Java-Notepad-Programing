 class Base
{
 A show()
 {
 System.out.println("Base");
 return new A();
 }
 }
 
 class child extends Base
 {
 
 B show()
 {
 System.out.println("child");
 return new B();
 
 }
 
 public static void main(String... s)
{
child c=new child();

c.show();
}
}
class A
{


}
class B extends A

{

} 