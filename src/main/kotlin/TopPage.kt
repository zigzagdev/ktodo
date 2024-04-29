import components.Todo;
import function.Add.addTask;

fun main(args: Array<String>) {
    println("components.Todo Application")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    val todoList = mutableListOf<Todo>()

    print("Enter task title: ")
    val taskTitle = readlnOrNull() ?: ""

    print("Enter task content: ")
    val taskContent = readlnOrNull() ?: ""

    addTask(todoList, taskTitle, taskContent)

    todoList.forEach { todo ->
        println("Title: ${todo.title}, Content: ${todo.content}")
    }
}
