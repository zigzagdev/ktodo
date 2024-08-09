package domain.valueobject

class TaskDeletedAt (val deletedAt: String?) {
    fun deletedAt(): String? {
        return this.deletedAt
    }
}