package inphosoft.vito.todolistweb;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

//public class MainActiviry extends AppCompatActivity
public class MainActivity extends SingleFragmentActivity {

    /* page 164
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //activity_main direfractor jadi activity_fragment
        setContentView(R.layout.activity_fragment);


        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = new TodoFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
    */

    //public static final String EXTRA_TASK_ID = "inphosoft.vito.todolistweb.task_id";
    private static final String EXTRA_TASK_ID = "inphosoft.vito.todolistweb.task_id";

    public static Intent newIntent(Context packageContext, UUID taskId){
        Intent intent = new Intent(packageContext, MainActivity.class);
        intent.putExtra(EXTRA_TASK_ID, taskId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        //return new TodoFragment();
        UUID taskId = (UUID) getIntent().getSerializableExtra(EXTRA_TASK_ID);
        return TodoFragment.newInstance(taskId);
    }
}
