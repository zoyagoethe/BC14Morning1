package newCourse2Day06;

public class LoanIssuer {
    String name;
    boolean isLazy;
    boolean isKind;

    public LoanIssuer(String name, boolean isLazy, boolean isKind) {
        this.name = name;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public String getName() {
        return name;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public boolean isKind() {
        return isKind;
    }

    public boolean toIssue(LoanConsumer customer) {
        if (customer.getAge() < 18 || customer.getAnnualIncome() < 20_000) {
            return false;
        } else if (isLazy) {
            return true;
        } else if (customer.getAge() < 70 & !isLazy & isKind) {
            return true;
        } else if (customer.getAge() < 50 & !isLazy & !isKind) {
            return true;
        }
        return false;
    }
}

