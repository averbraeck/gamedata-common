/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.LearningGoal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LearningGoalRecord extends UpdatableRecordImpl<LearningGoalRecord> implements Record5<Integer, String, String, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.learning_goal.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.learning_goal.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.learning_goal.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.learning_goal.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.learning_goal.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.learning_goal.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.learning_goal.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.learning_goal.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>gamedata.learning_goal.game_mission_id</code>.
     */
    public void setGameMissionId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.learning_goal.game_mission_id</code>.
     */
    public Integer getGameMissionId() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, String, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return LearningGoal.LEARNING_GOAL.ID;
    }

    @Override
    public Field<String> field2() {
        return LearningGoal.LEARNING_GOAL.CODE;
    }

    @Override
    public Field<String> field3() {
        return LearningGoal.LEARNING_GOAL.NAME;
    }

    @Override
    public Field<String> field4() {
        return LearningGoal.LEARNING_GOAL.DESCRIPTION;
    }

    @Override
    public Field<Integer> field5() {
        return LearningGoal.LEARNING_GOAL.GAME_MISSION_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public Integer component5() {
        return getGameMissionId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public Integer value5() {
        return getGameMissionId();
    }

    @Override
    public LearningGoalRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public LearningGoalRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public LearningGoalRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public LearningGoalRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public LearningGoalRecord value5(Integer value) {
        setGameMissionId(value);
        return this;
    }

    @Override
    public LearningGoalRecord values(Integer value1, String value2, String value3, String value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LearningGoalRecord
     */
    public LearningGoalRecord() {
        super(LearningGoal.LEARNING_GOAL);
    }

    /**
     * Create a detached, initialised LearningGoalRecord
     */
    public LearningGoalRecord(Integer id, String code, String name, String description, Integer gameMissionId) {
        super(LearningGoal.LEARNING_GOAL);

        setId(id);
        setCode(code);
        setName(name);
        setDescription(description);
        setGameMissionId(gameMissionId);
        resetChangedOnNotNull();
    }
}
