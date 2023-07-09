public class Main {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,10,100};
        int sum = 0;
        for (int i = 0; i< nums.length; i++){
            sum += nums[i];
        }
        System.out.println("Сумма чисел  массива равна " + sum);
    }
}
