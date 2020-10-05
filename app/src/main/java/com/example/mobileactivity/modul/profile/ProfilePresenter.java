package com.example.mobileactivity.modul.profile;

public class ProfilePresenter implements ProfileContract.Presenter {
    private final ProfileContract.View view;

    public ProfilePresenter(ProfileContract.View view) {
        this.view = view;
    }

    @Override
    public void start() {}

    @Override
    public void performLogout(){
        view.redirectToLogin();
    }
}
