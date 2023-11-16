public class Employee {
    private int id;
    private static int nextId = 1;
    private String name;
    private String surname;
    private double salary;

    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public static int getNextId() {
        return nextId;
    }

    public Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        if (name.length() > 30) {
            throw new FieldLengthLimitException("Ім'я повинно бути до 30ти символів");
        }
        if (surname.length() > 30) {
            throw new FieldLengthLimitException("Прізвище повинно бути до 30ти символів");
        }
        if (salary < 0) {
            throw new IncorrectSalaryException("Заробітна плата не може бути менше за 0");
        }

        this.id = nextId++;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
}
class FieldLengthLimitException extends Exception {
    public FieldLengthLimitException(String message) {
        super(message);
    }
}

class IncorrectSalaryException extends Exception {
    public IncorrectSalaryException(String message) {
        super(message);
    }
}


