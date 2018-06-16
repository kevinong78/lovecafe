package sg.com.kaplan.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageView aa = (ImageView) findViewById(R.id.main);
        aa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent( menu.this, MainActivity.class);
                startActivity(i);
            }
        });
        ImageView bb = (ImageView) findViewById(R.id.table);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menu.this, table.class);
                startActivity(i);
            }
        });
        ImageView cc = (ImageView) findViewById(R.id.locate);
        cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menu.this, locate.class);
                startActivity(i);
            }
        });
        ImageView dd = (ImageView) findViewById(R.id.about);
        dd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(menu.this, about.class);
                startActivity(i);
            }
        });

}

}
