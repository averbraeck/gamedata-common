/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import java.time.LocalDateTime;

import nl.tudelft.simulation.housinggame.data.tables.PlayerLogdata;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlayerLogdataRecord extends UpdatableRecordImpl<PlayerLogdataRecord> implements Record7<Integer, String, String, String, LocalDateTime, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.player_logdata.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.player_logdata.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.player_logdata.type</code>.
     */
    public void setType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.player_logdata.type</code>.
     */
    public String getType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.player_logdata.key</code>.
     */
    public void setKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.player_logdata.key</code>.
     */
    public String getKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.player_logdata.value</code>.
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.player_logdata.value</code>.
     */
    public String getValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>gamedata.player_logdata.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.player_logdata.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>gamedata.player_logdata.mission_attempt</code>.
     */
    public void setMissionAttempt(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.player_logdata.mission_attempt</code>.
     */
    public Integer getMissionAttempt() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>gamedata.player_logdata.player_id</code>.
     */
    public void setPlayerId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>gamedata.player_logdata.player_id</code>.
     */
    public Integer getPlayerId() {
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
    public Row7<Integer, String, String, String, LocalDateTime, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, String, String, String, LocalDateTime, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PlayerLogdata.PLAYER_LOGDATA.ID;
    }

    @Override
    public Field<String> field2() {
        return PlayerLogdata.PLAYER_LOGDATA.TYPE;
    }

    @Override
    public Field<String> field3() {
        return PlayerLogdata.PLAYER_LOGDATA.KEY;
    }

    @Override
    public Field<String> field4() {
        return PlayerLogdata.PLAYER_LOGDATA.VALUE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return PlayerLogdata.PLAYER_LOGDATA.TIMESTAMP;
    }

    @Override
    public Field<Integer> field6() {
        return PlayerLogdata.PLAYER_LOGDATA.MISSION_ATTEMPT;
    }

    @Override
    public Field<Integer> field7() {
        return PlayerLogdata.PLAYER_LOGDATA.PLAYER_ID;
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
        return getKey();
    }

    @Override
    public String component4() {
        return getValue();
    }

    @Override
    public LocalDateTime component5() {
        return getTimestamp();
    }

    @Override
    public Integer component6() {
        return getMissionAttempt();
    }

    @Override
    public Integer component7() {
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
        return getKey();
    }

    @Override
    public String value4() {
        return getValue();
    }

    @Override
    public LocalDateTime value5() {
        return getTimestamp();
    }

    @Override
    public Integer value6() {
        return getMissionAttempt();
    }

    @Override
    public Integer value7() {
        return getPlayerId();
    }

    @Override
    public PlayerLogdataRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PlayerLogdataRecord value2(String value) {
        setType(value);
        return this;
    }

    @Override
    public PlayerLogdataRecord value3(String value) {
        setKey(value);
        return this;
    }

    @Override
    public PlayerLogdataRecord value4(String value) {
        setValue(value);
        return this;
    }

    @Override
    public PlayerLogdataRecord value5(LocalDateTime value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public PlayerLogdataRecord value6(Integer value) {
        setMissionAttempt(value);
        return this;
    }

    @Override
    public PlayerLogdataRecord value7(Integer value) {
        setPlayerId(value);
        return this;
    }

    @Override
    public PlayerLogdataRecord values(Integer value1, String value2, String value3, String value4, LocalDateTime value5, Integer value6, Integer value7) {
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
     * Create a detached PlayerLogdataRecord
     */
    public PlayerLogdataRecord() {
        super(PlayerLogdata.PLAYER_LOGDATA);
    }

    /**
     * Create a detached, initialised PlayerLogdataRecord
     */
    public PlayerLogdataRecord(Integer id, String type, String key, String value, LocalDateTime timestamp, Integer missionAttempt, Integer playerId) {
        super(PlayerLogdata.PLAYER_LOGDATA);

        setId(id);
        setType(type);
        setKey(key);
        setValue(value);
        setTimestamp(timestamp);
        setMissionAttempt(missionAttempt);
        setPlayerId(playerId);
        resetChangedOnNotNull();
    }
}
