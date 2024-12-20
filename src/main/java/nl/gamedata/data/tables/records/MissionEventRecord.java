/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import java.time.LocalDateTime;

import nl.gamedata.data.tables.MissionEvent;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MissionEventRecord extends UpdatableRecordImpl<MissionEventRecord> implements Record12<Integer, String, String, String, LocalDateTime, String, String, String, String, Byte, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.mission_event.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.mission_event.type</code>.
     */
    public void setType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.type</code>.
     */
    public String getType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.mission_event.key</code>.
     */
    public void setKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.key</code>.
     */
    public String getKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.mission_event.value</code>.
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.value</code>.
     */
    public String getValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>gamedata.mission_event.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>gamedata.mission_event.status</code>.
     */
    public void setStatus(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.status</code>.
     */
    public String getStatus() {
        return (String) get(5);
    }

    /**
     * Setter for <code>gamedata.mission_event.round</code>.
     */
    public void setRound(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.round</code>.
     */
    public String getRound() {
        return (String) get(6);
    }

    /**
     * Setter for <code>gamedata.mission_event.game_time</code>.
     */
    public void setGameTime(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.game_time</code>.
     */
    public String getGameTime() {
        return (String) get(7);
    }

    /**
     * Setter for <code>gamedata.mission_event.grouping_code</code>.
     */
    public void setGroupingCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.grouping_code</code>.
     */
    public String getGroupingCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>gamedata.mission_event.facilitator_initiated</code>.
     */
    public void setFacilitatorInitiated(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.facilitator_initiated</code>.
     */
    public Byte getFacilitatorInitiated() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>gamedata.mission_event.game_session_id</code>.
     */
    public void setGameSessionId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.game_session_id</code>.
     */
    public Integer getGameSessionId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>gamedata.mission_event.game_mission_id</code>.
     */
    public void setGameMissionId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.game_mission_id</code>.
     */
    public Integer getGameMissionId() {
        return (Integer) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, LocalDateTime, String, String, String, String, Byte, Integer, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Integer, String, String, String, LocalDateTime, String, String, String, String, Byte, Integer, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return MissionEvent.MISSION_EVENT.ID;
    }

    @Override
    public Field<String> field2() {
        return MissionEvent.MISSION_EVENT.TYPE;
    }

    @Override
    public Field<String> field3() {
        return MissionEvent.MISSION_EVENT.KEY;
    }

    @Override
    public Field<String> field4() {
        return MissionEvent.MISSION_EVENT.VALUE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return MissionEvent.MISSION_EVENT.TIMESTAMP;
    }

    @Override
    public Field<String> field6() {
        return MissionEvent.MISSION_EVENT.STATUS;
    }

    @Override
    public Field<String> field7() {
        return MissionEvent.MISSION_EVENT.ROUND;
    }

    @Override
    public Field<String> field8() {
        return MissionEvent.MISSION_EVENT.GAME_TIME;
    }

    @Override
    public Field<String> field9() {
        return MissionEvent.MISSION_EVENT.GROUPING_CODE;
    }

    @Override
    public Field<Byte> field10() {
        return MissionEvent.MISSION_EVENT.FACILITATOR_INITIATED;
    }

    @Override
    public Field<Integer> field11() {
        return MissionEvent.MISSION_EVENT.GAME_SESSION_ID;
    }

    @Override
    public Field<Integer> field12() {
        return MissionEvent.MISSION_EVENT.GAME_MISSION_ID;
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
    public String component6() {
        return getStatus();
    }

    @Override
    public String component7() {
        return getRound();
    }

    @Override
    public String component8() {
        return getGameTime();
    }

    @Override
    public String component9() {
        return getGroupingCode();
    }

    @Override
    public Byte component10() {
        return getFacilitatorInitiated();
    }

    @Override
    public Integer component11() {
        return getGameSessionId();
    }

    @Override
    public Integer component12() {
        return getGameMissionId();
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
    public String value6() {
        return getStatus();
    }

    @Override
    public String value7() {
        return getRound();
    }

    @Override
    public String value8() {
        return getGameTime();
    }

    @Override
    public String value9() {
        return getGroupingCode();
    }

    @Override
    public Byte value10() {
        return getFacilitatorInitiated();
    }

    @Override
    public Integer value11() {
        return getGameSessionId();
    }

    @Override
    public Integer value12() {
        return getGameMissionId();
    }

    @Override
    public MissionEventRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public MissionEventRecord value2(String value) {
        setType(value);
        return this;
    }

    @Override
    public MissionEventRecord value3(String value) {
        setKey(value);
        return this;
    }

    @Override
    public MissionEventRecord value4(String value) {
        setValue(value);
        return this;
    }

    @Override
    public MissionEventRecord value5(LocalDateTime value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public MissionEventRecord value6(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public MissionEventRecord value7(String value) {
        setRound(value);
        return this;
    }

    @Override
    public MissionEventRecord value8(String value) {
        setGameTime(value);
        return this;
    }

    @Override
    public MissionEventRecord value9(String value) {
        setGroupingCode(value);
        return this;
    }

    @Override
    public MissionEventRecord value10(Byte value) {
        setFacilitatorInitiated(value);
        return this;
    }

    @Override
    public MissionEventRecord value11(Integer value) {
        setGameSessionId(value);
        return this;
    }

    @Override
    public MissionEventRecord value12(Integer value) {
        setGameMissionId(value);
        return this;
    }

    @Override
    public MissionEventRecord values(Integer value1, String value2, String value3, String value4, LocalDateTime value5, String value6, String value7, String value8, String value9, Byte value10, Integer value11, Integer value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MissionEventRecord
     */
    public MissionEventRecord() {
        super(MissionEvent.MISSION_EVENT);
    }

    /**
     * Create a detached, initialised MissionEventRecord
     */
    public MissionEventRecord(Integer id, String type, String key, String value, LocalDateTime timestamp, String status, String round, String gameTime, String groupingCode, Byte facilitatorInitiated, Integer gameSessionId, Integer gameMissionId) {
        super(MissionEvent.MISSION_EVENT);

        setId(id);
        setType(type);
        setKey(key);
        setValue(value);
        setTimestamp(timestamp);
        setStatus(status);
        setRound(round);
        setGameTime(gameTime);
        setGroupingCode(groupingCode);
        setFacilitatorInitiated(facilitatorInitiated);
        setGameSessionId(gameSessionId);
        setGameMissionId(gameMissionId);
        resetChangedOnNotNull();
    }
}
