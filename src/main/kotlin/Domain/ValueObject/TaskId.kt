package Domain.ValueObject


class TaskId {
    private val id: Number?

    constructor(id: Number?) {
        this.id = id
    }

    public fun getId(): Number? {
        return this.id
    }
}