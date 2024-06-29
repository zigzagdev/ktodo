package Domain.ValueObject

class TaskDeletedAt {
    private val deletedAt: String?

    constructor(deletedAt: String?) {
        this.deletedAt = deletedAt
    }

    public fun deletedAt(): String? {
        return this.deletedAt
    }
}