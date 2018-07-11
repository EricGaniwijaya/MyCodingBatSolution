public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if (noDoubles && die1 == die2) {
    die2 = (die2 + 1) % 7;
    
    if (die2 == 0) die2++;
  }
  
  return die1 + die2;
}
