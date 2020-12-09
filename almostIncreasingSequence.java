boolean almostIncreasingSequence(int[] sequence) {
    int count=0;
    for(int i=0;i<sequence.length-1;i++){
        if(sequence[i]>=sequence[i+1]){
            count++;
            if(i-1>=0&&i+2<sequence.length&&sequence[i-1]>=sequence[i+1]&&sequence[i]>=sequence[i+2]){
                return false;
            }
            if(count>=2){
                return false;
            }
        }
    } return true;
}
