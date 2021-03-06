package com.siddharth.netstats;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.utils.XLabels;
import com.github.mikephil.charting.utils.YLabels;

import java.util.ArrayList;


public class cfrag2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cfrag2, container, false);
    }

    public void go(ArrayList<String> xVals,ArrayList<BarDataSet> dataSets)
    {

        BarChart b=(BarChart)getView().findViewById(R.id.chart);
        b.set3DEnabled(true);
        b.setDrawBarShadow(false);
        b.setDepth((float) 2.1);
        //b.setDrawHorizontalGrid(false);
        b.setDrawVerticalGrid(false);
        b.animateXY(1500, 1500);
        b.setDescription("This Week");

        XLabels xl = b.getXLabels();
        xl.setPosition(XLabels.XLabelPosition.BOTTOM);
        xl.setTextSize(12f);

        YLabels yl = b.getYLabels();
        yl.setPosition(YLabels.YLabelPosition.LEFT);


        BarData data = new BarData(xVals, dataSets);
        b.setData(data);
    }

}