package com.example.todolistmvp.modul.todo;

import android.os.Bundle;


public class ToDoPresenter implements ToDoContract.Presenter {
    private final ToDoContract.View view;

    public ToDoPresenter(ToDoContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void addItem() {
        view.redirectToAdd();
    }

    @Override
    public void clearList() {
        view.emptyList();
    }

    @Override
    public void editList(String uneditedItem, int index) {
        view.showEditBox(uneditedItem, index);
    }

    @Override
    public void deleteItem(int position) {
        view.showDeleteDialog(position);
    }
}
