package domain.valueobject

import java.util.Date

class TaskDeadLine (val deadLine: String?) {
    fun getDeadLine(): String? {
        return this.deadLine
    }
}