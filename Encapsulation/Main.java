class Main{
String name="Anas";
int age=19;
void get(String s1, int s2);
{ 
name=s1;
age=s2;
}

void show()
{
System.out.println(name);
System.out.println(age);
}

 static int add(int a, int b)
 {
 return a+b;
 }
 
 public static void main(String... s)
 {
  Main s= new Main();
  System.out.println(s);
}
}
