package at.fh.swengb.wheellist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.wheellist.model.Wheel;

/**
 * Created by Kevin on 22.11.2016.
 */

public class CustomAdapter extends android.widget.BaseAdapter {
    List<Wheel> listWheels;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<Wheel> listWheels) {
        this.context = applicationContext;
        this.listWheels= listWheels;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return listWheels.size();
    }
    @Override
    public Object getItem(int i) {
        return listWheels.get(i);
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        //Fehler bei Absturz gefunden - aufpassen auf textViewList
        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewCost=(TextView)view.findViewById(R.id.textViewListDeep);
        TextView viewPhone=(TextView)view.findViewById(R.id.textViewListPhone);

        Wheel wheel = listWheels.get(i);
        viewName.setText(wheel.getName()+", "+wheel.getCost());
        viewCost.setText(wheel.getDeep());
        viewPhone.setText(wheel.getPhoneNumber());

        return view;
    }

}
