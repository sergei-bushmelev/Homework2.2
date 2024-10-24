public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int transgression, int hardworking, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void print() {
        System.out.println("Студент Пуффендуй. Имя: " + getName()
                + "; Колдовство: " + getMagic()
                + "; Трансгрессирование: " + getTransgression()
                + "; Трудолюбие: " + getHardworking()
                + "; Верность: " + getLoyalty()
                + "; Честность: " + getHonesty());
    }

    public int getTotalPoints() {
        return hardworking + loyalty + honesty;
    }

    public static void comparingStudent (Hufflepuff studentOne, Hufflepuff studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " лучший Студент Пуффендуй, чем " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo + " лучший Студент Пуффендуй, чем " + studentOne);
        }
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}

