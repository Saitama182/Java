class Dog {
    private String name;
    private int age;

    public static int number;


    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public void seeResult() {
        System.out.println(name +" "+ age);
        System.out.println(number);
    }
}
