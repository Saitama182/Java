public class Worker {
    String name;
    String post;

    double salary;



    Worker ( String name, String post , double salary  ) {
        this.name = name;
        this.post = post;
        this.salary = salary;

    }

    String salaryMonth ( int i ) {
        return "Имя сотрудника " + name + ". Должность сотрудника " + post + ". За последние " + i + " месяцев получил  " + (salary * i) ;

    }
}
