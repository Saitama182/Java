public class MainEmployeeBase {
    public static void main(String[] args){
        Employee man1 = new Employee();
        man1.setName("Jonn");
        man1.setAge(19);
        System.out.println("Имя: "+ man1.getName() + " Возраст: " + man1.getAge());
    }
}