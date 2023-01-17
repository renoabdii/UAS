public class Vokal {
    private static Vokal ReverseString;
    public static String Reverse(String str){
        char kal[]=str.toCharArray();
        String rev="";
        for (int i=kal.length-1;i>=0;i--){
            rev+=kal[i];

        }
        return rev.replaceAll("(?)[a i u e o]","*");

    }
}
