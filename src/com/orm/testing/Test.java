package com.orm.testing;

import com.orm.join.FullJoin;
import com.orm.join.InnerJoin;
import com.orm.join.Join;
import com.orm.join.LeftJoin;
import com.orm.join.RightJoin;
import com.orm.select.SelectQuery;

public class Test {
	public static void main(String args[]) {
		SelectQuery query = new SelectQuery("aaalogin");
		query.addColumn("*");
		query.addColumn("Test","dummy");
		Join jj = new Join("aaalogin");
		try {
			jj.add(new InnerJoin("aaalogin", "test2", "col1", "col2"));
			jj.add(new FullJoin("test2", "test3", "col3", "col4"));
			jj.add(new LeftJoin("test3", "test4", "col3", "col4"));
			jj.add(new RightJoin("test4", "test5", "col3", "col4"));

			query.addJoin(jj);
			System.out.println(query.toString());
			System.out.println(jj.getJoinsList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
