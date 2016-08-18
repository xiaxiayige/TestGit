package com.example.testgit;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.view.LineChartView;
//https://github.com/lecho/hellocharts-android/issues/174
/***
 * 测试git 提交 冲突 合并
 */
public class MainActivity extends AppCompatActivity {
    private LineChartView chart;
    private LineChartData data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chart= (LineChartView) findViewById(R.id.chart);

        List<Line> lines = new ArrayList<Line>();
        for (int i = 0; i < 2; ++i) {//two lines, second one has to have only one point
            List<PointValue> values = new ArrayList<PointValue>();
            for (int j = 0; j < 10; ++j) {//10 points for example but only for first line
                if(i == 1 && j == 0) {
                    //second line, first point, break because we want to add only one point to the second line, with the same Y value as the first point on the first line
                    values.add(new PointValue(8, lines.get(0).getValues().get(8).getY()));
                    break;
                } else {
                    values.add(new PointValue(j, (float) Math.random() * 100f));//adding point to the first line
                }
            }

            Line line = new Line(values);
            line.setColor(Color.BLUE);
            if(i == 1) {
                //set labels enabled for second line
                line.setHasLabels(true);
            } else {
                line.setHasLabels(false);
            }
            lines.add(line);
        }
        data = new LineChartData(lines);
        chart.setLineChartData(data);
    }
}
