public class Main {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("Михаіл", "Некрасов", 4000);
            printEmp(emp1);
            Employee emp2 = new Employee("Александро-Константинопольский-Филигранный", "Прізвище", -1000);
            printEmp(emp2);
        } catch (FieldLengthLimitException | IncorrectSalaryException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
    public static void printEmp(Employee emp){
        System.out.println("Працівник "+ emp.getId() + ": \nІм'я: " + emp.getName() + "\nПрізвище: " + emp.getSurname() + "\nЗаробітна плата: " + emp.getSalary() + "zl");
    }
}

