public boolean evenlySpaced(int a, int b, int c) {
  int small = 0;
  int large = 0;
  int medium = 0;

  if(a >= b && b >= c) {
    large = a;
    medium = b;
    small = c;
  } else if(b >= a && a >= c) {
    large = b;
    medium = a;
    small = c;
  } else if(b >= c && c >= a) {
    large = b;
    medium = c;
    small = a;
  } else if(a >= c && c >= b) {
    large = a;
    medium = c;
    small = b;
  } else if(c >= a && a >= b) {
    large = c;
    medium = a;
    small = b;
  } else if(c >= b && b >= a) {
    large = c;
    medium = b;
    small = a;
  }

  return large - medium == medium - small;
}
