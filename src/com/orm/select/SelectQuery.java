package com.orm.select;

import java.util.ArrayList;

import com.orm.connector.SqlConnector;
import com.orm.join.Join;

public class SelectQuery {
	private String tabel_name;
	private ArrayList<String> sel_cols=new ArrayList<>();
	private Join join=null;
	public SelectQuery(String table_name){
		if("".equals(table_name)||table_name==null)
			throw new NullPointerException("Table Name is Empty");
		this.tabel_name=table_name;
	}
	
	public void addColumn(String columnName) {
		sel_cols.add(this.tabel_name+"."+columnName);
	}
	public void addColumn(String tablename,String columnName) {
		sel_cols.add(tablename+"."+columnName);
	}
	private String get_selectcolumns() {
		StringBuilder cols= new StringBuilder();
		if(sel_cols.isEmpty()) {
			return "*";
		}
		for(String col : sel_cols) {
			cols.append(col+",");
		}
		return cols.deleteCharAt(cols.length()-1).toString();
	}
	public void addJoin(Join obj) throws Exception{
		if(!obj.name().equalsIgnoreCase(tabel_name)) {
			throw new IllegalAccessError("The Join and Select query have different base tables");
		}
		join=obj;
	}
	private String get_join_str() {
		if(join!=null) {
			return join.toString();
		}
		return "";
	}
	private String getQueryString() {
		return "select "+get_selectcolumns() + " from " + this.tabel_name +" "+get_join_str()+";";
	}
	public String toString() {
		return getQueryString();
	}
}
