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
import nl.gamedata.data.tables.records.GroupAttemptRecord;

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
public class GroupAttempt extends TableImpl<GroupAttemptRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.group_attempt</code>
     */
    public static final GroupAttempt GROUP_ATTEMPT = new GroupAttempt();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupAttemptRecord> getRecordType() {
        return GroupAttemptRecord.class;
    }

    /**
     * The column <code>gamedata.group_attempt.id</code>.
     */
    public final TableField<GroupAttemptRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.group_attempt.attempt_nr</code>.
     */
    public final TableField<GroupAttemptRecord, Integer> ATTEMPT_NR = createField(DSL.name("attempt_nr"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gamedata.group_attempt.status</code>.
     */
    public final TableField<GroupAttemptRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.group_attempt.group_id</code>.
     */
    public final TableField<GroupAttemptRecord, Integer> GROUP_ID = createField(DSL.name("group_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gamedata.group_attempt.game_mission_id</code>.
     */
    public final TableField<GroupAttemptRecord, Integer> GAME_MISSION_ID = createField(DSL.name("game_mission_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private GroupAttempt(Name alias, Table<GroupAttemptRecord> aliased) {
        this(alias, aliased, null);
    }

    private GroupAttempt(Name alias, Table<GroupAttemptRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.group_attempt</code> table reference
     */
    public GroupAttempt(String alias) {
        this(DSL.name(alias), GROUP_ATTEMPT);
    }

    /**
     * Create an aliased <code>gamedata.group_attempt</code> table reference
     */
    public GroupAttempt(Name alias) {
        this(alias, GROUP_ATTEMPT);
    }

    /**
     * Create a <code>gamedata.group_attempt</code> table reference
     */
    public GroupAttempt() {
        this(DSL.name("group_attempt"), null);
    }

    public <O extends Record> GroupAttempt(Table<O> child, ForeignKey<O, GroupAttemptRecord> key) {
        super(child, key, GROUP_ATTEMPT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.GROUP_ATTEMPT_FK_GROUP_ATTEMPT_GAME_MISSION1_IDX, Indexes.GROUP_ATTEMPT_FK_GROUP_ATTEMPT_GROUP1_IDX);
    }

    @Override
    public Identity<GroupAttemptRecord, Integer> getIdentity() {
        return (Identity<GroupAttemptRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<GroupAttemptRecord> getPrimaryKey() {
        return Keys.KEY_GROUP_ATTEMPT_PRIMARY;
    }

    @Override
    public List<UniqueKey<GroupAttemptRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_GROUP_ATTEMPT_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<GroupAttemptRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_GROUP_ATTEMPT_GROUP1, Keys.FK_GROUP_ATTEMPT_GAME_MISSION1);
    }

    private transient Group _group;
    private transient GameMission _gameMission;

    /**
     * Get the implicit join path to the <code>gamedata.group</code> table.
     */
    public Group group() {
        if (_group == null)
            _group = new Group(this, Keys.FK_GROUP_ATTEMPT_GROUP1);

        return _group;
    }

    /**
     * Get the implicit join path to the <code>gamedata.game_mission</code>
     * table.
     */
    public GameMission gameMission() {
        if (_gameMission == null)
            _gameMission = new GameMission(this, Keys.FK_GROUP_ATTEMPT_GAME_MISSION1);

        return _gameMission;
    }

    @Override
    public GroupAttempt as(String alias) {
        return new GroupAttempt(DSL.name(alias), this);
    }

    @Override
    public GroupAttempt as(Name alias) {
        return new GroupAttempt(alias, this);
    }

    @Override
    public GroupAttempt as(Table<?> alias) {
        return new GroupAttempt(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupAttempt rename(String name) {
        return new GroupAttempt(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupAttempt rename(Name name) {
        return new GroupAttempt(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupAttempt rename(Table<?> name) {
        return new GroupAttempt(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Integer, ? super Integer, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Integer, ? super Integer, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
