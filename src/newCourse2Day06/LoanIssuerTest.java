package newCourse2Day06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanIssuerTest {

    @Test
    void toIssue_CustomerLess18_annualIncomeLess20000_false() {
        LoanConsumer ann = new LoanConsumer("Ann", 17, 18000);
        LoanConsumer mary = new LoanConsumer("Mary", 18, 5000);
        LoanConsumer sally = new LoanConsumer("Sally", 17, 25000);
        LoanConsumer[] loanConsumers = new LoanConsumer[]{ann, mary, sally};
        LoanIssuer peter = new LoanIssuer("Peter", true, true);
        LoanIssuer mike = new LoanIssuer("Mike", true, false);
        LoanIssuer gabi = new LoanIssuer("Gabi", false, true);
        LoanIssuer donald = new LoanIssuer("Donald", false, false);
        LoanIssuer[] loanIssuers = new LoanIssuer[]{peter, mike, gabi, donald};

        for (int i = 0; i < loanIssuers.length; i++) {
            for (int j = 0; j < loanConsumers.length; j++) {
                assertEquals(false, loanIssuers[i].toIssue(loanConsumers[j]));
            }
        }
    }

    @Test
    void toIssue_ClerkLazy_true() {
        LoanConsumer ann = new LoanConsumer("Ann", 18, 20000);
        LoanConsumer mary = new LoanConsumer("Mary", 71, 50000);
        LoanConsumer sally = new LoanConsumer("Sally", 51, 45000);
        LoanConsumer[] loanConsumers = new LoanConsumer[]{ann, mary, sally};

        LoanIssuer peter = new LoanIssuer("Peter", true, true);
        LoanIssuer mike = new LoanIssuer("Mike", true, false);
        LoanIssuer[] loanIssuers = new LoanIssuer[]{peter, mike};

        for (int i = 0; i < loanIssuers.length; i++) {
            for (int j = 0; j < loanConsumers.length; j++) {
                assertEquals(true, loanIssuers[i].toIssue(loanConsumers[j]));
            }
        }
    }

    @Test
    void toIssue_ClerkKindNotLazy_true() {
        LoanConsumer ann = new LoanConsumer("Ann", 18, 20000);
        LoanConsumer sally = new LoanConsumer("Sally", 51, 45000);
        LoanConsumer perry = new LoanConsumer("Perry", 69, 50000);
        LoanConsumer[] loanConsumers = new LoanConsumer[]{ann, sally, perry};

        LoanIssuer gabi = new LoanIssuer("Gabi", false, true);
        for (int i = 0; i < loanConsumers.length; i++) {
            assertEquals(true, gabi.toIssue(loanConsumers[i]));
        }

    }

    @Test
    void toIssue_ClerkKindNotLazy_false() {
        LoanConsumer mary = new LoanConsumer("Mary", 70, 50000);
        LoanIssuer gabi = new LoanIssuer("Gabi", false, true);
        assertEquals(false, gabi.toIssue(mary));
    }

    @Test
    void toIssue_ClerkNotKindNotLazy_true() {
        LoanConsumer ann = new LoanConsumer("Ann", 18, 20000);
        LoanConsumer sally = new LoanConsumer("Sally", 49, 45000);
        LoanConsumer[] loanConsumers = new LoanConsumer[]{ann, sally};

        LoanIssuer donald = new LoanIssuer("Donald", false, false);
        for (int i = 0; i < loanConsumers.length; i++) {
            assertEquals(true, donald.toIssue(loanConsumers[i]));
        }
    }

    @Test
    void toIssue_ClerkNotKindNotLazy_false() {
        LoanConsumer sally = new LoanConsumer("Sally", 50, 45000);
        LoanConsumer perry = new LoanConsumer("Perry", 17, 50000);
        LoanConsumer[] loanConsumers = new LoanConsumer[]{sally, perry};

        LoanIssuer donald = new LoanIssuer("Donald", false, false);
        for (int i = 0; i < loanConsumers.length; i++) {
            assertEquals(false, donald.toIssue(loanConsumers[i]));
        }
    }
}

