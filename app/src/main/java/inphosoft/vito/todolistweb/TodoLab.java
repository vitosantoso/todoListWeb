package inphosoft.vito.todolistweb;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TodoLab {
    private static TodoLab sTodoLab;

    private List<Todo> mTodos;

    public static TodoLab get(Context context){
        if(sTodoLab == null){
            sTodoLab = new TodoLab(context);
        }
        return sTodoLab;
    }

    private TodoLab(Context context){
        mTodos = new ArrayList<>();
        /*
        for (int i = 0; i < 100; i++) {
            Todo todo = new Todo();
            todo.setTask("Task #" + i);
            todo.setFinished(i % 2 == 0);;// Every other one
            mTodos.add(todo);

        } */
    }

    public void addTodo(Todo t){
        mTodos.add(t);
    }

    public List<Todo> getTodos() {
        return mTodos;
    }

    public Todo getTodo(UUID id){
        for(Todo todo : mTodos){
            if(todo.getId().equals(id)){
                return todo;
            }
        }
        return null;
    }
}
