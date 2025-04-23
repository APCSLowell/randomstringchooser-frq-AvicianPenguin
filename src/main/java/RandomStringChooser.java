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
    if(wordArray.size()>0)
      return(wordArray.remove((int)(Math.random()*words.size()));
    return("NONE");
  }
