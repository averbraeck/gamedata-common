/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import java.time.LocalDateTime;

import nl.gamedata.data.tables.MissionEvent;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MissionEventRecord extends UpdatableRecordImpl<MissionEventRecord> implements Record5<Integer, String, String, LocalDateTime, Integer> {

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
     * Setter for <code>gamedata.mission_event.value</code>.
     */
    public void setValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.value</code>.
     */
    public String getValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.mission_event.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>gamedata.mission_event.gamesession_id</code>.
     */
    public void setGamesessionId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.mission_event.gamesession_id</code>.
     */
    public Integer getGamesessionId() {
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
    public Row5<Integer, String, String, LocalDateTime, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, String, LocalDateTime, Integer> valuesRow() {
        return (Row5) super.valuesRow();
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
        return MissionEvent.MISSION_EVENT.VALUE;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return MissionEvent.MISSION_EVENT.TIMESTAMP;
    }

    @Override
    public Field<Integer> field5() {
        return MissionEvent.MISSION_EVENT.GAMESESSION_ID;
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
        return getGamesessionId();
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
        return getGamesessionId();
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
        setValue(value);
        return this;
    }

    @Override
    public MissionEventRecord value4(LocalDateTime value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public MissionEventRecord value5(Integer value) {
        setGamesessionId(value);
        return this;
    }

    @Override
    public MissionEventRecord values(Integer value1, String value2, String value3, LocalDateTime value4, Integer value5) {
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
     * Create a detached MissionEventRecord
     */
    public MissionEventRecord() {
        super(MissionEvent.MISSION_EVENT);
    }

    /**
     * Create a detached, initialised MissionEventRecord
     */
    public MissionEventRecord(Integer id, String type, String value, LocalDateTime timestamp, Integer gamesessionId) {
        super(MissionEvent.MISSION_EVENT);

        setId(id);
        setType(type);
        setValue(value);
        setTimestamp(timestamp);
        setGamesessionId(gamesessionId);
        resetChangedOnNotNull();
    }
}