package com.example.practiceflag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listview;
    int[] countryimage=new int[]{R.drawable.pakistan,R.drawable.china,R.drawable.afghanistan,R.drawable.brazil,R.drawable.england,R.drawable.ireland,R.drawable.libiya,R.drawable.newzeland,R.drawable.srilanka,R.drawable.zimbawe,R.drawable.pakistan,R.drawable.china,R.drawable.afghanistan,R.drawable.brazil,R.drawable.england,R.drawable.ireland,R.drawable.libiya,R.drawable.newzeland,R.drawable.srilanka,R.drawable.zimbawe};
    String[] countryNmaes=new String[]{"Pakistan","China","afghanistan","brazil","England","Ireland","Libiya","NewZeland","SriLanka","Zimbawe","Pakistan","China","afghanistan","brazil","England","Ireland","Libiya","NewZeland","SriLanka","Zimbawe"};
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customAdapter=new CustomAdapter(getApplicationContext(),countryimage,countryNmaes);
        listview.setAdapter(customAdapter);
    }
}