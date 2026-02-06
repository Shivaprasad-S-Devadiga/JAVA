class _08A{
   int x=10;

    public void show(){
      System.out.println("show from _08A");
    }

}

class _08B extends _08A{
  int x=20;
  public void show(){
      System.out.println("show from _08B");
    }
}


public class _08OverRiding {
   public static void main(String[] args) {
     _08B obj = new _08B();
     obj.show();

      _08A obj1 = new _08B();
      obj1.show();
      System.out.println(obj1.x);
   }
  
}
