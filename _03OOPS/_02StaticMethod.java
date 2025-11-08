
 class _02Mobile {

   String brand;
   int price;
   // As nameof every phone is simialar i dont want update evrywhere , So initializing with static
   static String name;

   public void show(){
     System.out.println(brand + " " + price + " " + name);
   }

   public static void show1(){
    System.out.println("Static methodd :" + name );
   }

   //to acess a instance or non-static variable
   public static void show2(_02Mobile obj){
    System.out.println("Static methodd : " + obj.brand + " " + obj.price + " " + name );
   }
  
}

public class _02StaticMethod{
  public static void main(String[] args) {

     _02Mobile  obj1 = new _02Mobile();
     obj1.brand ="Apple";
     obj1.price = 1500;
     //obj1.name = "smartphone";

     _02Mobile  obj2 = new _02Mobile();
     obj2.brand ="samsung";
     obj2.price = 1700;
     //obj2.name = "smartphone";

     //prefer to aceess through class(static variable)
     _02Mobile.name = "PHONE";

     obj1.show();
     obj2.show();

     _02Mobile.show1();


     _02Mobile.show2(obj1);

  }
}
