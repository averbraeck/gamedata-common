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
    public final TableField<MissionEventRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.mission_event.value</code>.
     */
    public final TableField<MissionEventRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.VARCHAR(255).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>gamedata.mission_event.timestamp</code>.
     */
    public final TableField<MissionEventRecord, LocalDateTime> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>gamedata.mission_event.gamesession_id</code>.
     */
    public final TableField<MissionEventRecord, Integer> GAMESESSION_ID = createField(DSL.name("gamesession_id"), SQLDataType.INTEGER.nullable(false), this, "");

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
        return Arrays.asList(Indexes.MISSION_EVENT_FK_SESSIONEVENT_GAMESESSION1_IDX);
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
        return Arrays.asList(Keys.FK_SESSIONEVENT_GAMESESSION1);
    }

    private transient GameMission _gameMission;

    /**
     * Get the implicit join path to the <code>gamedata.game_mission</code>
     * table.
     */
    public GameMission gameMission() {
        if (_gameMission == null)
            _gameMission = new GameMission(this, Keys.FK_SESSIONEVENT_GAMESESSION1);

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
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, LocalDateTime, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Integer, ? super String, ? super String, ? super LocalDateTime, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Integer, ? super String, ? super String, ? super LocalDateTime, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
