package sg.com.kaplan.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class locate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate);

        ImageView aa = (ImageView) findViewById(R.id.main);
        aa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent( locate.this, MainActivity.class);
                startActivity(i);
            }
        });
        ImageView bb = (ImageView) findViewById(R.id.menu);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(locate.this, menu.class);
                startActivity(i);
            }
        });
        ImageView cc = (ImageView) findViewById(R.id.table);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(locate.this, table.class);
                startActivity(i);
            }
        });
        ImageView dd = (ImageView) findViewById(R.id.about);
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(locate.this, about.class);
                startActivity(i);
            }
        });
        Button ee = (Button) findViewById(R.id.button2);
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(locate.this, MapsActivity.class);
                startActivity(i);
            }
        });
    }
}
