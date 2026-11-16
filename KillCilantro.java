public class KillCilantro {
   //cilantro is 8 char
   public static String killCilantro(String words) {
      String returnString = "";
      for (int i = 0; i < words.length(); i++) {
        if ((i + 8 <= words.length() ) && words.substring(i, i+1) == "cilantro" ) {
         returnString += words.substring(0, i);
         returnString += words.substring(i+8);
        } 
      }
      return returnString;
     }
   
   public static void main(String[] args) {
      System.out.println(killCilantro("testcilantrotest"));
      System.out.println(killCilantro("cilantrotest"));
      System.out.println(killCilantro("nothinghere"));
      System.out.println(killCilantro("testcilantro"));
      System.out.println(killCilantro("cilantrocilantrocilantro"));
   }
}