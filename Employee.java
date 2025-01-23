import java.util.Scanner;
class Person {
    private String name;
    private int age;

    // Parameterless Constructor
    public Person()
    {
        this.name=null;
        this.age=0;
    }
    // Paramterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display method to show details of a person
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person {
    private int id;
    protected double salary;
    private String department;

   // Parameterless Constructor
   public Employee()
   {
    super();
    this.id=0;
    this.salary=0.0;
    this.department=null;
   }

    // Parametrized Constructor
    public Employee(String name, int age, int id, double salary, String department) {
        super(name, age);  // Calling the parent constructor
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Accept method to input employee details
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        setName(sc.nextLine());
        System.out.print("Enter age: ");
        setAge(sc.nextInt());
        System.out.print("Enter ID: ");
        setId(sc.nextInt());
        System.out.print("Enter salary: ");
        setSalary(sc.nextDouble());
        sc.nextLine();  // Consume newline character
        System.out.print("Enter department: ");
        setDepartment(sc.nextLine());
    }

    // Polymorpic Display method to show employee details
    @Override
    public void display() {
        super.display();  // Display person details
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    // Method to calculate total salary of all employees using an array
    public static double calcTotalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    // Main method to test the classes
    public static void main(String[] args) {
        // Creating an array to hold Employee objects
        Employee[] employees = new Employee[3];  // Example with 3 employees

        // Creating Employee objects and accepting details
        employees[0] = new Employee("Nilesh", 35, 1, 70000, "Technical");
        employees[1] = new Employee("Ketan", 34, 2, 60000, "Training");
        employees[2] = new Employee("Pratik", 33, 3, 50000, "Finance");

    // for(int i=0; i<employees.length;i++)
    // {
    //     Employee emp = new Employee();
    //     emp.accept();
    //     employees[i]=emp;
    // }

        // Display employee details
        System.out.println("Employee 1 Details:");
        employees[0].display();
        System.out.println("\nEmployee 2 Details:");
        employees[1].display();
        System.out.println("\nEmployee 3 Details:");
        employees[2].display();

    // for(int i=0; i<employees.length;i++)
    // {
    //     employees[i].display();
    // }

        // Calculate and display total salary
        double totalSalary = Employee.calcTotalSalary(employees);
        System.out.println("\nTotal Salary of all Employees: " + totalSalary);
    }
}
