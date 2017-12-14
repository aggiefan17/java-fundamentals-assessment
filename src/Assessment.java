public class Assessment extends User {

    public static int square (int a){
        return a * a;
    }

    public static int sum (int x, int y){
        return x + y;
    }

    public static double average (int[] numbers){
        double sum = 0;
        for (int i=0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double result = sum / numbers.length;
        return result;

    }

    public static void main(String[] args) {
        System.out.println(square(5));

        System.out.println(sum(4,7));

        System.out.println(average(new int[]{10, 15, 30}));
    }


}
