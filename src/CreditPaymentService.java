public class CreditPaymentService {
    public double calculate(int amount, double percent, double time) {
        double percentMonth = percent / (100 * 12);                  // месячная процентная ставка
        double timeMonth = time * 12;                                // количество месяцец по кредиту
        double totalPercent = Math.pow(1 + percentMonth, -timeMonth);
        return amount * (percentMonth / (1 - totalPercent));
    }
}
