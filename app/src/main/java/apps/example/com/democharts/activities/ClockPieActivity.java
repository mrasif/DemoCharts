package apps.example.com.democharts.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import apps.example.com.democharts.R;
import im.dacer.androidcharts.ClockPieHelper;
import im.dacer.androidcharts.ClockPieView;

public class ClockPieActivity extends AppCompatActivity {

    ClockPieView cpvChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock_pie);
        cpvChart=findViewById(R.id.cpvChart);
        randomSet(cpvChart);
    }

    private void randomSet(ClockPieView clockPieView) {
        ArrayList<ClockPieHelper> clockPieHelperArrayList = new ArrayList<ClockPieHelper>();
        for (int i = 0; i < 20; i++) {
            int startHour = (int) (24 * Math.random());
            int startMin = (int) (60 * Math.random());
            int duration = (int) (50 * Math.random());
            clockPieHelperArrayList.add(
                    new ClockPieHelper(startHour, startMin, 0, startHour, startMin + duration, 0));
        }
        clockPieView.setDate(clockPieHelperArrayList);
    }

    private void set(ClockPieView clockPieView) {
        ArrayList<ClockPieHelper> clockPieHelperArrayList = new ArrayList<ClockPieHelper>();
        clockPieHelperArrayList.add(new ClockPieHelper(1, 50, 2, 30));
        clockPieHelperArrayList.add(new ClockPieHelper(6, 50, 8, 30));
        clockPieView.setDate(clockPieHelperArrayList);
    }
}
