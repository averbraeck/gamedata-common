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
import nl.gamedata.data.tables.records.DashboardSessionRecord;

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
public class DashboardSession extends TableImpl<DashboardSessionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.dashboard_session</code>
     */
    public static final DashboardSession DASHBOARD_SESSION = new DashboardSession();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DashboardSessionRecord> getRecordType() {
        return DashboardSessionRecord.class;
    }

    /**
     * The column <code>gamedata.dashboard_session.id</code>.
     */
    public final TableField<DashboardSessionRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.dashboard_session.name</code>.
     */
    public final TableField<DashboardSessionRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.dashboard_session.dashboard_id</code>.
     */
    public final TableField<DashboardSessionRecord, Integer> DASHBOARD_ID = createField(DSL.name("dashboard_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gamedata.dashboard_session.game_session_id</code>.
     */
    public final TableField<DashboardSessionRecord, Integer> GAME_SESSION_ID = createField(DSL.name("game_session_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private DashboardSession(Name alias, Table<DashboardSessionRecord> aliased) {
        this(alias, aliased, null);
    }

    private DashboardSession(Name alias, Table<DashboardSessionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.dashboard_session</code> table reference
     */
    public DashboardSession(String alias) {
        this(DSL.name(alias), DASHBOARD_SESSION);
    }

    /**
     * Create an aliased <code>gamedata.dashboard_session</code> table reference
     */
    public DashboardSession(Name alias) {
        this(alias, DASHBOARD_SESSION);
    }

    /**
     * Create a <code>gamedata.dashboard_session</code> table reference
     */
    public DashboardSession() {
        this(DSL.name("dashboard_session"), null);
    }

    public <O extends Record> DashboardSession(Table<O> child, ForeignKey<O, DashboardSessionRecord> key) {
        super(child, key, DASHBOARD_SESSION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.DASHBOARD_SESSION_FK_DASHBOARD_SESSION_DASHBOARD1_IDX, Indexes.DASHBOARD_SESSION_FK_DASHBOARD_SESSION_GAME_SESSION1_IDX);
    }

    @Override
    public Identity<DashboardSessionRecord, Integer> getIdentity() {
        return (Identity<DashboardSessionRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<DashboardSessionRecord> getPrimaryKey() {
        return Keys.KEY_DASHBOARD_SESSION_PRIMARY;
    }

    @Override
    public List<UniqueKey<DashboardSessionRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_DASHBOARD_SESSION_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<DashboardSessionRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_DASHBOARD_SESSION_DASHBOARD1, Keys.FK_DASHBOARD_SESSION_GAME_SESSION1);
    }

    private transient Dashboard _dashboard;
    private transient GameSession _gameSession;

    /**
     * Get the implicit join path to the <code>gamedata.dashboard</code> table.
     */
    public Dashboard dashboard() {
        if (_dashboard == null)
            _dashboard = new Dashboard(this, Keys.FK_DASHBOARD_SESSION_DASHBOARD1);

        return _dashboard;
    }

    /**
     * Get the implicit join path to the <code>gamedata.game_session</code>
     * table.
     */
    public GameSession gameSession() {
        if (_gameSession == null)
            _gameSession = new GameSession(this, Keys.FK_DASHBOARD_SESSION_GAME_SESSION1);

        return _gameSession;
    }

    @Override
    public DashboardSession as(String alias) {
        return new DashboardSession(DSL.name(alias), this);
    }

    @Override
    public DashboardSession as(Name alias) {
        return new DashboardSession(alias, this);
    }

    @Override
    public DashboardSession as(Table<?> alias) {
        return new DashboardSession(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public DashboardSession rename(String name) {
        return new DashboardSession(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DashboardSession rename(Name name) {
        return new DashboardSession(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public DashboardSession rename(Table<?> name) {
        return new DashboardSession(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
