public class HW3 {   
  public int check(int i, int j, int k) {
    int x = 0; // l4
    int y = 0; // l5
    if (i>0) { //l6
      y = 11;
    } else {   // l8
      y = 9;
    }

    if (j>7) { // l12
        x = 6;
        if (i <= 0 && k == 0) { // l14
          y = y-1;
        }
    }

    assert x+y != 9;
    return x+y;
  }

}
