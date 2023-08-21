class Employee {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
        if (age < 0 ) {
            System.out.println("Введите положительное число");
        } else {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }
}