package domain.valueobject;

import java.util.Optional;

public class TaskUpdatedAt {
    private final Optional<String> updatedAt;

    public TaskUpdatedAt(
            String updatedAt
    )
    {
        this.updatedAt = Optional.ofNullable(updatedAt);
    }

    public Optional<String> getUpdatedAt()
    {
        return this.updatedAt;
    }
}