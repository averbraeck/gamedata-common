/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.gamedata.data.Gamedata;
import nl.gamedata.data.Indexes;
import nl.gamedata.data.Keys;
import nl.gamedata.data.tables.records.MissionEventRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function12;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row12;
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
public class MissionEvent extends TableImpl<MissionEventRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.mission_event</code>
     */
    public static final MissionEvent MISSION_EVENT = new MissionEvent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MissionEventRecord> getRecordType() {
        return MissionEventRecord.class;
    }

    /**
     * The column <code>gamedata.mission_event.id</code>.
     */
    public final TableField<MissionEventRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.mission_event.type</code>.
     */
    public final TableField<MissionEventRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(45).nullable(false).defaultValue(DSL.field(DSL.raw("'DEFAULT'"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>gamedata.mission_event.key</code>.
     */
    public final TableField<MissionEventRecord, String> KEY = createField(DSL.name("key"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.mission_event.value</code>.
     */
    public final TableField<MissionEventRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>gamedata.mission_event.timestamp</code>.
     */
    public final TableField<MissionEventRecord, LocalDateTime> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>gamedata.mission_event.status</code>.
     */
    public final TableField<MissionEventRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(45).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>gamedata.mission_event.round</code>.
     */
    public final TableField<MissionEventRecord, String> ROUND = createField(DSL.name("round"), SQLDataType.VARCHAR(16).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>gamedata.mission_event.game_time</code>.
     */
    public final TableField<MissionEventRecord, String> GAME_TIME = createField(DSL.name("game_time"), SQLDataType.VARCHAR(45).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>gamedata.mission_event.grouping_code</code>.
     */
    public final TableField<MissionEventRecord, String> GROUPING_CODE = createField(DSL.name("grouping_code"), SQLDataType.VARCHAR(45).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>gamedata.mission_event.facilitator_initiated</code>.
     */
    public final TableField<MissionEventRecord, Byte> FACILITATOR_INITIATED = createField(DSL.name("facilitator_initiated"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>gamedata.mission_event.game_session_id</code>.
     */
    public final TableField<MissionEventRecord, Integer> GAME_SESSION_ID = createField(DSL.name("game_session_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gamedata.mission_event.game_mission_id</code>.
     */
    public final TableField<MissionEventRecord, Integer> GAME_MISSION_ID = createField(DSL.name("game_mission_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private MissionEvent(Name alias, Table<MissionEventRecord> aliased) {
        this(alias, aliased, null);
    }

    private MissionEvent(Name alias, Table<MissionEventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.mission_event</code> table reference
     */
    public MissionEvent(String alias) {
        this(DSL.name(alias), MISSION_EVENT);
    }

    /**
     * Create an aliased <code>gamedata.mission_event</code> table reference
     */
    public MissionEvent(Name alias) {
        this(alias, MISSION_EVENT);
    }

    /**
     * Create a <code>gamedata.mission_event</code> table reference
     */
    public MissionEvent() {
        this(DSL.name("mission_event"), null);
    }

    public <O extends Record> MissionEvent(Table<O> child, ForeignKey<O, MissionEventRecord> key) {
        super(child, key, MISSION_EVENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.MISSION_EVENT_FK_MISSION_EVENT_GAME_MISSION1_IDX, Indexes.MISSION_EVENT_FK_MISSION_EVENT_GAME_SESSION1_IDX);
    }

    @Override
    public Identity<MissionEventRecord, Integer> getIdentity() {
        return (Identity<MissionEventRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MissionEventRecord> getPrimaryKey() {
        return Keys.KEY_MISSION_EVENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<MissionEventRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_MISSION_EVENT_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<MissionEventRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_MISSION_EVENT_GAME_SESSION1, Keys.FK_MISSION_EVENT_GAME_MISSION1);
    }

    private transient GameSession _gameSession;
    private transient GameMission _gameMission;

    /**
     * Get the implicit join path to the <code>gamedata.game_session</code>
     * table.
     */
    public GameSession gameSession() {
        if (_gameSession == null)
            _gameSession = new GameSession(this, Keys.FK_MISSION_EVENT_GAME_SESSION1);

        return _gameSession;
    }

    /**
     * Get the implicit join path to the <code>gamedata.game_mission</code>
     * table.
     */
    public GameMission gameMission() {
        if (_gameMission == null)
            _gameMission = new GameMission(this, Keys.FK_MISSION_EVENT_GAME_MISSION1);

        return _gameMission;
    }

    @Override
    public MissionEvent as(String alias) {
        return new MissionEvent(DSL.name(alias), this);
    }

    @Override
    public MissionEvent as(Name alias) {
        return new MissionEvent(alias, this);
    }

    @Override
    public MissionEvent as(Table<?> alias) {
        return new MissionEvent(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MissionEvent rename(String name) {
        return new MissionEvent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MissionEvent rename(Name name) {
        return new MissionEvent(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MissionEvent rename(Table<?> name) {
        return new MissionEvent(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, LocalDateTime, String, String, String, String, Byte, Integer, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super Integer, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super String, ? super String, ? super String, ? super Byte, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super Integer, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super String, ? super String, ? super String, ? super Byte, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
