public class Main {
    public static void main(String[] args) {


        CreditPaymentService service1Year = new CreditPaymentService();

        double monthlyPayment1Year = service1Year.calculate(1000000, 9.99, 12);

        System.out.println(monthlyPayment1Year);

        CreditPaymentService service2Years = new CreditPaymentService();

        double monthlyPayment2Years = service2Years.calculate(1000_000, 9.99, 24);

        System.out.println(monthlyPayment2Years);

        CreditPaymentService service3Years = new CreditPaymentService();

        double monthlyPayment3Years = service3Years.calculate(1000_000, 9.99, 36);

        System.out.println(monthlyPayment3Years);



    }
}

