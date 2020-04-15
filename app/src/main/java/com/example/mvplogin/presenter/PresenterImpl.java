package com.example.mvplogin.presenter;

import com.example.mvplogin.Model.FakeServer;
import com.example.mvplogin.contract.MainContract;

public class PresenterImpl implements MainContract.Presenter {

    private MainContract.View view;
    private FakeServer fakeServer;


    public PresenterImpl(MainContract.View view) {
        this.view = view;

       fakeServer = new FakeServer();

    }

    @Override
    public void AttemptLoginUser(String username, String password) {
        boolean login = fakeServer.shouldLogin(username, password);

        if (login) {
            view.LoginUser();
        }
        else {
            view.showError();
        }

    }

    @Override
    public void detachView() {
        view = null;

    }
}
