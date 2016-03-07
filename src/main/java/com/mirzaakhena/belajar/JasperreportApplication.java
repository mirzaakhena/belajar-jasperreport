package com.mirzaakhena.belajar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;


public class JasperreportApplication {

	public static void main(String[] args) {

		String source = "reports/masterreport.jasper";

		try {

			MasterReport masterReport = new MasterReport();
			masterReport.setRecipeName("Nasi Goreng");
			masterReport.setBatchName("baaatch");
			masterReport.setBatchNo("baaacth nooo");
			masterReport.setDate("12-12-2012");
			masterReport.setTotalDuration("14mn13sc");
			masterReport.setOperatorName("oppperatooor nmaame");
			masterReport.setQuantity("12312");
			masterReport.setTank("t1");

			{
				List<DataTable> listDatatable = new ArrayList<>();
				listDatatable.add(new DataTable(1, "DSA 68/70kg", -2.1, "11:03:42 (3mn5sc)", "AGT 20rpm", "HTG 12C", "", ""));
				listDatatable.add(new DataTable(2, "DSB 23/20kg", 3.7, "11:17:21 (21mn7sc)", "AGT 33rpm", "", "", ""));
				listDatatable.add(new DataTable(3, "DSC 100/99kg", 11.2, "11:44:57 (4mn35sc)", "VCM 44bpm", "", "", ""));
				masterReport.setDataTables(listDatatable);
			}
			{
				List<ListDataChart> listDataCharts = new ArrayList<>();
				masterReport.setListOfDataCharts(listDataCharts);
				{
					List<DataChart> listDataChart = new ArrayList<>();
					listDataChart.add(new DataChart(1, 13, "Dosing A"));
					listDataChart.add(new DataChart(6, 90, "Dosing A"));
					listDataChart.add(new DataChart(9, 15, "Dosing A"));
					ListDataChart lcd = new ListDataChart(listDataChart);
					listDataCharts.add(lcd);
				}
				{
					List<DataChart> listDataChart = new ArrayList<>();
					listDataChart.add(new DataChart(3, 24, "Heating A"));
					listDataChart.add(new DataChart(5, 18, "Heating A"));
					listDataChart.add(new DataChart(15, 50, "Heating A"));
					ListDataChart lcd = new ListDataChart(listDataChart);
					listDataCharts.add(lcd);
				}
				{
					List<DataChart> listDataChart = new ArrayList<>();
					listDataChart.add(new DataChart(3, 24, "Heating A"));
					listDataChart.add(new DataChart(5, 18, "Heating A"));
					listDataChart.add(new DataChart(15, 50, "Heating A"));
					ListDataChart lcd = new ListDataChart(listDataChart);
					listDataCharts.add(lcd);
				}
				{
					List<DataChart> listDataChart = new ArrayList<>();
					listDataChart.add(new DataChart(3, 24, "Heating A"));
					listDataChart.add(new DataChart(5, 18, "Heating A"));
					listDataChart.add(new DataChart(15, 50, "Heating A"));
					ListDataChart lcd = new ListDataChart(listDataChart);
					listDataCharts.add(lcd);
				}
				{
					List<DataChart> listDataChart = new ArrayList<>();
					listDataChart.add(new DataChart(3, 24, "Heating A"));
					listDataChart.add(new DataChart(5, 18, "Heating A"));
					listDataChart.add(new DataChart(15, 50, "Heating A"));
					ListDataChart lcd = new ListDataChart(listDataChart);
					listDataCharts.add(lcd);
				}
				{
					List<DataChart> listDataChart = new ArrayList<>();
					listDataChart.add(new DataChart(3, 24, "Heating A"));
					listDataChart.add(new DataChart(5, 18, "Heating A"));
					listDataChart.add(new DataChart(15, 50, "Heating A"));
					ListDataChart lcd = new ListDataChart(listDataChart);
					listDataCharts.add(lcd);
				}
				{
					List<DataChart> listDataChart = new ArrayList<>();
					listDataChart.add(new DataChart(3, 24, "Heating A"));
					listDataChart.add(new DataChart(5, 18, "Heating A"));
					listDataChart.add(new DataChart(15, 50, "Heating A"));
					ListDataChart lcd = new ListDataChart(listDataChart);
					listDataCharts.add(lcd);
				}
				
			}

			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(Arrays.asList(masterReport));
			Map<String, Object> map = new HashMap<>();
			JasperPrint jp = JasperFillManager.fillReport(source, map, dataSource);
			JasperViewer.viewReport(jp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
