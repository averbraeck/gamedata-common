/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.GroupAttempt;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupAttemptRecord extends UpdatableRecordImpl<GroupAttemptRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.group_attempt.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.group_attempt.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.group_attempt.attempt_nr</code>.
     */
    public void setAttemptNr(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.group_attempt.attempt_nr</code>.
     */
    public Integer getAttemptNr() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>gamedata.group_attempt.status</code>.
     */
    public void setStatus(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.group_attempt.status</code>.
     */
    public String getStatus() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.group_attempt.group_id</code>.
     */
    public void setGroupId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.group_attempt.group_id</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>gamedata.group_attempt.game_mission_id</code>.
     */
    public void setGameMissionId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.group_attempt.game_mission_id</code>.
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
     * Create a detached GroupAttemptRecord
     */
    public GroupAttemptRecord() {
        super(GroupAttempt.GROUP_ATTEMPT);
    }

    /**
     * Create a detached, initialised GroupAttemptRecord
     */
    public GroupAttemptRecord(Integer id, Integer attemptNr, String status, Integer groupId, Integer gameMissionId) {
        super(GroupAttempt.GROUP_ATTEMPT);

        setId(id);
        setAttemptNr(attemptNr);
        setStatus(status);
        setGroupId(groupId);
        setGameMissionId(gameMissionId);
        resetChangedOnNotNull();
    }
}
