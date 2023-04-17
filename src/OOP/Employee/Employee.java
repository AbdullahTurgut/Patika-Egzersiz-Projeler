package OOP.Employee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    // consructor

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // methods
    double tax() {
        if (this.salary < 1000) {
            return this.salary;
        } else
            return this.salary * 0.03;
    }

    double bonus() {
        int bonusSalary;
        int bonusHours = this.workHours - 40;
        if (bonusHours > 0)
            bonusSalary = bonusHours * 30;
        else
            return 0;
        return bonusSalary;
    }

    double raiseSalary() {
        int workingYears = 2021 - this.hireYear;
        if (workingYears < 10)
            return this.salary * 0.05;
        else if (workingYears < 20)
            return this.salary * 0.1;
        else
            return this.salary * 0.15;
    }

    @Override
    public String toString() {
        return  "Adı='" + this.name + '\'' +
                ", Maaşı=" + this.salary +
                ", Çalışma Saati=" + this.workHours +
                ", Başlangıç Yılı=" + this.hireYear ;
    }
}
