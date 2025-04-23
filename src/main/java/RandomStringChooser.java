import java.util.*;
public class RandomStringChooser
{
  private String [] wordArray;
  public RandomStringChooser(String[] arr){
    wordArray = arr;
  }
  public String getNext(){
    if(wordArray.length<1)
      return ("NONE");
    int count = 0;
    int randomIndex = (int)(Math.random()*(wordArray.length));
    String value = wordArray[randomIndex];
    String [] newWordArray = new String [wordArray.length-1];
    for(int i = 0; i<wordArray.length; i++)
      {
        if(!wordArray[i].equals(value))
          newWordArray[i] = wordArray[i];
        else
        {
          count++;
          newWordArray[i] = wordArray[i+count];
        }
      }
    wordArray = newWordArray; 
    return value;
  }
}
