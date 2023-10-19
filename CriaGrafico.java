package metodosOrdenacao;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

public class CriaGrafico extends JFrame{
    public void GraficoTempos(String titulo, long tempo1, long tempo2, long tempo3, long tempo4, int tamanho) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(tempo1, "Bolha", ""+tamanho);
        dataset.addValue(tempo2, "Inserção", ""+tamanho);
        dataset.addValue(tempo3, "Seleção", ""+tamanho);
        dataset.addValue(tempo4, "QuickSort", ""+tamanho);

        JFreeChart barChart = ChartFactory.createBarChart(
                titulo,
                "Tarefas",
                "Tempo (ms)",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        setContentPane(chartPanel);
    }
}
