class Encapsulation{
  private String Name;
  private int Age;
  private int Id;
  public String getName(){
    return Name;
  }
  public int getAge(){
    return Age;
  }
  public int getId(){
    return Id;
  }
  public void setName(String newName){
    Name = newName;
  }
  public void setAge(int newAge){
    Age = newAge;
  }
  public void setId(int newId){
    Id = newId;
  }
}

class En {
  public static void main(String[] args) {
    Encapsulation en = new Encapsulation();
    en.setName("Arush")  ;
    en.setAge(22);
    en.setId(1);
    System.out.println("Name is : "+getName()+"Age is : "+getAge()+"Id is : "+getId());
  }
}