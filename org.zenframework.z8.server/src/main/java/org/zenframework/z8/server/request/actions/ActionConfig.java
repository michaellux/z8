package org.zenframework.z8.server.request.actions;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.zenframework.z8.server.base.query.Query;
import org.zenframework.z8.server.base.table.value.Field;
import org.zenframework.z8.server.base.table.value.ILink;
import org.zenframework.z8.server.json.Json;
import org.zenframework.z8.server.types.bool;
import org.zenframework.z8.server.types.guid;
import org.zenframework.z8.server.types.string;

public class ActionConfig {
	public String requestId;

	public Query contextQuery;

	public Query query;
	public Collection<Field> fields;
	public Collection<Field> sortFields;
	public Collection<Field> groupFields;
	public Collection<Field> groupBy;
	public Collection<guid> recordIds = null;

	private Map<string, string> requestParameters = new HashMap<string, string>();

	public ILink link;

	public ActionConfig() {
	}

	public ActionConfig(Map<string, string> requestParameters) {
		this.requestParameters = requestParameters;
		guid recordId = getRecordId();
		this.recordIds = recordId != null ? Arrays.asList(recordId) : null;
	}

	public ActionConfig(Query query) {
		this.query = contextQuery = query;
	}

	public ActionConfig(Query query, Collection<Field> fields) {
		this(query, fields, null);
	}

	public ActionConfig(Query query, Collection<Field> fields, Collection<guid> recordIds) {
		this(query);
		this.fields = fields;
		this.recordIds = recordIds;
	}

	public Map<string, string> requestParameters() {
		return requestParameters;
	}

	public String requestParameter(string key) {
		string value = requestParameters.get(key);
		return value != null ? value.get() : null;
	}

	public guid getRecordId() {
		String recordId = requestParameter(Json.recordId);
		return recordId != null ? new guid(recordId) : null;
	}

	public guid getGuid(string key) {
		return new guid(requestParameter(key));
	}

	public boolean getBoolean(string key) {
		return new bool(requestParameter(key)).get();
	}
}
