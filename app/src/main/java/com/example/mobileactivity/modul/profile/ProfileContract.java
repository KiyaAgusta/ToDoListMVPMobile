package com.example.mobileactivity.modul.profile;

import com.example.mobileactivity.base.BasePresenter;
import com.example.mobileactivity.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void redirectToLogin();
    }

    interface Presenter extends BasePresenter {
        void performLogout();
    }
}
