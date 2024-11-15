package webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("JSP 공부하기", "공부"));
		todos.add(new Todo("Spring 공부하기", "공부"));
		todos.add(new Todo("점심식사 하기", "먹기"));
	}

	public List<Todo> getTodos() {
		return todos;
	}

	public void addTodo(Todo todo) {
		todos.add(todo);
	}

	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}

}
