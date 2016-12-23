package com.preciso.reports;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.preciso.model.AddCustomerSales;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.component.Components;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.exception.DRException;

public class CustomerReport {
public CustomerReport(List<AddCustomerSales> list)
{
	JasperReportBuilder report = DynamicReports.report();//a new report
	report
	  .columns(
			  Columns.column("Customer Id", "id", DataTypes.integerType())
			  .setHorizontalAlignment(HorizontalAlignment.LEFT),
			  Columns.column("Customer name","name",DataTypes.stringType())
			  .setHorizontalAlignment(HorizontalAlignment.LEFT),
			  Columns.column("Customer email","email_id",DataTypes.stringType())
			  .setHorizontalAlignment(HorizontalAlignment.LEFT),
			  Columns.column("Customer phone","phone_no",DataTypes.longType())
			  .setHorizontalAlignment(HorizontalAlignment.LEFT),
			  Columns.column("CreateBy","created_by",DataTypes.stringType())
			  .setHorizontalAlignment(HorizontalAlignment.LEFT)
	  	)
	  .title(//title of the report
	  	Components.text("CustomerReport")
	  		.setHorizontalAlignment(HorizontalAlignment.CENTER))
	  .pageFooter(Components.pageXofY())//show page number on the page footer
	  .setDataSource(list);

	try {
		report.show(false);//show the report
		report.toPdf(new FileOutputStream("D:\\report.pdf"));//export the report to a pdf file
	} catch (DRException e) {
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
}
