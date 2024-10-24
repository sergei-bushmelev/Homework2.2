public class PrintService {

    public void printAll(Slytherin[] studentsSlytherin) {
        for (Hogwarts student : studentsSlytherin) {
            student.print();
        }
    }

    public void printAll(Hufflepuff[] studentsHufflepuff) {
        for (Hogwarts student : studentsHufflepuff) {
            student.print();
        }
    }

    public void printAll(Griffindor[] studentsGriffindor) {
        for (Hogwarts student : studentsGriffindor) {
            student.print();
        }
    }

    public void printAll(Ravenclaw[] studentsRavenclaw) {
        for (Hogwarts student : studentsRavenclaw) {
            student.print();
        }
    }
}
