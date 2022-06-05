public class CreditPaymentService {
    public double calculate (int amount,double percent,double time) {
        double percentmonth = percent/ (100*12); // месячная процентная ставка
        double timemonth = time*12; // количество месяцец по кредиту
        double totalpercent = Math.pow(1+percentmonth,-timemonth);
        return amount*(percentmonth/(1-totalpercent));


    }
}
