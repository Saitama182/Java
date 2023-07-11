public class Monster {
    int eyes;
    int hands;
    int feet;

    Monster() {
        eyes = 2;
        hands = 2;
        feet = 2;
    }

    Monster(int eyes) {
        this.eyes = eyes;
        hands = 2;
        feet = 2;
    }

    Monster(int eyes, int hands) {
        this.eyes = eyes;
        this.hands = hands;
        feet = 2;
    }

    Monster(int eyes, int hands, int feet) {
        this.eyes = eyes;
        this.hands = hands;
        this.feet = feet;
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int i) {
        String word = "Голос";
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }

    void voice(int i, String word) {

        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }
}