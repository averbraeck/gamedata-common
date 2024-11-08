/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.DashboardSetting;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DashboardSettingRecord extends UpdatableRecordImpl<DashboardSettingRecord> implements Record4<Integer, String, String, Integer> {

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
     * Setter for <code>gamedata.dashboard_setting.game_id</code>.
     */
    public void setGameId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_setting.game_id</code>.
     */
    public Integer getGameId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
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
    public Field<Integer> field4() {
        return DashboardSetting.DASHBOARD_SETTING.GAME_ID;
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
    public Integer component4() {
        return getGameId();
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
    public Integer value4() {
        return getGameId();
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
    public DashboardSettingRecord value4(Integer value) {
        setGameId(value);
        return this;
    }

    @Override
    public DashboardSettingRecord values(Integer value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
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
    public DashboardSettingRecord(Integer id, String key, String value, Integer gameId) {
        super(DashboardSetting.DASHBOARD_SETTING);

        setId(id);
        setKey(key);
        setValue(value);
        setGameId(gameId);
        resetChangedOnNotNull();
    }
}
