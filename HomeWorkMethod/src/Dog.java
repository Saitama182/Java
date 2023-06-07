public class Dog {
    String name;
    String breed;
    int speed;
    void run(){
        String result = "";
        for (int i  = 0; i < speed; i++ ) {

            if ( i == speed-1) {
                result += "бегу.";
            } else {
                result += "бегу, ";
            }
        }
        System.out.println(result);
    }
    String info() {
        return "Name: " + name + ", Breed: " + breed + ", Speed: " + speed;
    }
}
