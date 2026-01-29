public class zoho {
   public static void questions()
   {

       String a= "Zoho Corporation India";
       String[] words = a.split(" ");
       StringBuilder result = new StringBuilder(" ");
       for (String word : words )
       {
           StringBuilder sb = new StringBuilder(word);
           result.append(sb.reverse()).append(" ");
       }
       System.out.println(result);
   }
}

