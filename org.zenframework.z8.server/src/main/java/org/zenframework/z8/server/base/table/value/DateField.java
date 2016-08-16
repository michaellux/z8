package org.zenframework.z8.server.base.table.value;

import org.zenframework.z8.server.db.DatabaseVendor;
import org.zenframework.z8.server.db.FieldType;
import org.zenframework.z8.server.db.sql.SqlField;
import org.zenframework.z8.server.engine.ApplicationServer;
import org.zenframework.z8.server.format.Format;
import org.zenframework.z8.server.runtime.IObject;
import org.zenframework.z8.server.types.bool;
import org.zenframework.z8.server.types.date;
import org.zenframework.z8.server.types.primary;
import org.zenframework.z8.server.types.string;
import org.zenframework.z8.server.types.sql.sql_date;

public class DateField extends Field {
	public static class CLASS<T extends DateField> extends Field.CLASS<T> {
		public CLASS(IObject container) {
			super(container);
			setJavaClass(DateField.class);
		}

		@Override
		public Object newObject(IObject container) {
			return new DateField(container);
		}
	}

	public DateField(IObject container) {
		super(container);
		setDefault(date.MIN);
		aggregation = Aggregation.Max;
		format = new string(Format.date);
		stretch = new bool(false);
	}

	public date z8_getDefault() {
		return (date)super.getDefault();
	}

	@Override
	public primary getDefault() {
		return ApplicationServer.events() ? z8_getDefault() : super.getDefault();
	}

	@Override
	public FieldType type() {
		return FieldType.Date;
	}

	@Override
	public String sqlType(DatabaseVendor vendor) {
		return type().vendorType(vendor);
	}

	public sql_date sql_date() {
		return new sql_date(new SqlField(this));
	}

	@Override
	public primary get() {
		return z8_get();
	}

	public date z8_get() {
		return (date)internalGet();
	}

	public DateField.CLASS<? extends DateField> operatorAssign(date value) {
		set(value);
		return (DateField.CLASS<?>)this.getCLASS();
	}
}
