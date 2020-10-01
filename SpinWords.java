public class SpinWords {

  public String spinWords(String sentence) {
    String[] words = sentence.split(" ");
    String reverse = "";
    for(int i = 0; i<words.length; i++){
      String word = words[i];
      String reverseWord = "";
      if(word.length()>=5){
      for(int j = word.length()-1; j>=0;j--){
          reverseWord = reverseWord + word.charAt(j);
      }
        if(i!=words.length-1)
        reverseWord = reverseWord + " ";
       }
       else if (words.length==1||i==words.length-1){
         reverseWord = reverseWord + words[i];
       }
      else{
        reverseWord = reverseWord + words[i] + " ";
      }
      reverse = reverse + reverseWord;
    }
    return reverse;
  }
}
