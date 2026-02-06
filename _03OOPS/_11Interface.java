interface _11Computer {
   public void code();
  
}

class _11Laptop implements _11Computer{
    public void code(){
      System.out.println("CODE : compile : run");
    }
}

class _11Desktop implements _11Computer{
  public void code(){
      System.out.println("CODE : compile : run : Fster");
    }
}

class _11Developer{
  public void DevApp(_11Computer com){
     com.code();
  }
}
public class _11Interface {
  public static void main(String[] args) {
    _11Developer dev = new _11Developer();

    _11Computer lap = new _11Laptop();
    _11Computer desk = new _11Desktop();

    dev.DevApp(lap);
    dev.DevApp(desk);
  }
}
