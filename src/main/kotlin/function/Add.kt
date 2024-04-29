package function.Add
import components.Todo


fun addTask(todoList: MutableList<Todo>, taskTitle: String, taskContent: String) {
    val newTask = Todo(taskTitle, taskContent)
    todoList.add(newTask)
}