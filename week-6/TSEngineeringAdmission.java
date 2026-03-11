class NotEligibleForEngineering extends RuntimeException {
    public NotEligibleForEngineering(String s) {
        super(s);
    }
}

class NotEligibleForVJIT extends RuntimeException {
    public NotEligibleForVJIT(String s) {
        super(s);
    }
}

public class TSEngineeringAdmission {
    public static void main(String[] args) {
        try {
            int score = Integer.parseInt(args[0]);

            if (score < 50) {
                throw new NotEligibleForEngineering("Score less than 50: Not eligible for Engineering admission.");
            } else if (score < 70) {
                throw new NotEligibleForVJIT("Score between 50 and 69: Not eligible for VJIT admission.");
            } else {
                System.out.println("Welcome to VJIT-Thanks For Your Registration!");
            }

        } catch (NotEligibleForEngineering | NotEligibleForVJIT e) {
            e.printStackTrace();
            System.out.println("Message: " + e.getMessage());
            System.out.println("ToString: " + e.toString());
        }

        System.out.println("Rest of the Code");
    }
}