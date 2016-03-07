package com.mirzaakhena.belajar;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MasterReport {

	private String recipeName;
	private String batchName;
	private String batchNo;
	private String tank;
	private String quantity;
	private String date;
	private String operatorName;
	private String totalDuration;
	
	private List<DataTable> dataTables;
	private List<ListDataChart> listOfDataCharts;
	
}
