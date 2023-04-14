package OOP.StudentNoteSystem;

public class Teacher {
    // Teacher Sınıfı Özellikleri :
    // Nitelikler : name,mpno,branch ---> created
    // Metotlar : Teacher() ------------> created (as constructor)

    String name;
    String phoneNumber;
    String branch;

    public Teacher(String name, String phoneNumber, String branch) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone: " + this.phoneNumber);
        System.out.println("Branch(Bölüm): " + this.branch);
    }
}
