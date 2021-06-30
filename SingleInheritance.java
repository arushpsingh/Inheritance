//Single Inheritance : In this, subclasses inherit the features of one superclass

class Animal{
 void eat(){
  System.out.println("Eating");
 }
}
class Dog extends Animal{
 void bark(){
  System.out.println("Barking");
 }
}
class SingleInheritance{
 public static void main(String...args){
  Dog g = new Dog();
  g.eat();
  g.bark(); 
 }
}