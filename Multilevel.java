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
class BabyDog extends Dog{
 void weep(){
  System.out.println("Weeping");
 }
}
class Multilevel{
 public static void main(String...args){
  BabyDog bg = new BabyDog();
  bg.eat();
  bg.bark();
  bg.weep();
 }
}