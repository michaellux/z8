package org.zenframework.z8.server.base.table.value;

import org.zenframework.z8.server.base.query.Query;
import org.zenframework.z8.server.types.sql.sql_bool;

public interface ILink extends IField {
	public Query.CLASS<? extends Query> query();
	public Query getQuery();

	public JoinType getJoinType();
	public void setJoinType(JoinType joinType);

	public sql_bool on();
}
