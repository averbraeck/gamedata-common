/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.gamedata.data.Gamedata;
import nl.gamedata.data.Indexes;
import nl.gamedata.data.Keys;
import nl.gamedata.data.tables.records.DashboardRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dashboard extends TableImpl<DashboardRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.dashboard</code>
     */
    public static final Dashboard DASHBOARD = new Dashboard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DashboardRecord> getRecordType() {
        return DashboardRecord.class;
    }

    /**
     * The column <code>gamedata.dashboard.id</code>.
     */
    public final TableField<DashboardRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.dashboard.name</code>.
     */
    public final TableField<DashboardRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.dashboard.description</code>.
     */
    public final TableField<DashboardRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>gamedata.dashboard.query</code>.
     */
    public final TableField<DashboardRecord, String> QUERY = createField(DSL.name("query"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>gamedata.dashboard.dashboard_template_id</code>.
     */
    public final TableField<DashboardRecord, Integer> DASHBOARD_TEMPLATE_ID = createField(DSL.name("dashboard_template_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private Dashboard(Name alias, Table<DashboardRecord> aliased) {
        this(alias, aliased, null);
    }

    private Dashboard(Name alias, Table<DashboardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.dashboard</code> table reference
     */
    public Dashboard(String alias) {
        this(DSL.name(alias), DASHBOARD);
    }

    /**
     * Create an aliased <code>gamedata.dashboard</code> table reference
     */
    public Dashboard(Name alias) {
        this(alias, DASHBOARD);
    }

    /**
     * Create a <code>gamedata.dashboard</code> table reference
     */
    public Dashboard() {
        this(DSL.name("dashboard"), null);
    }

    public <O extends Record> Dashboard(Table<O> child, ForeignKey<O, DashboardRecord> key) {
        super(child, key, DASHBOARD);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.DASHBOARD_FK_DASHBOARD_DASHBOARD_TEMPLATE1_IDX);
    }

    @Override
    public Identity<DashboardRecord, Integer> getIdentity() {
        return (Identity<DashboardRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<DashboardRecord> getPrimaryKey() {
        return Keys.KEY_DASHBOARD_PRIMARY;
    }

    @Override
    public List<UniqueKey<DashboardRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_DASHBOARD_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<DashboardRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_DASHBOARD_DASHBOARD_TEMPLATE1);
    }

    private transient DashboardTemplate _dashboardTemplate;

    /**
     * Get the implicit join path to the
     * <code>gamedata.dashboard_template</code> table.
     */
    public DashboardTemplate dashboardTemplate() {
        if (_dashboardTemplate == null)
            _dashboardTemplate = new DashboardTemplate(this, Keys.FK_DASHBOARD_DASHBOARD_TEMPLATE1);

        return _dashboardTemplate;
    }

    @Override
    public Dashboard as(String alias) {
        return new Dashboard(DSL.name(alias), this);
    }

    @Override
    public Dashboard as(Name alias) {
        return new Dashboard(alias, this);
    }

    @Override
    public Dashboard as(Table<?> alias) {
        return new Dashboard(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Dashboard rename(String name) {
        return new Dashboard(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dashboard rename(Name name) {
        return new Dashboard(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dashboard rename(Table<?> name) {
        return new Dashboard(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Integer, ? super String, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
