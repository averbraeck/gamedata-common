/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import java.time.LocalDateTime;

import nl.gamedata.data.tables.GroupEvent;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupEventRecord extends UpdatableRecordImpl<GroupEventRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.group_event.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.group_event.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.group_event.type</code>.
     */
    public void setType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.group_event.type</code>.
     */
    public String getType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.group_event.key</code>.
     */
    public void setKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.group_event.key</code>.
     */
    public String getKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.group_event.value</code>.
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.group_event.value</code>.
     */
    public String getValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>gamedata.group_event.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.group_event.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>gamedata.group_event.status</code>.
     */
    public void setStatus(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.group_event.status</code>.
     */
    public String getStatus() {
        return (String) get(5);
    }

    /**
     * Setter for <code>gamedata.group_event.round</code>.
     */
    public void setRound(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>gamedata.group_event.round</code>.
     */
    public String getRound() {
        return (String) get(6);
    }

    /**
     * Setter for <code>gamedata.group_event.game_time</code>.
     */
    public void setGameTime(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>gamedata.group_event.game_time</code>.
     */
    public String getGameTime() {
        return (String) get(7);
    }

    /**
     * Setter for <code>gamedata.group_event.grouping_code</code>.
     */
    public void setGroupingCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>gamedata.group_event.grouping_code</code>.
     */
    public String getGroupingCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>gamedata.group_event.group_initiated</code>.
     */
    public void setGroupInitiated(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>gamedata.group_event.group_initiated</code>.
     */
    public Byte getGroupInitiated() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>gamedata.group_event.group_attempt_id</code>.
     */
    public void setGroupAttemptId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>gamedata.group_event.group_attempt_id</code>.
     */
    public Integer getGroupAttemptId() {
        return (Integer) get(10);
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
     * Create a detached GroupEventRecord
     */
    public GroupEventRecord() {
        super(GroupEvent.GROUP_EVENT);
    }

    /**
     * Create a detached, initialised GroupEventRecord
     */
    public GroupEventRecord(Integer id, String type, String key, String value, LocalDateTime timestamp, String status, String round, String gameTime, String groupingCode, Byte groupInitiated, Integer groupAttemptId) {
        super(GroupEvent.GROUP_EVENT);

        setId(id);
        setType(type);
        setKey(key);
        setValue(value);
        setTimestamp(timestamp);
        setStatus(status);
        setRound(round);
        setGameTime(gameTime);
        setGroupingCode(groupingCode);
        setGroupInitiated(groupInitiated);
        setGroupAttemptId(groupAttemptId);
        resetChangedOnNotNull();
    }
}
