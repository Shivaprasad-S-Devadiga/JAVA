class _03Mobile{

  String brand;
  int price;
  static String name;

  _03Mobile(){
    brand ="";
    price =200;
    System.out.println("constructor called");
  } 

  static{
    name = "smartphone";
    System.out.println("static blocak called");
  }

}
public class _03StaticBlock {
  
  public static void main(String[] args) {
    // _03Mobile obj1 = new _03Mobile();

    // _03Mobile obj2 = new _03Mobile();

    //Class.forName("_03Mobile");
  }
}
