package Willson;

public class Main {
    public static void main(String[] args) {
        System.out.println(CurrencyConverter.convert(Currency.PLN,Currency.EUR));
        ExchangeOffice exchangeOffice = new ExchangeOffice(1000.0);
        exchangeOffice.showFunds();
        exchangeOffice.exchange(100,Currency.PLN,Currency.EUR);
        exchangeOffice.showFunds();
    }
}
