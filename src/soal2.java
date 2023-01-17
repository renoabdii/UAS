public class soal2 {
    public static void main(String[] args) {
        System.out.println(ReverseString.Reverse("a b cd ef"));
        System.out.println(ReverseString.Reverse("contoh kalimat"));
    }
    private static soal2 ReverseString;
    public static String Reverse(String str){
        char kal[]=str.toCharArray();
        String ren = "";
        for(int i=kal.length-1;i>=0;i--){
            ren+=kal[i];

        }
        return ren.replaceAll("(?)[aiueo]","*");
    }
}