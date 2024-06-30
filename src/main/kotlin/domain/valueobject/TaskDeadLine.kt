package domain.valueobject

import java.util.Date

class TaskDeadLine {
    private val deadLine: Date?

    constructor(deadLine: Date?) {
        this.deadLine = deadLine
    }

    public fun deadLine(): Date? {
        return this.deadLine
    }
}