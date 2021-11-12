package ge.msda.myapplication;

import android.app.Application;

import ge.msda.myapplication.api.RetrofitClient;

public class App extends Application {

    private static App instance;

    private RetrofitClient retrofitClient;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        retrofitClient = new RetrofitClient();

    }

    public static App getInstance() {
        return instance;
    }

    public RetrofitClient getRetrofitClient() {
        return retrofitClient;
    }

}