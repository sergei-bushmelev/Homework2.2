public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name,int magic, int transgression, int smart, int wisdom, int wit, int creativity) {
        super(name,magic, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;

    }

    public void print() {
        System.out.println("Студент Когтевран. Имя: " + getName()
                + "; Колдовство: " + getMagic()
                + "; Трансгрессирование: " + getTransgression()
                + "; Ум: " + getSmart()
                + "; Мудрость: " + getWisdom()
                + "; Остроумие: " + getWit()
                + "; Креативность: " + getCreativity());
    }

    public int getTotalPoints() {
        return smart + wisdom + wit + creativity;
    }

    public static void comparingStudent (Ravenclaw studentOne, Ravenclaw studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " лучший Студент Когтевран, чем " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo + " лучший Студент Когтевран, чем " + studentOne);
        }
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }
}
