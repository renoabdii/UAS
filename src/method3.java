public class method3 {
    public static int CetakAngka() { //method  jenis 3
        return 5;
    }
    public static String[] InputData(int a, double[]v){ //method jenis 4
        String [] Kode = new String[]{"AB","CG","JK"};
        return Kode;

    }
    public static void main(String[] args) {
        int u = CetakAngka();
        System.out.println(u);// outputnya adalah 5

        double[] ParameterKedua = new double[]{5, 6, 7, 9};
        String[] t = InputData(2, ParameterKedua);
        for (String s : t) {
            System.out.println(s);

        }
    }}
