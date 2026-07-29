package exercise1_interfaces;

public class Main {

    public static void main(String[] args) {
        StatementDeliveryService deliveryService = new StatementDeliveryService();

        StatementService statementService = new StatementService(deliveryService);

        StatementSender letterSender = new LetterStatementSender();

        StatementSender emailSender = new EmailStatementSender();

        statementService.createAndSendAllTransactionsMonthlyStatement(emailSender);

        statementService.createAndSendOutgoingTransactionsMonthlyStatement(letterSender);

    }
}