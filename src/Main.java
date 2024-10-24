public class Main {
    public static void main(String[] args) {

        Slytherin[] studentsSlytherin = {
                new Slytherin("Драко Малфой", 10, 11, 12, 13, 14, 15, 16),
                new Slytherin("Грэхэм Монтегю", 20, 21, 22, 23, 24, 25, 26),
                new Slytherin("Грегори Гойл", 30, 31, 32, 33, 34, 35, 36)
        };

        Hufflepuff[] studentsHufflepuff = {
                new Hufflepuff("Захария Смит", 1, 2, 3, 4, 5),
                new Hufflepuff("Седрик Диггори", 6, 7, 8, 9, 10),
                new Hufflepuff("Джастин Финч-Флетчли", 26, 27, 98, 49, 10)
        };

        Griffindor[] studentsGriffindor = {
                new Griffindor("Гарри Поттер", 60, 61, 62, 63, 64),
                new Griffindor("Гермиона Грейнджер", 50, 1, 32, 93, 14),
                new Griffindor("Рон Уизли", 6, 91, 29, 32, 6)
        };

        Ravenclaw[] studentsRavenclaw = {
                new Ravenclaw("Чжоу Чанг", 52, 54, 87, 8, 9, 55),
                new Ravenclaw("Падма Патил", 26, 54, 58, 38, 89, 63),
                new Ravenclaw("Маркус Белби", 51, 4, 7, 85, 89, 2)
        };

        PrintService printService = new PrintService();
        printService.printAll(studentsSlytherin);
        printService.printAll(studentsHufflepuff);
        printService.printAll(studentsGriffindor);
        printService.printAll(studentsRavenclaw);

        Slytherin.comparingStudent(studentsSlytherin[1], studentsSlytherin[2]);
        Hufflepuff.comparingStudent(studentsHufflepuff[1], studentsHufflepuff[2]);
        Griffindor.comparingStudent(studentsGriffindor[1], studentsGriffindor[2]);
        Ravenclaw.comparingStudent(studentsRavenclaw[1], studentsRavenclaw[2]);
        Hogwarts.comparingStudent(studentsHufflepuff[1], studentsGriffindor[2]);
    }
}