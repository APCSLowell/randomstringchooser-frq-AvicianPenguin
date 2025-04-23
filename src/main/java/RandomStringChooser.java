import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  private String [] wordArray;
  public RandomStringChooser(String[] arr){
    wordArray = arr;
  }
  public String getNext(){
    if(wordArray.length<1)
      return ("NONE")
    int randomIndex = (int)(Math.random()*(wordArray.length));
    String value = wordArray[randomIndex];
    String [] newWordArray = new String [wordArray.length-1];
    for(int i = 0; i<wordArray.length; i++)
      {
        if(!wordArray[i].equals(value))
          newWordArray[i] = wordArray[i];
        else
          newWordArray[i-1] = wordArray[i];
      }
    wordArray = newWordArray; 
    return value;
  }
}
