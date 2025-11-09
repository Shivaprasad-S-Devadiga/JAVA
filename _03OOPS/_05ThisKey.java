class  _05Human{
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
public class _05ThisKey {
   public static void main(String[] args) {
    _05Human obj1 = new _05Human();
    // obj1.age = 12;
    // obj1.name = "SHIV";

    // System.out.println(obj1.age);
    // System.out.println(obj1.name);

    obj1.setAge(30);
    obj1.setName("SHIV");

    System.out.println(obj1.getAge());
    System.out.println(obj1.getName());

   }
}
