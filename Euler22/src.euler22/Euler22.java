import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
 
public class Euler22 {
   public static void main(String args[]) throws FileNotFoundException{
                
      Scanner in = new Scanner(new File("names.txt")).useDelimiter("[\",]+");
      ArrayList<String> names = new ArrayList<String>();
       
      while (in.hasNext()){
         names.add(in.next());
      }
      Collections.sort(names);
  
      int totalSum = 0;
      for(int i = 0; i < names.size();i++){
         String oneName = names.get(i);
         int sumName = 0;
         for(int j = 0; j < oneName.length();j++){
            sumName += oneName.charAt(j) -'A'+1; //Corrige index-1      
         }
         totalSum += sumName*(i+1);  //Corrige index-1
      } 
      System.out.println(totalSum);
    }
}