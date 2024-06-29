package Domain.ValueObject

class TaskContent {
    private val content: String?

    constructor(content: String?) {
        this.content = content
    }

    public fun getContent(): String? {
        return this.content
    }
}