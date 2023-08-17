public class ExampleClass {

    
    public void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Сумма чисел " + a + " и " + b + " равна " + sum);
    }

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();
        
        
        example.printSum(5, 7);
    }
}