package at.fh.swengb.wheellist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import at.fh.swengb.wheellist.model.Wheel;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private List<Wheel> listWheels;
    private ListView myListView;
    private CustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myWheelList);

        listWheels = new ArrayList<>();
        listWheels.add(new Wheel("Continental","20€","5mm","01 020304050","Nein","12mm"));
        listWheels.add(new Wheel("Continental","35€","5mm","01 020304050","Ja","12mm"));
        listWheels.add(new Wheel("Continental","100€","20mm","01 020304050","Nein","12mm"));
        listWheels.add(new Wheel("Michelin","5€","5mm","01 020304050","Ja","12mm"));
        listWheels.add(new Wheel("Michelin","20€","5mm","01 020304050","Nein","12mm"));
        listWheels.add(new Wheel("Franklin","100€","5mm","01 020304050","Ja","12mm"));

        myAdapter = new CustomAdapter(this,listWheels);
        myListView.setAdapter(myAdapter);
        myListView.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Wheel selectedWheel = listWheels.get(i);
        Intent intent = new Intent(view.getContext(),ShowWheelActivity.class);
        intent.putExtra("wheel",selectedWheel);
        startActivity(intent);
    }
}
