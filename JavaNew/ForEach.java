public class ForEach {
    public static void main(String[] args){
    int[] numbers1 = {1,2,3};
    int sum = 0;
    for (int x:numbers1) {
        sum = sum+x;
    }
    System.out.println(sum);
    }
}