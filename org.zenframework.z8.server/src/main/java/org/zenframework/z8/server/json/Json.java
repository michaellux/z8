package org.zenframework.z8.server.json;

import org.zenframework.z8.server.types.string;

public interface Json {
	static public string eventId = new string("eventId");

	static public string id = new string("id");
	static public string index = new string("index");
	static public string instanceId = new string("instanceId");

	static public string request = new string("request");
	static public string response = new string("response");
	static public string session = new string("session");
	static public string sessionId = new string("sessionId");
	static public string serverId = new string("serverId");
	static public string service = new string("service");
	static public string retry = new string("retry");
	static public string ip = new string("ip");

	static public string upload = new string("upload");

	static public string user = new string("user");
	static public string name = new string("name");
	static public string displayName = new string("displayName");
	static public string login = new string("login");
	static public string password = new string("password");
	static public string newPassword = new string("newPassword");
	static public string rememberMe = new string("rememberMe");
	static public string email = new string("email");
	static public string phone = new string("phone");

	string menu = new string("menu");
	string components = new string("components");
	string settings = new string("settings");

	string isQuery = new string("isQuery");
	string isJob = new string("isJob");
	string isSection = new string("isSection");
	string isFieldset = new string("isFieldset");

	string info = new string("info");
	string messages = new string("messages");
	string get = new string("get");
	string send = new string("send");
	string users = new string("users");
	string recipient = new string("recipient");
	string sender = new string("sender");

	string requestId = new string("requestId");
	string requestUrl = new string("requestUrl");
	string formToOpen = new string("formToOpen");
	string formId = new string("formId");
	string message = new string("message");
	string success = new string("success");
	string status = new string("status");

	string serverType = new string("serverType");
	string aggregation = new string("aggregation");
	string readOnly = new string("readOnly");
	string writeAccess = new string("writeAccess");
	string deleteAccess = new string("deleteAccess");
	string importAccess = new string("importAccess");

	string visible = new string("visible");
	string hidden = new string("hidden");
	string hidable = new string("hidable");
	string formula = new string("formula");
	string evaluations = new string("evaluations");
	string dependencies = new string("dependencies");
	string width = new string("width");
	string height = new string("height");
	string length = new string("length");
	string size = new string("size");
	string lines = new string("lines");
	string stretch = new string("stretch");
	string priority = new string("priority");
	string required = new string("required");
	string period = new string("period");
	string min = new string("min");
	string max = new string("max");

	string row = new string("row");
	string column = new string("column");
	string items = new string("items");

	string columnWidth = new string("columnWidth");
	string labelWidth = new string("labelWidth");

	string link = new string("link");
	string editWith = new string("editWith");
	string editWithText = new string("editWithText");

	string grid = new string("grid");
	string tree = new string("tree");
	string parentsSelectable = new string("parentsSelectable");

	string key = new string("key");
	string field = new string("field");
	string value = new string("value");
	string type = new string("type");
	string query = new string("query");
	string table = new string("table");

	string external = new string("external");
	string internal = new string("internal");

	string queryId = new string("queryId");
	string groupId = new string("groupId");
	string fieldId = new string("fieldId");
	string linkId = new string("linkId");
	string recordId = new string("recordId");
	string parentId = new string("parentId");
	string linked = new string("linked");
	string linkedVia = new string("linkedVia");
	string depth = new string("depth");
	string anchor = new string("anchor");
	string anchorPolicy = new string("anchorPolicy");
	string ids = new string("ids");

	string property = new string("property");
	string record = new string("record");
	string sort = new string("sort");
	string group = new string("group");
	string direction = new string("direction");
	string lookupFields = new string("lookupFields");
	string lookup = new string("lookup");

	string filter = new string("filter");
	string operator = new string("operator");

	string filter1 = new string("filter1");
	string comparison = new string("comparison");
	string andOr = new string("andOr");

	string __search_text__ = new string("__search_text__");

	/* Ext 3.1 values */
	string groupBy = new string("groupBy");
	string totalsBy = new string("totalsBy");
	string dir = new string("dir");
	string groupDir = new string("groupDir");
	string groupValue = new string("groupValue");
	string groups = new string("groups");
	string remoteSort = new string("remoteSort");
	/* Ext 3.1 values */

	string filterBy = new string("filterBy");

	string primaryKey = new string("primaryKey");
	string parentKey = new string("parentKey");
	string children = new string("children");
	string lockKey = new string("lockKey");
	string attachments = new string("attachments");

	string action = new string("xaction");
	string data = new string("data");
	string summaryData = new string("summaryData");
	string totalsData = new string("totalsData");
	string command = new string("command");
	string attach = new string("attach");

	string format = new string("format");
	string report = new string("report");
	string options = new string("options");

	string pageFormat = new string("pageFormat");
	string pageOrientation = new string("pageOrientation");

	string leftMargin = new string("leftMargin");
	string rightMargin = new string("rightMargin");
	string topMargin = new string("topMargin");
	string bottomMargin = new string("bottomMargin");

	string total = new string("total");
	string start = new string("start");
	string finish = new string("finish");
	string limit = new string("limit");
	string count = new string("count");

	string log = new string("log");
	string file = new string("file");
	string path = new string("path");
	string files = new string("files");
	string source = new string("source");
	string target = new string("target");
	string image = new string("image");
	string time = new string("time");
	string details = new string("details");

	string refresh = new string("refresh");
	string queries = new string("queries");
	string records = new string("records");

	string fields = new string("fields");
	string sections = new string("sections");
	string controls = new string("controls");
	string actions = new string("actions");
	string columns = new string("columns");
	string backwards = new string("backwards");
	string commands = new string("commands");
	string parameters = new string("parameters");
	string reports = new string("reports");
	string collapseGroups = new string("collapseGroups");
	string showTotals = new string("showTotals");
	string viewMode = new string("viewMode");
	string fieldsToShow = new string("fieldsToShow");

	string chartType = new string("chartType");
	string chartSeries = new string("chartSeries");

	string style = new string("style");
	string color = new string("color");
	string background = new string("background");
	string bold = new string("bold");

	string jobId = new string("jobId");
	string done = new string("done");
	string totalWork = new string("totalWork");
	string worked = new string("worked");
	string feedback = new string("feedback");
	string scheduled = new string("scheduled");

	string text = new string("text");
	string description = new string("description");
	string label = new string("label");
	string header = new string("header");
	string colspan = new string("colspan");
	string rowspan = new string("rowspan");
	string showLabel = new string("showLabel");
	string icon = new string("icon");
	string help = new string("help");

	string expanded = new string("expanded");
	string loaded = new string("loaded");
	string leaf = new string("leaf");

	string save = new string("save");
	string update = new string("update");
	string create = new string("create");
	string destroy = new string("destroy");

	string experimental = new string("experimental");
}
