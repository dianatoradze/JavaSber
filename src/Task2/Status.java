package Task2;

public enum Status {
    создан,исполнен;
}
class Now{
    Status currentStatus;

    public Now(Status currentStatus) {
        this.currentStatus = currentStatus;
    }
}

