int makeArrayConsecutive2(int[] statues) {
    int min=statues[0],max=statues[0];
    for(int i=1;i<statues.length;i++){
        if(statues[i]<min){
            min=statues[i];
    } else if(statues[i]>max){
        max=statues[i];
        }
    } return max-min-statues.length+1;
}
