import java.util.*;
public class RandomStringChooser
{
  private List <String> words;
  public RandomStringChooser(String[] wordArray)
  {
    words = new ArrayList <String>();
    for(String word : wordArray)
      {
        words.add(word);
      }
  }
  public String getNext()
  {
    if(words.size()>0)
      return(words.remove((int)(Math.random()*words.size())));
    return("NONE");
  }
}
