public boolean shareDigit(int a, int b) {
  int aTens = a/10;
  int aOnes = a%10;
  int bTens = b/10;
  int bOnes = b%10;
  
  return aTens == bTens || aTens == bOnes || aOnes == bTens || aOnes == bOnes;
}
