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
import nl.gamedata.data.tables.records.LearningGoalRecord;

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
public class LearningGoal extends TableImpl<LearningGoalRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.learning_goal</code>
     */
    public static final LearningGoal LEARNING_GOAL = new LearningGoal();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LearningGoalRecord> getRecordType() {
        return LearningGoalRecord.class;
    }

    /**
     * The column <code>gamedata.learning_goal.id</code>.
     */
    public final TableField<LearningGoalRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.learning_goal.name</code>.
     */
    public final TableField<LearningGoalRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.learning_goal.description</code>.
     */
    public final TableField<LearningGoalRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>gamedata.learning_goal.game_mission_id</code>.
     */
    public final TableField<LearningGoalRecord, Integer> GAME_MISSION_ID = createField(DSL.name("game_mission_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private LearningGoal(Name alias, Table<LearningGoalRecord> aliased) {
        this(alias, aliased, null);
    }

    private LearningGoal(Name alias, Table<LearningGoalRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.learning_goal</code> table reference
     */
    public LearningGoal(String alias) {
        this(DSL.name(alias), LEARNING_GOAL);
    }

    /**
     * Create an aliased <code>gamedata.learning_goal</code> table reference
     */
    public LearningGoal(Name alias) {
        this(alias, LEARNING_GOAL);
    }

    /**
     * Create a <code>gamedata.learning_goal</code> table reference
     */
    public LearningGoal() {
        this(DSL.name("learning_goal"), null);
    }

    public <O extends Record> LearningGoal(Table<O> child, ForeignKey<O, LearningGoalRecord> key) {
        super(child, key, LEARNING_GOAL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.LEARNING_GOAL_FK_LEARNING_GOAL_GAME_MISSION1_IDX);
    }

    @Override
    public Identity<LearningGoalRecord, Integer> getIdentity() {
        return (Identity<LearningGoalRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<LearningGoalRecord> getPrimaryKey() {
        return Keys.KEY_LEARNING_GOAL_PRIMARY;
    }

    @Override
    public List<UniqueKey<LearningGoalRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_LEARNING_GOAL_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<LearningGoalRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_LEARNING_GOAL_GAME_MISSION1);
    }

    private transient GameMission _gameMission;

    /**
     * Get the implicit join path to the <code>gamedata.game_mission</code>
     * table.
     */
    public GameMission gameMission() {
        if (_gameMission == null)
            _gameMission = new GameMission(this, Keys.FK_LEARNING_GOAL_GAME_MISSION1);

        return _gameMission;
    }

    @Override
    public LearningGoal as(String alias) {
        return new LearningGoal(DSL.name(alias), this);
    }

    @Override
    public LearningGoal as(Name alias) {
        return new LearningGoal(alias, this);
    }

    @Override
    public LearningGoal as(Table<?> alias) {
        return new LearningGoal(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public LearningGoal rename(String name) {
        return new LearningGoal(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LearningGoal rename(Name name) {
        return new LearningGoal(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public LearningGoal rename(Table<?> name) {
        return new LearningGoal(name.getQualifiedName(), null);
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
