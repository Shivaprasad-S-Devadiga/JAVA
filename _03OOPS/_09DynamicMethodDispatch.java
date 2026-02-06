class _09A{

  public void show(){
    System.out.println("Show in A");
  }

}

class _09B extends _09A{

  public void show(){
    System.out.println("Show in B");
  }

}


public class _09DynamicMethodDispatch {
  public static void main(String[] args) {
    _09A obj = new _09A();
    obj.show();

    obj = new _09B();
    obj.show();

  }
}
