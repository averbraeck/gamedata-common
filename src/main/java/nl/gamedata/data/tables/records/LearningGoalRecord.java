/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.LearningGoal;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LearningGoalRecord extends UpdatableRecordImpl<LearningGoalRecord> {

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
