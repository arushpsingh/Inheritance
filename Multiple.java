// Multiple Inheritance : In multiple inheritance, one class have more than one superclass and inherit from all parent
// 			  class. Java does not support multiple inheritance with classes. In Java we can achieve 
//			  multiple inheritance only through interfaces.

interface eat{
 void print_eat();
}
interface bark{
 void print_bark();
}
interface weep extends eat, bark{
 void print_weep();
}
class Child implements weep{
 public void print_eat(){
  System.out.println("Eating");
 }
 public void print_bark(){
  System.out.println("Barking");
 }
 public void print_weep(){
  System.out.println("Weeping");
 }
}
class Multiple{
 public static void main(String...args){
  Child c = new Child();
  c.print_eat();
  c.print_bark();
  c.print_weep();
 }
}