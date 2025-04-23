import java.util.*;
public class RandomStringChooser
{
  private List <String> wordArray;
  public RandomStringChooser(String[] arr)
  {
    wordArray = new <String>();
    for(String word : arr)
      wordArray.add(word);
  }
  public String getNext()
  {
    if(wordArray.size()<1)
      return ("NONE");
    else
    {
      int value = (int)(Math.random()*(wordArray.length));
      return(wordArray.remove(value));
    }
  }
}
