class Person {
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class Anas {
    public static void main(String[] args) {
        Person per = new Person();
        per.setName("Harsh");
        per.setSalary(30000);

        System.out.println("Name: " + per.getName());
        System.out.println("Salary: " + per.getSalary());
    }
}
