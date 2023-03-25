package ru.mirea.zhurin.d.r.multiactivity;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private View editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }



    public void onClickNewActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("key", editText.getText().toString());
        startActivity(intent);

        String text = (String)  getIntent().getSerializableExtra("key");

        String textToSend = editText.getText().toString();
        intent.putExtra("text", textToSend);
        startActivity(intent);
    }

    private void startActivities(Intent intent) {
    }
}