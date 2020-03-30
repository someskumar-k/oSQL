package com.orm.join;

abstract class Joins {
	protected String space=" ";
		abstract String getJoinString() ;
		abstract String getBaseTable() ;
		abstract String getJoinType() ;
		abstract String getNewTable() ;
}
