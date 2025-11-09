class  _04Human{
  private int age;
  private String name;
  
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  


}
public class _04Encapsulation {
   public static void main(String[] args) {
    _04Human obj1 = new _04Human();
    // obj1.age = 12;
    // obj1.name = "SHIV";

    // System.out.println(obj1.age);
    // System.out.println(obj1.name);

    System.out.println(obj1.getAge());
    System.out.println(obj1.getName());

   }
}
