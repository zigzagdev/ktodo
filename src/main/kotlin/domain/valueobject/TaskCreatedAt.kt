package domain.valueobject

class TaskCreatedAt{
    private val createdAt: String?

    constructor(createdAt: String?) {
        this.createdAt = createdAt
    }

    public fun createdAt(): String? {
        return this.createdAt
    }
}