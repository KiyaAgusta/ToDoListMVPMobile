package com.example.todolistmvp.modul.todo;

import android.os.Bundle;

import com.example.todolistmvp.base.BasePresenter;
import com.example.todolistmvp.base.BaseView;

public interface ToDoContract {
    interface View extends BaseView<ToDoContract.Presenter> {
        void redirectToAdd();
        void emptyList();
        void showEditBox(String uneditedItem, final int index);
        void showDeleteDialog(final int position);
        void redirectToLogin();
    }

    interface Presenter extends BasePresenter {
        void addItem();
        void clearList();
        void editList(String uneditedItem, final int index);
        void deleteItem(final int position);
        void performLogout();
    }
}
