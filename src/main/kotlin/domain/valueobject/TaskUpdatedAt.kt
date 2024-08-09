package domain.valueobject

class TaskUpdatedAt (val updatedAt: String?) {
    fun updatedAt(): String? {
        return this.updatedAt
    }
}