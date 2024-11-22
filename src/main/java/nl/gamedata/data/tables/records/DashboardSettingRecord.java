/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.DashboardSetting;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DashboardSettingRecord extends UpdatableRecordImpl<DashboardSettingRecord> implements Record6<Integer, String, String, Byte, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.dashboard_setting.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_setting.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.dashboard_setting.key</code>.
     */
    public void setKey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_setting.key</code>.
     */
    public String getKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.dashboard_setting.value</code>.
     */
    public void setValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_setting.value</code>.
     */
    public String getValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.dashboard_setting.private</code>.
     */
    public void setPrivate(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_setting.private</code>.
     */
    public Byte getPrivate() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>gamedata.dashboard_setting.game_mission_id</code>.
     */
    public void setGameMissionId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_setting.game_mission_id</code>.
     */
    public Integer getGameMissionId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>gamedata.dashboard_setting.game_access_id</code>.
     */
    public void setGameAccessId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_setting.game_access_id</code>.
     */
    public Integer getGameAccessId() {
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
    public Row6<Integer, String, String, Byte, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, Byte, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return DashboardSetting.DASHBOARD_SETTING.ID;
    }

    @Override
    public Field<String> field2() {
        return DashboardSetting.DASHBOARD_SETTING.KEY;
    }

    @Override
    public Field<String> field3() {
        return DashboardSetting.DASHBOARD_SETTING.VALUE;
    }

    @Override
    public Field<Byte> field4() {
        return DashboardSetting.DASHBOARD_SETTING.PRIVATE;
    }

    @Override
    public Field<Integer> field5() {
        return DashboardSetting.DASHBOARD_SETTING.GAME_MISSION_ID;
    }

    @Override
    public Field<Integer> field6() {
        return DashboardSetting.DASHBOARD_SETTING.GAME_ACCESS_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getKey();
    }

    @Override
    public String component3() {
        return getValue();
    }

    @Override
    public Byte component4() {
        return getPrivate();
    }

    @Override
    public Integer component5() {
        return getGameMissionId();
    }

    @Override
    public Integer component6() {
        return getGameAccessId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getKey();
    }

    @Override
    public String value3() {
        return getValue();
    }

    @Override
    public Byte value4() {
        return getPrivate();
    }

    @Override
    public Integer value5() {
        return getGameMissionId();
    }

    @Override
    public Integer value6() {
        return getGameAccessId();
    }

    @Override
    public DashboardSettingRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DashboardSettingRecord value2(String value) {
        setKey(value);
        return this;
    }

    @Override
    public DashboardSettingRecord value3(String value) {
        setValue(value);
        return this;
    }

    @Override
    public DashboardSettingRecord value4(Byte value) {
        setPrivate(value);
        return this;
    }

    @Override
    public DashboardSettingRecord value5(Integer value) {
        setGameMissionId(value);
        return this;
    }

    @Override
    public DashboardSettingRecord value6(Integer value) {
        setGameAccessId(value);
        return this;
    }

    @Override
    public DashboardSettingRecord values(Integer value1, String value2, String value3, Byte value4, Integer value5, Integer value6) {
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
     * Create a detached DashboardSettingRecord
     */
    public DashboardSettingRecord() {
        super(DashboardSetting.DASHBOARD_SETTING);
    }

    /**
     * Create a detached, initialised DashboardSettingRecord
     */
    public DashboardSettingRecord(Integer id, String key, String value, Byte private_, Integer gameMissionId, Integer gameAccessId) {
        super(DashboardSetting.DASHBOARD_SETTING);

        setId(id);
        setKey(key);
        setValue(value);
        setPrivate(private_);
        setGameMissionId(gameMissionId);
        setGameAccessId(gameAccessId);
        resetChangedOnNotNull();
    }
}
