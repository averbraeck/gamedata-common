/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import java.time.LocalDateTime;

import nl.gamedata.data.tables.PlayerEvent;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlayerEventRecord extends UpdatableRecordImpl<PlayerEventRecord> implements Record6<Integer, String, String, LocalDateTime, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.player_event.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.player_event.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.player_event.type</code>.
     */
    public void setType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.player_event.type</code>.
     */
    public String getType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.player_event.value</code>.
     */
    public void setValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.player_event.value</code>.
     */
    public String getValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.player_event.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.player_event.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>gamedata.player_event.mission_attempt</code>.
     */
    public void setMissionAttempt(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.player_event.mission_attempt</code>.
     */
    public Integer getMissionAttempt() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>gamedata.player_event.player_id</code>.
     */
    public void setPlayerId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.player_event.player_id</code>.
     */
    public Integer getPlayerId() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, LocalDateTime, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, LocalDateTime, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PlayerEvent.PLAYER_EVENT.ID;
    }

    @Override
    public Field<String> field2() {
        return PlayerEvent.PLAYER_EVENT.TYPE;
    }

    @Override
    public Field<String> field3() {
        return PlayerEvent.PLAYER_EVENT.VALUE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return PlayerEvent.PLAYER_EVENT.TIMESTAMP;
    }

    @Override
    public Field<Integer> field5() {
        return PlayerEvent.PLAYER_EVENT.MISSION_ATTEMPT;
    }

    @Override
    public Field<Integer> field6() {
        return PlayerEvent.PLAYER_EVENT.PLAYER_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getType();
    }

    @Override
    public String component3() {
        return getValue();
    }

    @Override
    public LocalDateTime component4() {
        return getTimestamp();
    }

    @Override
    public Integer component5() {
        return getMissionAttempt();
    }

    @Override
    public Integer component6() {
        return getPlayerId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getType();
    }

    @Override
    public String value3() {
        return getValue();
    }

    @Override
    public LocalDateTime value4() {
        return getTimestamp();
    }

    @Override
    public Integer value5() {
        return getMissionAttempt();
    }

    @Override
    public Integer value6() {
        return getPlayerId();
    }

    @Override
    public PlayerEventRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PlayerEventRecord value2(String value) {
        setType(value);
        return this;
    }

    @Override
    public PlayerEventRecord value3(String value) {
        setValue(value);
        return this;
    }

    @Override
    public PlayerEventRecord value4(LocalDateTime value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public PlayerEventRecord value5(Integer value) {
        setMissionAttempt(value);
        return this;
    }

    @Override
    public PlayerEventRecord value6(Integer value) {
        setPlayerId(value);
        return this;
    }

    @Override
    public PlayerEventRecord values(Integer value1, String value2, String value3, LocalDateTime value4, Integer value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlayerEventRecord
     */
    public PlayerEventRecord() {
        super(PlayerEvent.PLAYER_EVENT);
    }

    /**
     * Create a detached, initialised PlayerEventRecord
     */
    public PlayerEventRecord(Integer id, String type, String value, LocalDateTime timestamp, Integer missionAttempt, Integer playerId) {
        super(PlayerEvent.PLAYER_EVENT);

        setId(id);
        setType(type);
        setValue(value);
        setTimestamp(timestamp);
        setMissionAttempt(missionAttempt);
        setPlayerId(playerId);
        resetChangedOnNotNull();
    }
}
