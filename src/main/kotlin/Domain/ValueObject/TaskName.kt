package Domain.ValueObject

class TaskName {
    private val name: String?

    constructor(name: String?) {
        this.name = name
    }

    public fun getName(): String? {
        return this.name
    }
}