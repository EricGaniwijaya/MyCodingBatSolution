def make_bricks(small, big, goal):
  remainder = 0
  
  if goal <= big * 5:
    remainder = goal % 5
  else:
    remainder = goal - 5 * big
  
  return remainder <= small

    
