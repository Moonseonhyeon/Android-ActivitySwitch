package org.linda.activityex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity {

    private static final String TAG = "SubActivity";
    private Button btnFinishSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btnFinishSub = findViewById(R.id.btn_finish_sub);
        btnFinishSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();//Task날림.
            }
        });
        
        Intent intent = getIntent();//메인에 있는 아까 그 intent에 접근하는 함수.
        String name = intent.getStringExtra("name");
        User user = (User)intent.getSerializableExtra("user");//키값만 넣으면 됨
        Log.d(TAG, "onCreate: name: "+name);
        Log.d(TAG, "onCreate: username: "+user.getUsername());
        Log.d(TAG, "onCreate: password:"+user.getPassword());
    }
}