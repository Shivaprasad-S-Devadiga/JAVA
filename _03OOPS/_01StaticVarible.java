class _01Mobile {

   String brand;
   int price;
   // As nameof every phone is simialar i dont want update evrywhere , So initializing with static
   static String name;

   public void show(){
     System.out.println(brand + " " + price + " " + name);
   }
  
}

public class _01StaticVarible {
  public static void main(String[] args) {

     _01Mobile  obj1 = new _01Mobile();
     obj1.brand ="Apple";
     obj1.price = 1500;
     //obj1.name = "smartphone";

     _01Mobile  obj2 = new _01Mobile();
     obj2.brand ="samsung";
     obj2.price = 1700;
     //obj2.name = "smartphone";

     //prefer to aceess through class(static variable)
     _01Mobile.name = "PHONE";

     obj1.show();
     obj2.show();


  }
}
