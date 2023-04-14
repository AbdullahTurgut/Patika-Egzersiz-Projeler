package OOP.StudentNoteSystem;

public class Course {
    // Course Sınıfı Özellikleri :
    // Nitelikler : name,code,prefix,note,Teacher
    // Metotlar : Course() , addTeacher() , printTeacher()

    String name;
    String code;
    String prefix; // bura branch ile eşleşecek
    int note;
    int verbalNote; // sözlü notu için
    Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }else
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
    }

    void printTeacher(){
        this.teacher.print();
    }
}
