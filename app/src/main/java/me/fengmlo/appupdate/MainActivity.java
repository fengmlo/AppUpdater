package me.fengmlo.appupdate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.chejin360.appupdate.R;

import me.fengmlo.updatelibrary.CheckUpdateRequest;
import me.fengmlo.updatelibrary.Updater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CheckUpdateRequest request = new CheckUpdateRequest();
        request.setVersionType(CheckUpdateRequest.VERSION_TYPE_RELEASE);
        request.setVersionCode(0);
        Updater.check(this, "http://platut.wangkapai.com/", request);
    }
}
