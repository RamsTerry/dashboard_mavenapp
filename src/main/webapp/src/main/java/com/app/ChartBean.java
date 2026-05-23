package com.app;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import org.primefaces.model.charts.bar.*;

@Named
@RequestScoped
public class ChartBean {

    private BarChartModel barModel;

    @PostConstruct
    public void init() {
        barModel = new BarChartModel();
        ChartData data = new ChartData();

        BarChartDataSet dataSet = new BarChartDataSet();
        dataSet.setLabel("Sales");
        dataSet.setData(java.util.Arrays.asList(10, 20, 30, 40));

        data.addChartDataSet(dataSet);
        data.setLabels(java.util.Arrays.asList("Q1","Q2","Q3","Q4"));

        barModel.setData(data);
    }

    public BarChartModel getBarModel() {
        return barModel;
    }
}
