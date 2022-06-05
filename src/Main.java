public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
            int amount = 1_000_000;
            double percent = 9.99;
            double time = 3;
            double payment = service.calculate(amount,percent,time);
            System.out.println("Ежемесячный платеж:");
            System.out.printf("%8.2f", + payment);

    }

}

