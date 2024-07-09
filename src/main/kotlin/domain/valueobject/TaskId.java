package domain.valueobject;

public class TaskId {
    private final Number id;

    public TaskId(Number id) {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        this.id = id;
    }

    public Number getId() {
        return this.id;
    }
}