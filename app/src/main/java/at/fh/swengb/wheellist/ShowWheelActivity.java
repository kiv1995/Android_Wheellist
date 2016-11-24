package at.fh.swengb.wheellist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.wheellist.model.Wheel;

public class ShowWheelActivity extends AppCompatActivity {
    private Wheel wheel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_wheel);

        Intent intent = getIntent();
        wheel = (Wheel)intent.getExtras().get("wheel");

        TextView viewName = (TextView) findViewById(R.id.textViewName);
        TextView viewCost = (TextView) findViewById(R.id.textViewCost);
        TextView viewDeep = (TextView) findViewById(R.id.textViewDeep);
        TextView viewPhone = (TextView) findViewById(R.id.textViewPhone);
        TextView viewUsed = (TextView) findViewById(R.id.textViewUsed);

        viewName.setText(wheel.getName());
        viewCost.setText(wheel.getCost());
        viewDeep.setText(wheel.getDeep());
        viewPhone.setText(wheel.getPhoneNumber());
        viewUsed.setText(wheel.getUsed());

    }
    public void call(View view) {
        Uri number = Uri.parse("tel:"+wheel.getPhoneNumber());
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }
}
