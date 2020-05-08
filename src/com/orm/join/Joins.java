package com.orm.join;

abstract class Joins {
	protected String space=" ";
	protected String dot=".";
	protected String comma=",";
		abstract String getJoinString() ;
		abstract String getBaseTable() ;
		abstract String getJoinType() ;
		abstract String getNewTable() ;
}
