String[] allLongestStrings(String[] inputArray) {
    int max=0;
    int counter=0;
    for(int i=0;i<inputArray.length;i++){
        if(inputArray[i].length()>max){
            max=inputArray[i].length();
            counter=1;
        } else if(inputArray[i].length()==max){
            counter++;
        }
    }
    int done=counter;
    String[] ans=new String[counter];
    for(int j=0;j<inputArray.length;j++){
        if(inputArray[j].length()==max){
            ans[counter-done]=inputArray[j];
            done--;
        }
    } return ans;
}
