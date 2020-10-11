package com.example.todolistmvp.modul.todo;

import android.content.Intent;
import android.view.View;

import com.example.todolistmvp.base.BaseFragmentHolderActivity;

import java.util.ArrayList;

public class ToDoActivity extends BaseFragmentHolderActivity {
    ToDoFragment toDoFragment;
    private final int UPDATE_REQUEST = 2019;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
        ivIcon.setVisibility(View.VISIBLE);

        Intent dataIntent = getIntent();
        ArrayList<String> returnedList = dataIntent.getStringArrayListExtra("returnData");
        toDoFragment = new ToDoFragment(returnedList);
        setCurrentFragment(toDoFragment, true);
    }
}
