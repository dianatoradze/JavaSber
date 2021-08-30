package Task2;

public class OrderHiring extends Document {
    private final Employee employee;
    private final Status Now;
    String text;

    public OrderHiring(int number, String title, Employee employee, String text, Status currentStatus) {
        super(number, title);
        this.employee = employee;
        this.text = text;
        this.Now = currentStatus;

    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Приказ на прием -  " + "номер " +  getNumber() + ", название:  " + getTitle() +
                 " " + employee +
                ", статус - " + Now +
                ", текст приказа: " + getText();
    }

}
