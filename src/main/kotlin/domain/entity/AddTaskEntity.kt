package domain.entity

class AddTaskEntity {
    private var TaskId: Int?;
    private var TaskName: String?;
    private var TaskContent: String?;
    private var TaskStatus: String?;
    private var TaskDeadline: String?;
    private var createdAt: String?;
    private var updatedAt: String?;
    private val deletedAt: String?

    constructor(
        TaskId: Int?,
        TaskName: String?,
        TaskContent: String?,
        TaskStatus: String?,
        TaskDeadline: String?,
        createdAt: String?,
        updatedAt: String?,
        deletedAt: String?
    ) {
        this.TaskId = TaskId
        this.TaskName = TaskName
        this.TaskContent = TaskContent
        this.TaskStatus = TaskStatus
        this.TaskDeadline = TaskDeadline
        this.createdAt = createdAt
        this.updatedAt = updatedAt
        this.deletedAt = deletedAt
    }

    public fun TaskId(): Int? {
        return this.TaskId
    }

    public fun TaskName(): String? {
        return this.TaskName
    }

    public fun TaskContent(): String? {
        return this.TaskContent
    }

    public fun TaskStatus(): String? {
        return this.TaskStatus
    }

    public fun TaskDeadline(): String? {
        return this.TaskDeadline
    }

    public fun createdAt(): String? {
        return this.createdAt
    }

    public fun updatedAt(): String? {
        return this.updatedAt
    }

    public fun deletedAt(): String? {
        return this.deletedAt
    }
}