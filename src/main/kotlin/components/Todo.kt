package components

data class Todo(
    val title: String,
    var content: String,
    var isChecked: Boolean = false
)