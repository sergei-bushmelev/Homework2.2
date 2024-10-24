public class Griffindor extends Hogwarts {
    private int nobleness;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magic, int transgression, int nobleness, int honor, int bravery) {
        super(name,magic, transgression);
        this.nobleness = nobleness;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void print() {
        System.out.println("Студент Гриффиндор. Имя: " + getName()
                + "; Колдовство: " + getMagic()
                + "; Трансгрессирование: " + getTransgression()
                + "; Благородство: " + getNobleness()
                + "; Честь: " + getHonor()
                + "; Храбрость: " + getBravery());
    }

    public int getTotalPoints() {
        return nobleness + honor + bravery;
    }

    public static void comparingStudent (Griffindor studentOne, Griffindor studentTwo) {
        if (studentOne.getTotalPoints() > studentTwo.getTotalPoints()) {
            System.out.println(studentOne + " лучший Студент Гриффиндор, чем " + studentTwo);
        } else if (studentOne.getTotalPoints() < studentTwo.getTotalPoints()) {
            System.out.println(studentTwo + " лучший Студент Гриффиндор, чем " + studentOne);
        }
    }

    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
}

