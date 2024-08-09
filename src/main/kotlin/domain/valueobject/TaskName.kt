package domain.valueobject

class TaskName (val name: String?) {
    fun getTaskName(): String? {
        return this.name
    }
}