public int scoresAverage(int[] scores) {
    int averageFirst = average(scores, 0, scores.length/2);
    int averageSecond = average(scores, scores.length/2, scores.length);
    
    return averageFirst > averageSecond ? averageFirst : averageSecond;
}

private int average(int[] scores, int start, int end) {
    int sum = 0;
    for(int i = start; i < end; i++) {
        sum += scores[i];
    }
    
    return sum/(scores.length/2);
}
