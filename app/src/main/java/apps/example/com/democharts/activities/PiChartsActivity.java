package apps.example.com.democharts.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import apps.example.com.democharts.R;
import im.dacer.androidcharts.PieHelper;
import im.dacer.androidcharts.PieView;

public class PiChartsActivity extends AppCompatActivity {

    PieView pvChart;
    TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pi_charts);
        pvChart=findViewById(R.id.pvChart);
        tvStatus=findViewById(R.id.tvStatus);
        randomSet(pvChart);
    }

    private void randomSet(PieView pieView) {
        ArrayList<PieHelper> pieHelperArrayList = new ArrayList<PieHelper>();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        int totalNum = (int) (5 * Math.random()) + 5;

        int totalInt = 0;
        for (int i = 0; i < totalNum; i++) {
            int ranInt = (int) (Math.random() * 10) + 1;
            intList.add(ranInt);
            totalInt += ranInt;
        }
        for (int i = 0; i < totalNum; i++) {
            pieHelperArrayList.add(new PieHelper(100f * intList.get(i) / totalInt));
        }

        pieView.setOnPieClickListener(new PieView.OnPieClickListener() {
            @Override public void onPieClick(int index) {
                if (index != PieView.NO_SELECTED_INDEX) {
                    tvStatus.setText(index + " selected");
                } else {
                    tvStatus.setText("No selected pie");
                }
            }
        });

        pieView.selectedPie(PieView.NO_SELECTED_INDEX);
        pieView.showPercentLabel(true);
        pieView.setDate(pieHelperArrayList);
    }
    private void set(PieView pieView) {
        ArrayList<PieHelper> pieHelperArrayList = new ArrayList<PieHelper>();
        pieHelperArrayList.add(new PieHelper(20, Color.BLACK));
        pieHelperArrayList.add(new PieHelper(6));
        pieHelperArrayList.add(new PieHelper(30));
        pieHelperArrayList.add(new PieHelper(12));
        pieHelperArrayList.add(new PieHelper(32));

        pieView.setDate(pieHelperArrayList);
        pieView.setOnPieClickListener(new PieView.OnPieClickListener() {
            @Override public void onPieClick(int index) {
                if (index != PieView.NO_SELECTED_INDEX) {
                    tvStatus.setText(index + " selected");
                } else {
                    tvStatus.setText("No selected pie");
                }
            }
        });
        pieView.selectedPie(2);
    }
}
