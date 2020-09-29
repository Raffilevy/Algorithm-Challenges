public class FindOdd {
  public static int findIt(int[] a) {
    int count = 0;
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j<a.length; j++){
        if(j==i)
          continue;
        if(a[i]==a[j]){
          if(count==0)
            count += 2;
          else
            count++;
         }
      }
      if(count%2!=0){
        count = a[i];
        return count;
      }
      else if(count==0){
        count = a[i];
        return count;
      }
      else if(count%2==0)
        count = 0;
    }
    
    return count;
  }
}
