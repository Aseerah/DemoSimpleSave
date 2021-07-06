package sg.edu.rp.c346.id20009530.demosimplesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    @Override
    protected void onResume() {
        super.onResume();
//        String msg = "No greetings!";
//        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
//        // message will pop up when user opens the app

        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        String msg = prefs.getString("greetings","no greetings");
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        String msg = "Acitivty closed!";
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

        // message will pop up when user closes the app

        //stores the data String entered by user
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor prefEdit = prefs.edit();
        prefEdit.putString("greetings","hello");
        prefEdit.putString("2nd","123456");
        prefEdit.commit();


    }

}