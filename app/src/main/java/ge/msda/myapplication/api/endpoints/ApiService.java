package ge.msda.myapplication.api.endpoints;

import java.util.List;

import ge.msda.myapplication.api.models.Data;
import ge.msda.myapplication.api.models.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("users")
    Call<Data<List<User>>> getUsers(@Query("page") int page);

}