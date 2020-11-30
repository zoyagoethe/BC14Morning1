package newCourse2Day06;

public class LoanConsumer {
    String name;
    int age;
    int annualIncome;

    public LoanConsumer() {
    }

    public LoanConsumer(String name, int age, int annualIncome) {
        this.name = name;
        this.age = age;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }
}
