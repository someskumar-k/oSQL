package com.orm.join;

import java.util.ArrayList;

public class Join{
	private String base_table="";
	private ArrayList<String> tables=new ArrayList<String>();
	private ArrayList<String> joins=new ArrayList<String>();

	public Join(String tablename) {
		this.base_table=tablename;
		tables.add(tablename);
	}
	public void add(Joins obj) throws Exception{
		build_join(obj);
	}
	private boolean check_table(Joins join) {
		if(!this.tables.contains(join.getBaseTable())) {
			throw new IllegalArgumentException("Base table must be contained in object");
		}
		if(this.tables.contains(join.getNewTable())) {
			throw new IllegalArgumentException("Depended table \""+join.getNewTable()+"\" is already defined object");
		}
		return true;
	}
	private void build_join(Joins obj) throws Exception{
		if(check_table(obj)) {
			tables.add(obj.getNewTable());
			joins.add(obj.getJoinString());	
		}
		
	}
	public String name() {
		return base_table;
	}
	public ArrayList<String> getJoinsList(){
		return this.joins;
	}
	public String toString() {
		return getJoinString();
	}
	private String getJoinString() {
		String k = "";
		for(String join : joins) {
			k+=join;
		}
		return k;
	}

}
