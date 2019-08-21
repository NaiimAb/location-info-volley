package com.speroapps.library.locationInfo.app;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.speroapps.library.R;
import com.speroapps.library.locationInfo.api.InfoManager;
import com.speroapps.library.databinding.ActivityMainBinding;
import com.speroapps.library.locationInfo.model.ResponseModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        InfoManager apiManager = new InfoManager(Volley.newRequestQueue(this));
        apiManager.getGeoIpInfo(binding::setResponse, this::showError);

        /*apiManager.getGeoIpInfo(response -> {
            //This is how you get the information.
            Log.i("All Responses", "onResponse: " + response.messageToString() );
        }, error -> {
            String errorMessage = error.toString();
        });*/
    }

    private void showError(VolleyError error) {
        Toast.makeText(this, error.toString(), Toast.LENGTH_SHORT).show();
    }
}
