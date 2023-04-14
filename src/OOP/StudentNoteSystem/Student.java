package OOP.StudentNoteSystem;

public class Student {
    // Student Sınıfı Özellikleri :
    // Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    // Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNo;
    String classes;
    double avarage;
    boolean isPass;

    // Student Constructor without avarage and isPass
    public Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100)
            this.c1.note = note1;
        if (note2 >= 0 && note2 <= 100)
            this.c2.note = note2;
        if (note3 >= 0 && note3 <= 100)
            this.c3.note = note3;
    }

    void addBulkVerbalNote(int verbalNote1, int verbalNote2, int verbalNote3) {
        if (verbalNote1 >= 0 && verbalNote1 <= 100)
            this.c1.verbalNote = verbalNote1;
        if (verbalNote2 >= 0 && verbalNote2 <= 100)
            this.c2.verbalNote = verbalNote2;
        if (verbalNote3 >= 0 && verbalNote3 <= 100)
            this.c3.verbalNote = verbalNote3;
    }

    double calcAvarage(){
        this.avarage = (((this.c1.note * 0.80) + (this.c1.verbalNote * 0.20)) +
                ((this.c2.note * 0.80) + (this.c2.verbalNote * 0.20)) +
                ((this.c3.note * 0.80) + (this.c3.verbalNote * 0.20))) / 3.0;

        return this.avarage;
    }
    void isPass() {
        this.avarage = calcAvarage();
        printNote();
        if(this.avarage >55)
            System.out.println("Sınıfı geçtiniz!");
        else
            System.out.println("Kaldınız!");
    }

    void printNote() {
        System.out.println(this.c1.name + " notu:  " + this.c1.note);
        System.out.println(this.c1.name + " sözlü notu:  " + this.c1.verbalNote);

        System.out.println(this.c2.name + " notu:  " + this.c2.note);
        System.out.println(this.c2.name + " sözlü notu:  " + this.c2.verbalNote);

        System.out.println(this.c3.name + " notu:  " + this.c3.note);
        System.out.println(this.c3.name + " sözlü notu:  " + this.c3.verbalNote);
        System.out.println();
        System.out.println("Genel Ortalamanız: " + this.avarage);
    }


}
