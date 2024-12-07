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
import nl.gamedata.data.tables.records.PrivateDashboardRecord;

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
public class PrivateDashboard extends TableImpl<PrivateDashboardRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.private_dashboard</code>
     */
    public static final PrivateDashboard PRIVATE_DASHBOARD = new PrivateDashboard();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PrivateDashboardRecord> getRecordType() {
        return PrivateDashboardRecord.class;
    }

    /**
     * The column <code>gamedata.private_dashboard.id</code>.
     */
    public final TableField<PrivateDashboardRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.private_dashboard.key</code>.
     */
    public final TableField<PrivateDashboardRecord, String> KEY = createField(DSL.name("key"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.private_dashboard.value</code>.
     */
    public final TableField<PrivateDashboardRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>gamedata.private_dashboard.game_mission_id</code>.
     */
    public final TableField<PrivateDashboardRecord, Integer> GAME_MISSION_ID = createField(DSL.name("game_mission_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gamedata.private_dashboard.game_access_id</code>.
     */
    public final TableField<PrivateDashboardRecord, Integer> GAME_ACCESS_ID = createField(DSL.name("game_access_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private PrivateDashboard(Name alias, Table<PrivateDashboardRecord> aliased) {
        this(alias, aliased, null);
    }

    private PrivateDashboard(Name alias, Table<PrivateDashboardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.private_dashboard</code> table reference
     */
    public PrivateDashboard(String alias) {
        this(DSL.name(alias), PRIVATE_DASHBOARD);
    }

    /**
     * Create an aliased <code>gamedata.private_dashboard</code> table reference
     */
    public PrivateDashboard(Name alias) {
        this(alias, PRIVATE_DASHBOARD);
    }

    /**
     * Create a <code>gamedata.private_dashboard</code> table reference
     */
    public PrivateDashboard() {
        this(DSL.name("private_dashboard"), null);
    }

    public <O extends Record> PrivateDashboard(Table<O> child, ForeignKey<O, PrivateDashboardRecord> key) {
        super(child, key, PRIVATE_DASHBOARD);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PRIVATE_DASHBOARD_FK_PRIVATE_DASHBOARD_GAME_ACCESS1_IDX, Indexes.PRIVATE_DASHBOARD_FK_PRIVATE_DASHBOARD_GAME_MISSION1_IDX);
    }

    @Override
    public Identity<PrivateDashboardRecord, Integer> getIdentity() {
        return (Identity<PrivateDashboardRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<PrivateDashboardRecord> getPrimaryKey() {
        return Keys.KEY_PRIVATE_DASHBOARD_PRIMARY;
    }

    @Override
    public List<UniqueKey<PrivateDashboardRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_PRIVATE_DASHBOARD_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<PrivateDashboardRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_PRIVATE_DASHBOARD_GAME_MISSION1, Keys.FK_PRIVATE_DASHBOARD_GAME_ACCESS1);
    }

    private transient GameMission _gameMission;
    private transient GameAccess _gameAccess;

    /**
     * Get the implicit join path to the <code>gamedata.game_mission</code>
     * table.
     */
    public GameMission gameMission() {
        if (_gameMission == null)
            _gameMission = new GameMission(this, Keys.FK_PRIVATE_DASHBOARD_GAME_MISSION1);

        return _gameMission;
    }

    /**
     * Get the implicit join path to the <code>gamedata.game_access</code>
     * table.
     */
    public GameAccess gameAccess() {
        if (_gameAccess == null)
            _gameAccess = new GameAccess(this, Keys.FK_PRIVATE_DASHBOARD_GAME_ACCESS1);

        return _gameAccess;
    }

    @Override
    public PrivateDashboard as(String alias) {
        return new PrivateDashboard(DSL.name(alias), this);
    }

    @Override
    public PrivateDashboard as(Name alias) {
        return new PrivateDashboard(alias, this);
    }

    @Override
    public PrivateDashboard as(Table<?> alias) {
        return new PrivateDashboard(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PrivateDashboard rename(String name) {
        return new PrivateDashboard(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PrivateDashboard rename(Name name) {
        return new PrivateDashboard(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PrivateDashboard rename(Table<?> name) {
        return new PrivateDashboard(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Integer, ? super String, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Integer, ? super String, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
