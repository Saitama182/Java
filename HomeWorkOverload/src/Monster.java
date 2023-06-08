public class Monster {
    int eyes;
    int arms;
    int leg;

    Monster() {
        eyes = 2;
        arms = 2;
        leg = 2;
    }
    Monster (int eyes) {
        this.eyes = eyes;
        arms = 2;
        leg = 2;

    }

    Monster (int eyes, int arms) {
        this.eyes = eyes;
        this.arms = arms;
        leg = 2;

    }
    Monster (int eyes, int arms, int leg) {
        this.eyes = eyes;
        this.arms = arms;
        this.leg = leg;
    }
        void voice() {
            System.out.println("Голос");
        }

    void voice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Голос");
        }
    }

    void voice(int n, String word) {
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }

    }


}
