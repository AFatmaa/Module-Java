package exercise1_interfaces;

public class Main {

    public static void main(String[] args) {
        StatementDeliveryService deliveryService = new StatementDeliveryService();

        LetterStatementSender letterSender = new LetterStatementSender();

        EmailStatementSender emailStatementSender = new EmailStatementSender();

        String statementContent = "Your monthly bank statement is ready.";

        deliveryService.deliverStatement(statementContent, letterSender);

        deliveryService.deliverStatement(statementContent, emailStatementSender);

    }
}