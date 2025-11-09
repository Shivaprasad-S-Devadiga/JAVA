class A {
   A(){
    super();
    System.out.println("IN A");
   }

   A(int n1){
    super();
    System.out.println("in A INT");
  }
}

class B extends A{
  B(){
    super(); //default
    System.out.println("in B");
  }

  B(int n1){
    this();
    System.out.println("in B INT");
  }
}

public class _07Super {
   public static void main(String[] args) {
      B obj = new B(7);
   }

}
