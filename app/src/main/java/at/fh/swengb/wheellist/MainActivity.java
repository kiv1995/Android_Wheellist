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
    private ArrayAdapter<Wheel> myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView = (ListView) findViewById(R.id.myWheelList);

        listWheels = new ArrayList<>();
        listWheels.add(new Wheel("Continentl","20€","5mm","01 020304050"));
        listWheels.add(new Wheel("Continentl","35€","5mm","01 020304050"));
        listWheels.add(new Wheel("Continentl","100€","20mm","01 020304050"));
        listWheels.add(new Wheel("Michelin","5€","5mm","01 020304050"));
        listWheels.add(new Wheel("Michelin","20€","5mm","01 020304050"));
        listWheels.add(new Wheel("Franklin","100€","5mm","01 020304050"));

        myAdapter = new ArrayAdapter <Wheel>(this,R.layout.row_item_simple,R.id.textViewSimpleName,listWheels);
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