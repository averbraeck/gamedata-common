/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.GameMission;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GameMissionRecord extends UpdatableRecordImpl<GameMissionRecord> implements Record5<Integer, String, String, String, Integer> {

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
     * Setter for <code>gamedata.game_mission.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.game_mission.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.game_mission.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.game_mission.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.game_mission.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.game_mission.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>gamedata.game_mission.game_version_id</code>.
     */
    public void setGameVersionId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.game_mission.game_version_id</code>.
     */
    public Integer getGameVersionId() {
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
        return GameMission.GAME_MISSION.ID;
    }

    @Override
    public Field<String> field2() {
        return GameMission.GAME_MISSION.CODE;
    }

    @Override
    public Field<String> field3() {
        return GameMission.GAME_MISSION.NAME;
    }

    @Override
    public Field<String> field4() {
        return GameMission.GAME_MISSION.DESCRIPTION;
    }

    @Override
    public Field<Integer> field5() {
        return GameMission.GAME_MISSION.GAME_VERSION_ID;
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
        return getGameVersionId();
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
        return getGameVersionId();
    }

    @Override
    public GameMissionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GameMissionRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public GameMissionRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public GameMissionRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public GameMissionRecord value5(Integer value) {
        setGameVersionId(value);
        return this;
    }

    @Override
    public GameMissionRecord values(Integer value1, String value2, String value3, String value4, Integer value5) {
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
     * Create a detached GameMissionRecord
     */
    public GameMissionRecord() {
        super(GameMission.GAME_MISSION);
    }

    /**
     * Create a detached, initialised GameMissionRecord
     */
    public GameMissionRecord(Integer id, String code, String name, String description, Integer gameVersionId) {
        super(GameMission.GAME_MISSION);

        setId(id);
        setCode(code);
        setName(name);
        setDescription(description);
        setGameVersionId(gameVersionId);
        resetChangedOnNotNull();
    }
}
