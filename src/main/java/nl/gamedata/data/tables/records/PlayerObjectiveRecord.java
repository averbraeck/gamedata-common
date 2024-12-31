/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.PlayerObjective;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlayerObjectiveRecord extends UpdatableRecordImpl<PlayerObjectiveRecord> implements Record7<Integer, String, String, String, String, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.player_objective.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.player_objective.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.player_objective.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.player_objective.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.player_objective.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.player_objective.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.player_objective.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.player_objective.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>gamedata.player_objective.threshold</code>.
     */
    public void setThreshold(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.player_objective.threshold</code>.
     */
    public String getThreshold() {
        return (String) get(4);
    }

    /**
     * Setter for <code>gamedata.player_objective.scale_id</code>.
     */
    public void setScaleId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.player_objective.scale_id</code>.
     */
    public Integer getScaleId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>gamedata.player_objective.learning_goal_id</code>.
     */
    public void setLearningGoalId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>gamedata.player_objective.learning_goal_id</code>.
     */
    public Integer getLearningGoalId() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, String, String, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, String, String, String, String, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PlayerObjective.PLAYER_OBJECTIVE.ID;
    }

    @Override
    public Field<String> field2() {
        return PlayerObjective.PLAYER_OBJECTIVE.CODE;
    }

    @Override
    public Field<String> field3() {
        return PlayerObjective.PLAYER_OBJECTIVE.NAME;
    }

    @Override
    public Field<String> field4() {
        return PlayerObjective.PLAYER_OBJECTIVE.DESCRIPTION;
    }

    @Override
    public Field<String> field5() {
        return PlayerObjective.PLAYER_OBJECTIVE.THRESHOLD;
    }

    @Override
    public Field<Integer> field6() {
        return PlayerObjective.PLAYER_OBJECTIVE.SCALE_ID;
    }

    @Override
    public Field<Integer> field7() {
        return PlayerObjective.PLAYER_OBJECTIVE.LEARNING_GOAL_ID;
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
    public String component5() {
        return getThreshold();
    }

    @Override
    public Integer component6() {
        return getScaleId();
    }

    @Override
    public Integer component7() {
        return getLearningGoalId();
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
    public String value5() {
        return getThreshold();
    }

    @Override
    public Integer value6() {
        return getScaleId();
    }

    @Override
    public Integer value7() {
        return getLearningGoalId();
    }

    @Override
    public PlayerObjectiveRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PlayerObjectiveRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public PlayerObjectiveRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public PlayerObjectiveRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public PlayerObjectiveRecord value5(String value) {
        setThreshold(value);
        return this;
    }

    @Override
    public PlayerObjectiveRecord value6(Integer value) {
        setScaleId(value);
        return this;
    }

    @Override
    public PlayerObjectiveRecord value7(Integer value) {
        setLearningGoalId(value);
        return this;
    }

    @Override
    public PlayerObjectiveRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlayerObjectiveRecord
     */
    public PlayerObjectiveRecord() {
        super(PlayerObjective.PLAYER_OBJECTIVE);
    }

    /**
     * Create a detached, initialised PlayerObjectiveRecord
     */
    public PlayerObjectiveRecord(Integer id, String code, String name, String description, String threshold, Integer scaleId, Integer learningGoalId) {
        super(PlayerObjective.PLAYER_OBJECTIVE);

        setId(id);
        setCode(code);
        setName(name);
        setDescription(description);
        setThreshold(threshold);
        setScaleId(scaleId);
        setLearningGoalId(learningGoalId);
        resetChangedOnNotNull();
    }
}
