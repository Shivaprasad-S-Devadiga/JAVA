
@FunctionalInterface
interface A{
  void show();
  //void add(); // not possible because FI can have only 1 method
}

public class _01FunctionalInterface {
  public static void main(String[] args) {
      //A  obj = new A(); // can't instanciate interface 
      // but we cn do it by creating anonymus inner class

      A obj = new A(){
        public void show(){
          System.out.println("In show");
        }
      };

      obj.show();

      // we can reduce this lambda function

  }
}
