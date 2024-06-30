package domain.entityfactory

import domain.entity.AddTaskEntity
class AddTaskEntityFactory {
    companion object {
        public fun build(
            taskData: Array<String?>
        ): AddTaskEntity {
            return AddTaskEntity(
                TaskId = taskData[0]?.toInt(),
                TaskName = taskData[1],
                TaskContent = taskData[2],
                TaskStatus = taskData[3],
                TaskDeadline = taskData[4],
                createdAt = taskData[5],
                updatedAt = taskData[6],
                deletedAt = taskData[7]
            )
        }
    }
}