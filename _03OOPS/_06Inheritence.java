public class _06Inheritence {
  public static void main(String[] args) {

     _06Calc obj = new _06Calc();

     int r1 = obj.add(4,7 );
     int r2 = obj.sub(7,4 );
     System.out.println(r1 + " "+ r2);

    _06AdanceCalc obj1 = new _06AdanceCalc();
    int r3 = obj1.add(2, 3);
    int r4 = obj1.sub(3,1);
    int r5 = obj1.mul(8,2);
    int r6 = obj1.div(10,3);
    System.out.println(r3+ " "+ r4+ " "+ r5 + " "+ r6);
  }
}
