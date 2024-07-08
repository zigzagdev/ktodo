package domain.valueobject

class TaskStatus (val status: String?) {
    fun getStatus(): String? {
        return this.status
    }
}