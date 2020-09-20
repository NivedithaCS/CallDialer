package ammu.java.calldialer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callNumber(View v){
        switch (v.getId()){
            case R.id.btn1ID:
                showDialer("0112233445566");
                break;
            case R.id.btn2ID:
                showDialer("0665544332211");
                break;
        }
    }

    private void showDialer(String mobileNumber){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + mobileNumber));
        startActivity(intent);
    }
}