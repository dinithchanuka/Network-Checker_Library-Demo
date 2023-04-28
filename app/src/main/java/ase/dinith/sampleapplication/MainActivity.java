package ase.dinith.sampleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ase.dinith.networkcheckerlibrary.NetworkChecker;
import ase.dinith.sampleapplication.model.DataResponse;
import ase.dinith.sampleapplication.model.HealthData;
import ase.dinith.sampleapplication.network.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    NetworkChecker networkChecker;

    TextView tvDate,tvNewCase,tvLocalDeaths,tvLocalRecovered,tvError;
    Button btnRefresh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.networkChecker = new NetworkChecker(this);

        btnRefresh = findViewById(R.id.button_check);

        btnRefresh.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                getNetworkStatus();
            }
        });

        initEnv();
        getNetworkStatus();
    }

    private void initEnv() {

        tvDate = findViewById(R.id.text_view_date_time);
        tvNewCase = findViewById(R.id.text_view_new_cases);
        tvLocalDeaths = findViewById(R.id.text_view_local_deaths);
        tvLocalRecovered = findViewById(R.id.text_view_local_recovered);
        tvError = findViewById(R.id.text_view_error);

    }

    private void getNetworkStatus(){
        if(networkChecker.getNetworkStatus()){
            getUpdate();
            tvError.setVisibility(View.INVISIBLE);
        }else{
            tvError.setVisibility(View.VISIBLE);
        }
    }

    void getUpdate(){

        Call<DataResponse> call = RetrofitClient.getInstance().getMyApi().getHealthUpdate();

        call.enqueue(new Callback<DataResponse>(){

            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                HealthData healthData = response.body().getData();

                setData(healthData);
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {

            }
        });

    }

    void setData(HealthData healthData){
        tvDate.setText(healthData.getUpdate_date_time());
        tvNewCase.setText(healthData.getLocal_new_cases());
        tvLocalDeaths.setText(healthData.getLocal_deaths());
        tvLocalRecovered.setText(healthData.getLocal_recovered());
    }
}