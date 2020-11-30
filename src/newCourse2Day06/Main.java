package newCourse2Day06;

public class Main {
    public static void main(String[] args) {
        LoanConsumer ann = new LoanConsumer("Ann", 18, 20000);
        LoanConsumer mary = new LoanConsumer("Mary", 70, 50000);
        LoanConsumer sally = new LoanConsumer("Sally", 50, 45000);
        LoanConsumer perry = new LoanConsumer("Perry", 65, 3000);
        LoanConsumer teddy = new LoanConsumer("Teddy", 17, 17000);
        LoanConsumer tom = new LoanConsumer("Tom", 20, 9000);
        LoanConsumer sam = new LoanConsumer("Sam", 30, 65000);
        LoanConsumer[] loanConsumers = new LoanConsumer[]{ann, mary, sally, perry, teddy, tom, sam};

        LoanIssuer peter = new LoanIssuer("Peter", true, true);
        LoanIssuer mike = new LoanIssuer("Mike", true, false);
        LoanIssuer gabi = new LoanIssuer("Gabi", false, true);
        LoanIssuer donald = new LoanIssuer("Donald", false, false);
        LoanIssuer[] loanIssuers = new LoanIssuer[]{peter, mike, gabi, donald};

        for (int i = 0; i < loanIssuers.length; i++) {
            for (int j = 0; j < loanConsumers.length; j++) {
                if (loanIssuers[i].toIssue(loanConsumers[j])) {
                    System.out.println(loanIssuers[i].getName() + " issues a loan to " + loanConsumers[j].getName());
                } else
                    System.out.println(loanIssuers[i].getName() + " does not issue a loan to " + loanConsumers[j].getName());
            }
        }
    }
}
