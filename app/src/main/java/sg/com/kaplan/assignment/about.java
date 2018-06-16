package sg.com.kaplan.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView aa = (ImageView) findViewById(R.id.main);
        aa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent( about.this, MainActivity.class);
                startActivity(i);
            }
        });
        ImageView bb = (ImageView) findViewById(R.id.menu);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(about.this, menu.class);
                startActivity(i);
            }
        });
        ImageView cc = (ImageView) findViewById(R.id.table);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(about.this, table.class);
                startActivity(i);
            }
        });
        ImageView dd = (ImageView) findViewById(R.id.locate);
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(about.this, locate.class);
                startActivity(i);
            }
        });
    }
}
