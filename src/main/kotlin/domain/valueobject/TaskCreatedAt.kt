package domain.valueobject

class TaskCreatedAt(val createdAt: String?) {
    fun createdAt(): String? {
        return this.createdAt
    }
}