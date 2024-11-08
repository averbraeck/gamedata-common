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
import nl.gamedata.data.tables.records.MissionLogdataRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
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
public class MissionLogdata extends TableImpl<MissionLogdataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.mission_logdata</code>
     */
    public static final MissionLogdata MISSION_LOGDATA = new MissionLogdata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MissionLogdataRecord> getRecordType() {
        return MissionLogdataRecord.class;
    }

    /**
     * The column <code>gamedata.mission_logdata.id</code>.
     */
    public final TableField<MissionLogdataRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.mission_logdata.type</code>.
     */
    public final TableField<MissionLogdataRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.mission_logdata.key</code>.
     */
    public final TableField<MissionLogdataRecord, String> KEY = createField(DSL.name("key"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.mission_logdata.value</code>.
     */
    public final TableField<MissionLogdataRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>gamedata.mission_logdata.timestamp</code>.
     */
    public final TableField<MissionLogdataRecord, LocalDateTime> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>gamedata.mission_logdata.status</code>.
     */
    public final TableField<MissionLogdataRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(45).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>gamedata.mission_logdata.round</code>.
     */
    public final TableField<MissionLogdataRecord, String> ROUND = createField(DSL.name("round"), SQLDataType.VARCHAR(16).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>gamedata.mission_logdata.game_time</code>.
     */
    public final TableField<MissionLogdataRecord, String> GAME_TIME = createField(DSL.name("game_time"), SQLDataType.VARCHAR(45).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>gamedata.mission_logdata.gamesession_id</code>.
     */
    public final TableField<MissionLogdataRecord, Integer> GAMESESSION_ID = createField(DSL.name("gamesession_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private MissionLogdata(Name alias, Table<MissionLogdataRecord> aliased) {
        this(alias, aliased, null);
    }

    private MissionLogdata(Name alias, Table<MissionLogdataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.mission_logdata</code> table reference
     */
    public MissionLogdata(String alias) {
        this(DSL.name(alias), MISSION_LOGDATA);
    }

    /**
     * Create an aliased <code>gamedata.mission_logdata</code> table reference
     */
    public MissionLogdata(Name alias) {
        this(alias, MISSION_LOGDATA);
    }

    /**
     * Create a <code>gamedata.mission_logdata</code> table reference
     */
    public MissionLogdata() {
        this(DSL.name("mission_logdata"), null);
    }

    public <O extends Record> MissionLogdata(Table<O> child, ForeignKey<O, MissionLogdataRecord> key) {
        super(child, key, MISSION_LOGDATA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.MISSION_LOGDATA_FK_SESSIONLOGDATA_GAMESESSION1_IDX);
    }

    @Override
    public Identity<MissionLogdataRecord, Integer> getIdentity() {
        return (Identity<MissionLogdataRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<MissionLogdataRecord> getPrimaryKey() {
        return Keys.KEY_MISSION_LOGDATA_PRIMARY;
    }

    @Override
    public List<UniqueKey<MissionLogdataRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_MISSION_LOGDATA_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<MissionLogdataRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_SESSIONLOGDATA_GAMESESSION1);
    }

    private transient GameMission _gameMission;

    /**
     * Get the implicit join path to the <code>gamedata.game_mission</code>
     * table.
     */
    public GameMission gameMission() {
        if (_gameMission == null)
            _gameMission = new GameMission(this, Keys.FK_SESSIONLOGDATA_GAMESESSION1);

        return _gameMission;
    }

    @Override
    public MissionLogdata as(String alias) {
        return new MissionLogdata(DSL.name(alias), this);
    }

    @Override
    public MissionLogdata as(Name alias) {
        return new MissionLogdata(alias, this);
    }

    @Override
    public MissionLogdata as(Table<?> alias) {
        return new MissionLogdata(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public MissionLogdata rename(String name) {
        return new MissionLogdata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MissionLogdata rename(Name name) {
        return new MissionLogdata(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public MissionLogdata rename(Table<?> name) {
        return new MissionLogdata(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, LocalDateTime, String, String, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Integer, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Integer, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
