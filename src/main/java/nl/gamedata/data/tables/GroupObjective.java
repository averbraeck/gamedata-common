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
import nl.gamedata.data.tables.records.GroupObjectiveRecord;

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
public class GroupObjective extends TableImpl<GroupObjectiveRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.group_objective</code>
     */
    public static final GroupObjective GROUP_OBJECTIVE = new GroupObjective();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupObjectiveRecord> getRecordType() {
        return GroupObjectiveRecord.class;
    }

    /**
     * The column <code>gamedata.group_objective.id</code>.
     */
    public final TableField<GroupObjectiveRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.group_objective.name</code>.
     */
    public final TableField<GroupObjectiveRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.group_objective.threshold</code>.
     */
    public final TableField<GroupObjectiveRecord, String> THRESHOLD = createField(DSL.name("threshold"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.group_objective.game_mission_id</code>.
     */
    public final TableField<GroupObjectiveRecord, Integer> GAME_MISSION_ID = createField(DSL.name("game_mission_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gamedata.group_objective.scale_id</code>.
     */
    public final TableField<GroupObjectiveRecord, Integer> SCALE_ID = createField(DSL.name("scale_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private GroupObjective(Name alias, Table<GroupObjectiveRecord> aliased) {
        this(alias, aliased, null);
    }

    private GroupObjective(Name alias, Table<GroupObjectiveRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.group_objective</code> table reference
     */
    public GroupObjective(String alias) {
        this(DSL.name(alias), GROUP_OBJECTIVE);
    }

    /**
     * Create an aliased <code>gamedata.group_objective</code> table reference
     */
    public GroupObjective(Name alias) {
        this(alias, GROUP_OBJECTIVE);
    }

    /**
     * Create a <code>gamedata.group_objective</code> table reference
     */
    public GroupObjective() {
        this(DSL.name("group_objective"), null);
    }

    public <O extends Record> GroupObjective(Table<O> child, ForeignKey<O, GroupObjectiveRecord> key) {
        super(child, key, GROUP_OBJECTIVE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.GROUP_OBJECTIVE_FK_GROUP_OBJECTIVE_GAME_MISSION1_IDX, Indexes.GROUP_OBJECTIVE_FK_GROUP_OBJECTIVE_SCALE1_IDX);
    }

    @Override
    public Identity<GroupObjectiveRecord, Integer> getIdentity() {
        return (Identity<GroupObjectiveRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<GroupObjectiveRecord> getPrimaryKey() {
        return Keys.KEY_GROUP_OBJECTIVE_PRIMARY;
    }

    @Override
    public List<UniqueKey<GroupObjectiveRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_GROUP_OBJECTIVE_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<GroupObjectiveRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_GROUP_OBJECTIVE_GAME_MISSION1, Keys.FK_GROUP_OBJECTIVE_SCALE1);
    }

    private transient GameMission _gameMission;
    private transient Scale _scale;

    /**
     * Get the implicit join path to the <code>gamedata.game_mission</code>
     * table.
     */
    public GameMission gameMission() {
        if (_gameMission == null)
            _gameMission = new GameMission(this, Keys.FK_GROUP_OBJECTIVE_GAME_MISSION1);

        return _gameMission;
    }

    /**
     * Get the implicit join path to the <code>gamedata.scale</code> table.
     */
    public Scale scale() {
        if (_scale == null)
            _scale = new Scale(this, Keys.FK_GROUP_OBJECTIVE_SCALE1);

        return _scale;
    }

    @Override
    public GroupObjective as(String alias) {
        return new GroupObjective(DSL.name(alias), this);
    }

    @Override
    public GroupObjective as(Name alias) {
        return new GroupObjective(alias, this);
    }

    @Override
    public GroupObjective as(Table<?> alias) {
        return new GroupObjective(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupObjective rename(String name) {
        return new GroupObjective(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupObjective rename(Name name) {
        return new GroupObjective(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupObjective rename(Table<?> name) {
        return new GroupObjective(name.getQualifiedName(), null);
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
