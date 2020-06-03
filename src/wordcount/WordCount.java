package wordcount;

public class WordCount{
    private String paragraph;

    public WordCount(String paragraph){
        this.paragraph = paragraph;
    }

  public String getWords(){
    return paragraph;
  }
  @Override //this allows us to print out the state of the obejct and not the memory location...@Override does this...it overrides the default 
    public String toString(){
        return "strings: " + paragraph;
    }

   
}