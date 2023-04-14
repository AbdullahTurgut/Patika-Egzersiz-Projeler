package OOP.StudentNoteSystem;

/*
        Öğrenci Not Sistemi

        Course Sınıfı Özellikleri :
        Nitelikler : name,code,prefix,note,Teacher
        Metotlar : Course() , addTeacher() , printTeacher()

        Teacher Sınıfı Özellikleri :
        Nitelikler : name,mpno,branch
        Metotlar : Teacher()

        Student Sınıfı Özellikleri :
        Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
        Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
*/
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Cemalettin", "50202303", "MAT");
        Teacher t2 = new Teacher("Nazmi","342345612","FZK");
        Teacher t3 = new Teacher("Elif","123352341","EDBYT");

        Course mat = new Course("Metematik", "101", "MAT");
        mat.addTeacher(t1);

        Course fzk = new Course("Fizik","102","FZK");
        fzk.addTeacher(t2);

        Course edbyat = new Course("Edebiyat","103","EDBYT");
        edbyat.addTeacher(t3);

        Student s1 = new Student("Kemal Sunal","123","3",mat,fzk,edbyat);
        s1.addBulkExamNote(60,80,40);
        s1.addBulkVerbalNote(80,90,80);
        s1.isPass();

    }
}
