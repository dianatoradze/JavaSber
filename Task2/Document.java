package Task2;

public abstract class Document {
    private  int number;
    private  String title;
    private  Status Now;

    public Document(int number, String title) {
        this.number = number;
        this.title = title;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Status getNow() {
        return Now;
    }
    // печать по ключу сделаю позже
    public void print() {
        System.out.println("Документ с номером " + getNumber() + ", название документа - " + getTitle());
    }
}
