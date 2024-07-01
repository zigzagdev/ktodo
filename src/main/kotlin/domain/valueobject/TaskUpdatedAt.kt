package domain.valueobject

class TaskUpdatedAt {
    private val updatedAt: String?

    constructor(updatedAt: String?) {
        this.updatedAt = updatedAt
    }

    public fun updatedAt(): String? {
        return this.updatedAt
    }
}