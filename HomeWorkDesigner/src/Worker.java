public class Worker {
    String name;
    String post;
    int salary;

    public Worker(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }
    String info (int month ) {
        return "Сотрудник " + name + ", должность " + post + ", за последние  12 месяцев получил " + month * salary + " рублей";
    }
}


