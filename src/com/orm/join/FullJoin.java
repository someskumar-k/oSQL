package com.orm.join;


public class FullJoin extends Joins{
	 protected Hidden hid = null;
	public FullJoin(String basetable, String newtable, String basecolum, String newcolumn) {
		hid = new Hidden(basetable, newtable, basecolum, newcolumn);
	}
	protected String getJoinString() {
			return hid.getJoinString();
		}
	protected String getBaseTable() {
			return hid.getBaseTable();
		}
	protected String getJoinType() {
			return hid.getJoinType();
		}
	protected String getNewTable() {
		return hid.getNewTable();
	}
	class Hidden{
		private static final String type=" FULL JOIN";
		 String newTable="";
		 String basecolumn="";
		 String newcolumn="";
		 String baseTable="";
		private Hidden(String basetable, String newtable, String basecolum, String newcolumn) {
			this.baseTable=basetable;
			this.newTable=newtable;
			this.basecolumn=basecolum;
			this.newcolumn=newcolumn;
		}
		private String getJoinString() {
				return type+space+newTable+space+"ON"+space+baseTable+"."+basecolumn+" = "+newTable+"."+newcolumn;
			}
		private String getBaseTable() {
				return baseTable;
			}
		private String getJoinType() {
				return type;
			}
		private String getNewTable() {
			return newTable;
		}
	}
}
