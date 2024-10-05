
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.util.List;

public class PlotGraph {
    
    public static void createAndShowPlot(List<Vital> vitals) {
        XYSeries series = new XYSeries("Vitals Over Time");
        
        // Extract `t` (timestamp) and `e` (event) values from each vital object
        for (Vital vital : vitals) {
            series.add(vital.t, vital.e);
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create a line chart
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Vital Measurements Over Time",
                "Time (t)", // X-axis label
                "Event (e)", // Y-axis label
                dataset
        );

        // Create and display the chart in a JFrame
        JFrame frame = new JFrame("Vital Data Plot");
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
