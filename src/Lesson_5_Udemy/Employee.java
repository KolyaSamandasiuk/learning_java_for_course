package Lesson_5_Udemy;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String departament;
    Employee(int idConstr, String surnameConstr, int ageConstr, double salaryConstr, String departamentConstr) {
        id = idConstr;
        surname = surnameConstr;
        age = ageConstr;
        salary = salaryConstr;
        departament = departamentConstr;
    }
    double salaryUpTwo() {
        salary *= 2;
        return salary;
    }
}
class EmployeeTest  {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Samandasiuk", 21, 2500, "QA");
        employee1.salaryUpTwo();
        System.out.println(employee1.salary);

        Employee employee2 = new Employee(2, "Poroshenko", 55, 1000, "Getman");
        employee2.salaryUpTwo();
        System.out.println(employee2.salary);
    }

}