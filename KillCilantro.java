public class KillCilantro {
   //cilantro is 8 char
   public static String killCilantro(String words) {
      String text = words;
      String replacement = "parsley";
      String word = "cilantro";
      int index = words.indexOf(word);
      
      while(index != -1) {
      text = words.substring(0 , index) + replacement +  words.substring(index + word.length());
      index = text.indexOf(word);
      }
      return text;
     }
   
   public static void main(String[] args) {
      System.out.println(killCilantro("testcilantrotest"));
      System.out.println(killCilantro("cilantrotest"));
      System.out.println(killCilantro("nothinghere"));
      System.out.println(killCilantro("testcilantro"));
      System.out.println(killCilantro("cilantrocilantrocilantro"));
   }
}