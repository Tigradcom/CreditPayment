public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double payment1 = service.calculate(1_000_000, 9.99, 1);
        int finalPayment1 = (int) payment1;
        System.out.println("Ежемесячный платеж (кредит на 1 год): " + finalPayment1);

        double payment2 = service.calculate(1_000_000, 9.99, 2);
        int finalPayment2 = (int) payment2;
        System.out.println("Ежемесячный платеж (кредит на 2 года): " + finalPayment2);

        double payment3 = service.calculate(1_000_000, 9.99, 3);
        int finalPayment3 = (int) payment3;
        System.out.println("Ежемесячный платеж (кредит на 3 года): " + finalPayment3);

    }
}

