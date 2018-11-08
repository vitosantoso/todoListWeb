package inphosoft.vito.todolistweb;

import android.support.v4.app.Fragment;

public class TodoListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new TodoListFragment();
    }
}
