int adjacentElementsProduct(int[] inputArray) {
    int i=0,j=1;
    int max = inputArray[i]*inputArray[j];
    while(j<inputArray.length-1){
        i++;j++;
        if(inputArray[i]*inputArray[j]>max){max=inputArray[i]*inputArray[j];}
    } return max;
}
