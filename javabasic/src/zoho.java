public class zoho {
   public static void words()
   {

       String a= "Zoho Corporation India";
       String[] words = a.split(" ");
       StringBuilder result = new StringBuilder(" ");
       for (String word : words )
       {
           StringBuilder sb = new StringBuilder(word);
           result= result.append(sb.reverse()).append(" ");
       }
       System.out.println(result);
   }
   public static void aestrik(){
       int a =5;
        for( int i=a; i>=1;i--)
        {
            for( int j = 1;j <=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
   }
}

