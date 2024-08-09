package domain.repositoryinterface

import domain.entity.AddTaskEntity

interface AddTaskRepositoryInterface {
    public fun addTask(
        task: AddTaskEntity
    ): AddTaskEntity;
}