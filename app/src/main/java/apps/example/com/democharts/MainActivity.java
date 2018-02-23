package apps.example.com.democharts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import apps.example.com.democharts.activities.BarChartsActivity;
import apps.example.com.democharts.activities.ClockPieActivity;
import apps.example.com.democharts.activities.LineChartActivity;
import apps.example.com.democharts.activities.PiChartsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLineChart, btnBarCharts, btnPiCharts, btnClockPiChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initiliazation
        btnLineChart=findViewById(R.id.btnLineCharts);
        btnBarCharts=findViewById(R.id.btnBarCharts);
        btnPiCharts=findViewById(R.id.btnPiCharts);
        btnClockPiChart=findViewById(R.id.btnClockPiCharts);


        // Invoking listener
        btnLineChart.setOnClickListener(this);
        btnBarCharts.setOnClickListener(this);
        btnPiCharts.setOnClickListener(this);
        btnClockPiChart.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLineCharts: {
                startActivity(new Intent(MainActivity.this, LineChartActivity.class));
            } break;
            case R.id.btnBarCharts: {
                startActivity(new Intent(MainActivity.this, BarChartsActivity.class));
            } break;
            case R.id.btnPiCharts: {
                startActivity(new Intent(MainActivity.this, PiChartsActivity.class));
            } break;
            case R.id.btnClockPiCharts: {
                startActivity(new Intent(MainActivity.this, ClockPieActivity.class));
            } break;
        }
    }
}
