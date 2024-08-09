package Infrastructure.Repository

import domain.repositoryinterface.AddTaskRepositoryInterface
import domain.entity.AddTaskEntity
import domain.entityfactory.AddTaskEntityFactory

class AddTaskRepository : AddTaskRepositoryInterface {
    private var task: AddTaskEntity? = null

    override fun addTask(task: AddTaskEntity): AddTaskEntity {
        this.task = task

        val taskData = getTaskValue();
        return AddTaskEntityFactory.build(taskData)
    }

    private fun getTaskValue(): Array<Any?>
    {
        val taskArray = arrayOf<Any?>(
            this.task?.TaskId() ?:0,
            this.task?.TaskName(). toString(),
            this.task?.TaskContent(). toString(),
            this.task?.TaskStatus(). toString(),
            this.task?.TaskDeadline().toString(),
            this.task?.createdAt().toString(),
            this.task?.updatedAt().toString(),
            this.task?.deletedAt().toString()
        )
        return taskArray
    }
}