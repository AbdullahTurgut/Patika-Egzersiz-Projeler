package OOP.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kemal", 2000, 45, 1985);
        double employeeTax = employee1.tax();
        double employeeBonus = employee1.bonus();
        double employeeRaiseSalary = employee1.raiseSalary();
        double totalSalary = (employee1.salary - employeeTax) + employeeBonus;
        System.out.println(employee1.toString());
        System.out.print("Vergi : " + employeeTax +
                " Bonus : " + employeeBonus +
                " Maaş Artışı : " + employeeRaiseSalary +
                " Bonuslar ile birlikte maaş : " + totalSalary);

    }
}
