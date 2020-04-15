package com.example.mvplogin.contract;

public interface MainContract {

    interface View {
        // the presenter is going to call the methods here
        void showError();
        void LoginUser();
        void showDialog();
        void hideDialog();
    }

    interface Presenter {
        // here are the methods that the view will ask the presenter to call
        void AttemptLoginUser(String username, String password);

        void detachView();
    }
}
