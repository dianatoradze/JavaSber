package Task2;

public class OrderDismissal extends Document {
    private final Employee employee;
    private final Status Now;
    String text;
    String parametr;

    public OrderDismissal(int number, String title, Employee employee, String text, String parametr,Status currentStatus) {
       super(number,title);
        this.employee = employee;
        this.text = text;
        this.Now = currentStatus;
        this.parametr = parametr;

    }

    public String getParametr() {
        return parametr;
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
