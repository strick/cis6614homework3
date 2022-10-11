public class HW3 {   // To enable assertions, run with java -ea HW3 
  //@ ensures \result != 9;
  public int check(int i, int j, int k) {
    int x = 0; // l4
    int y = 0; // l5
    if (i>0) { //l6
      l7: y = 11;
    } else {   // l8
      l9: y = 9;
    }
    ; // l11
    if (j>7) { // l12
      l13: x = 6;
      if (i <= 0 && k == 0) { // l14
        l15: y = y-1;
      }
    }
    ; // l18
    l19: assert x+y != 9;
    return x+y;
  }

  //@ requires args.length == 3;
  public static void main(String [] args) {
    System.out.println("running check...");
    if (args.length == 3) {
      try {
        int i = Integer.valueOf(args[0]);
        int j = Integer.valueOf(args[1]);
        int k = Integer.valueOf(args[2]);
        HW3 hw3 = new HW3();
        hw3.check(i, j, k);
      } catch (NumberFormatException ex) {
        System.err.println("bad number format!");
        System.exit(-1);
      }
    } else {
      System.err.println("need 3 int arguments!");
      System.exit(1);
    }
    System.out.println("... done with check");
    System.exit(0);
  }
}
