public class Mean {
    public static void main(String[] args) {
        double summa = 0, mean = 0;
        int i = 0;

        for (String s : args){
            double d = Double.parseDouble(s);
            summa = d + summa;
            ++i;
            mean = summa / i;
        }
        System.out.println("Mean: " + mean);
    }
}
