/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.GameMission;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GameMissionRecord extends UpdatableRecordImpl<GameMissionRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.game_mission.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.game_mission.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.game_mission.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.game_mission.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.game_mission.gameversion_id</code>.
     */
    public void setGameversionId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.game_mission.gameversion_id</code>.
     */
    public Integer getGameversionId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GameMission.GAME_MISSION.ID;
    }

    @Override
    public Field<String> field2() {
        return GameMission.GAME_MISSION.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return GameMission.GAME_MISSION.GAMEVERSION_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getGameversionId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getGameversionId();
    }

    @Override
    public GameMissionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GameMissionRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GameMissionRecord value3(Integer value) {
        setGameversionId(value);
        return this;
    }

    @Override
    public GameMissionRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GameMissionRecord
     */
    public GameMissionRecord() {
        super(GameMission.GAME_MISSION);
    }

    /**
     * Create a detached, initialised GameMissionRecord
     */
    public GameMissionRecord(Integer id, String name, Integer gameversionId) {
        super(GameMission.GAME_MISSION);

        setId(id);
        setName(name);
        setGameversionId(gameversionId);
        resetChangedOnNotNull();
    }
}
