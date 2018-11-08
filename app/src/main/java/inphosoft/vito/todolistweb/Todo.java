package inphosoft.vito.todolistweb;

import java.util.Date;
import java.util.UUID;

public class Todo {
    private UUID mId;
    //private String mTitle;
    private String mTask;
    private Date mDate;
    private boolean mFinished;

    public Todo(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTask() {
        return mTask;
    }

    public void setTask(String task) {
        mTask = task;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isFinished() {
        return mFinished;
    }

    public void setFinished(boolean finished) {
        mFinished = finished;
    }
}
