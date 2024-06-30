package domain.entityfactory

import domain.entity.AddTaskEntity
class AddTaskEntityFactory {
    companion object {
        public fun build(
            taskData: Array<Any?>
        ): AddTaskEntity {
            return AddTaskEntity(
                TaskId = taskData[0]?.toString()?.toInt(),
                TaskName = taskData[1]?.toString(),
                TaskContent = taskData[2]?.toString(),
                TaskStatus = taskData[3]?.toString(),
                TaskDeadline = taskData[4]?.toString(),
                createdAt = taskData[5]?.toString(),
                updatedAt = taskData[6]?.toString(),
                deletedAt = taskData[7]?.toString(),
            )
        }
    }
}