boolean checkPalindrome(String inputString) {
    int i=0, j=inputString.length()-1;
    if(i==j){return true;}
    while(inputString.charAt(i)==inputString.charAt(j)&&i<=j){
        i++;j--;
    }
    if(inputString.charAt(i)==inputString.charAt(j)){
        return true;
    } return false;
}
