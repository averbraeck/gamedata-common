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
import nl.gamedata.data.tables.records.DashboardSettingRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
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
public class DashboardSetting extends TableImpl<DashboardSettingRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.dashboard_setting</code>
     */
    public static final DashboardSetting DASHBOARD_SETTING = new DashboardSetting();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DashboardSettingRecord> getRecordType() {
        return DashboardSettingRecord.class;
    }

    /**
     * The column <code>gamedata.dashboard_setting.id</code>.
     */
    public final TableField<DashboardSettingRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.dashboard_setting.key</code>.
     */
    public final TableField<DashboardSettingRecord, String> KEY = createField(DSL.name("key"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.dashboard_setting.value</code>.
     */
    public final TableField<DashboardSettingRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.dashboard_setting.game_id</code>.
     */
    public final TableField<DashboardSettingRecord, Integer> GAME_ID = createField(DSL.name("game_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private DashboardSetting(Name alias, Table<DashboardSettingRecord> aliased) {
        this(alias, aliased, null);
    }

    private DashboardSetting(Name alias, Table<DashboardSettingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.dashboard_setting</code> table reference
     */
    public DashboardSetting(String alias) {
        this(DSL.name(alias), DASHBOARD_SETTING);
    }

    /**
     * Create an aliased <code>gamedata.dashboard_setting</code> table reference
     */
    public DashboardSetting(Name alias) {
        this(alias, DASHBOARD_SETTING);
    }

    /**
     * Create a <code>gamedata.dashboard_setting</code> table reference
     */
    public DashboardSetting() {
        this(DSL.name("dashboard_setting"), null);
    }

    public <O extends Record> DashboardSetting(Table<O> child, ForeignKey<O, DashboardSettingRecord> key) {
        super(child, key, DASHBOARD_SETTING);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.DASHBOARD_SETTING_FK_DASHBOARD_GAME1_IDX);
    }

    @Override
    public Identity<DashboardSettingRecord, Integer> getIdentity() {
        return (Identity<DashboardSettingRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<DashboardSettingRecord> getPrimaryKey() {
        return Keys.KEY_DASHBOARD_SETTING_PRIMARY;
    }

    @Override
    public List<UniqueKey<DashboardSettingRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_DASHBOARD_SETTING_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<DashboardSettingRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_DASHBOARD_GAME1);
    }

    private transient Game _game;

    /**
     * Get the implicit join path to the <code>gamedata.game</code> table.
     */
    public Game game() {
        if (_game == null)
            _game = new Game(this, Keys.FK_DASHBOARD_GAME1);

        return _game;
    }

    @Override
    public DashboardSetting as(String alias) {
        return new DashboardSetting(DSL.name(alias), this);
    }

    @Override
    public DashboardSetting as(Name alias) {
        return new DashboardSetting(alias, this);
    }

    @Override
    public DashboardSetting as(Table<?> alias) {
        return new DashboardSetting(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public DashboardSetting rename(String name) {
        return new DashboardSetting(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DashboardSetting rename(Name name) {
        return new DashboardSetting(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public DashboardSetting rename(Table<?> name) {
        return new DashboardSetting(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}