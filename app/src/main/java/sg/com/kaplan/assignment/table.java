package sg.com.kaplan.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class table extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        ImageView aa = (ImageView) findViewById(R.id.main);
        aa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent( table.this, MainActivity.class);
                startActivity(i);
            }
        });
        ImageView bb = (ImageView) findViewById(R.id.menu);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(table.this, menu.class);
                startActivity(i);
            }
        });
        ImageView cc = (ImageView) findViewById(R.id.locate);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(table.this, locate.class);
                startActivity(i);
            }
        });
        ImageView dd = (ImageView) findViewById(R.id.about);
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(table.this, about.class);
                startActivity(i);
            }
        });

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(table.this, "RESERVATION CONFIRMED", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0,0);
                toast.show();
            }
        });

    }
}
