package Task2;

public class Letter extends Document{

     Employee sender;
     Employee receiver;
     String text;

    public Letter(int number, String title, Employee sender, Employee receiver,String text) {
        super(number, title);

        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
    }

    public Employee getSender() {
        return sender;
    }

    public Employee getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return  "От кого - " + sender + ", Кому - " + receiver + ", Текст сообщения: " + text;
    }
}
