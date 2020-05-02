package todo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TodoService {

    public static List<Todo> listTodos = new ArrayList<>();

    public void addTodo(String description) {
        this.listTodos.add(new Todo(description));
    }

}
