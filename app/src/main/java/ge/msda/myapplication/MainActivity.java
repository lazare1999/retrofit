package ge.msda.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import ge.msda.myapplication.api.models.Data;
import ge.msda.myapplication.api.models.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getInstance().getRetrofitClient().getApiService().getUsers(1).enqueue(new Callback<Data<List<User>>>() {

            @Override
            public void onResponse(Call<Data<List<User>>> call, Response<Data<List<User>>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<User> users = response.body().getData();
                    for (int i = 0; i < users.size(); i++) {
                        Log.d("MyData", users.get(i).toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<Data<List<User>>> call, Throwable t) {

            }

        });

    }

}