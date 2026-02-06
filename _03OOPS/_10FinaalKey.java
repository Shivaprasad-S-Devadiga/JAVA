class _10A{
  public final void show(){
    System.out.println("From A");
  }
}

class _10B extends _10A{
  //  public void show(){
  //   System.out.println("FRom B");
  //  }
}
public class _10FinaalKey{
  public static void main(String[] args) {
     _10B obj = new _10B();

     obj.show();
  }
}