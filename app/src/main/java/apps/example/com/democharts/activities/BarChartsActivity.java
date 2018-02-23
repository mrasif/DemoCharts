package apps.example.com.democharts.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import apps.example.com.democharts.R;
import im.dacer.androidcharts.BarView;

public class BarChartsActivity extends AppCompatActivity {

    BarView bvChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_charts);

        bvChart=findViewById(R.id.bvChart);
        randomSet(bvChart);
    }

    private void randomSet(BarView barView) {
        int random = (int) (Math.random() * 20) + 6;
        ArrayList<String> test = new ArrayList<String>();
        for (int i = 0; i < random; i++) {
            test.add("test");
            test.add("pqg");
            //            test.add(String.valueOf(i+1));
        }
        barView.setBottomTextList(test);

        ArrayList<Integer> barDataList = new ArrayList<Integer>();
        for (int i = 0; i < random * 2; i++) {
            barDataList.add((int) (Math.random() * 100));
        }
        barView.setDataList(barDataList, 100);
    }
}
