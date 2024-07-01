package domain.valueobject

class TaskStatus {
    private val status: String?

    constructor(status: String?) {
        this.status = status
    }

    public fun getStatus(): String? {
        return this.status
    }
}