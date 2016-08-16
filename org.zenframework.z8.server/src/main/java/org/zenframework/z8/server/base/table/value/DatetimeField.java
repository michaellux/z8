package org.zenframework.z8.server.base.table.value;

import org.zenframework.z8.server.db.DatabaseVendor;
import org.zenframework.z8.server.db.FieldType;
import org.zenframework.z8.server.db.sql.SqlField;
import org.zenframework.z8.server.engine.ApplicationServer;
import org.zenframework.z8.server.format.Format;
import org.zenframework.z8.server.runtime.IObject;
import org.zenframework.z8.server.types.bool;
import org.zenframework.z8.server.types.datetime;
import org.zenframework.z8.server.types.primary;
import org.zenframework.z8.server.types.string;
import org.zenframework.z8.server.types.sql.sql_datetime;

public class DatetimeField extends Field {
	public static class CLASS<T extends DatetimeField> extends Field.CLASS<T> {
		public CLASS(IObject container) {
			super(container);
			setJavaClass(DatetimeField.class);
			setAttribute("native", DatetimeField.class.getCanonicalName());
		}

		@Override
		public Object newObject(IObject container) {
			return new DatetimeField(container);
		}
	}

	public DatetimeField(IObject container) {
		super(container);
		setDefault(datetime.MIN);
		aggregation = Aggregation.Max;
		format = new string(Format.datetime);
		stretch = new bool(false);
	}

	public datetime z8_getDefault() {
		return (datetime)super.getDefault();
	}

	@Override
	public primary getDefault() {
		return ApplicationServer.events() ? z8_getDefault() : super.getDefault();
	}

	@Override
	public FieldType type() {
		return FieldType.Datetime;
	}

	@Override
	public String sqlType(DatabaseVendor vendor) {
		return type().vendorType(vendor);
	}

	public sql_datetime sql_datetime() {
		return new sql_datetime(new SqlField(this));
	}

	@Override
	public primary get() {
		return z8_get();
	}

	public datetime z8_get() {
		return (datetime)internalGet();
	}

	public DatetimeField.CLASS<? extends DatetimeField> operatorAssign(datetime value) {
		set(value);
		return (DatetimeField.CLASS<?>)this.getCLASS();
	}
}
