public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void print() {
        System.out.println("Студент Слизерин. Имя: " + getName()
                + "; Колдовство: " + getMagic()
                + "; Трансгрессирование: " + getTransgression()
                + "; Хитрость: " + getCunning()
                + "; Решительность: " + getDetermination()
                + "; Амбициозность: " + getAmbition()
                + "; Находчивость: " + getResourcefulness()
                + "; Жажда власти: " + getLustForPower());
    }

    public int getTotalPoints() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public static void comparingStudent (Slytherin studentOne, Slytherin studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " лучший Студент Слизерин, чем " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo + " лучший Студент Слизерин, чем " + studentOne);
        }
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}
