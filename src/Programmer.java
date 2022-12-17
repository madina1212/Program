public class Programmer {
    private String name;
    private double salary;
    private Programmers programmers;

    public Programmer(String name, double salary, Programmers programmers) {
        this.name = name;
        this.salary = salary;
        this.programmers = programmers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Programmers getProgrammers() {
        return programmers;
    }

    public void setProgrammers(Programmers programmers) {
        this.programmers = programmers;
    }

    @Override
    public String toString() {
        return "\nProgrammer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", programmers=" + programmers +
                '}';
    }

    public static <K, T> void getLanguage(T t) {
    }

}
