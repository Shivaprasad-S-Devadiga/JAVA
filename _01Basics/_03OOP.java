package _01Basics;

class calculater{

  int add(int a, int b){
    return a+b;
  }
}

public class _03OOP {
    public static void main(String[] args) {
        int a=10, b=5;
        calculater calc = new calculater();
        int sum = calc.add(a, b);
        System.out.println("Sum is "+sum);
    }
}
