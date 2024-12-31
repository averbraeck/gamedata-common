/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.DashboardSession;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DashboardSessionRecord extends UpdatableRecordImpl<DashboardSessionRecord> implements Record4<Integer, String, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.dashboard_session.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_session.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.dashboard_session.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_session.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.dashboard_session.dashboard_id</code>.
     */
    public void setDashboardId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_session.dashboard_id</code>.
     */
    public Integer getDashboardId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>gamedata.dashboard_session.game_session_id</code>.
     */
    public void setGameSessionId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_session.game_session_id</code>.
     */
    public Integer getGameSessionId() {
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
    public Row4<Integer, String, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return DashboardSession.DASHBOARD_SESSION.ID;
    }

    @Override
    public Field<String> field2() {
        return DashboardSession.DASHBOARD_SESSION.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return DashboardSession.DASHBOARD_SESSION.DASHBOARD_ID;
    }

    @Override
    public Field<Integer> field4() {
        return DashboardSession.DASHBOARD_SESSION.GAME_SESSION_ID;
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
        return getDashboardId();
    }

    @Override
    public Integer component4() {
        return getGameSessionId();
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
        return getDashboardId();
    }

    @Override
    public Integer value4() {
        return getGameSessionId();
    }

    @Override
    public DashboardSessionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DashboardSessionRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public DashboardSessionRecord value3(Integer value) {
        setDashboardId(value);
        return this;
    }

    @Override
    public DashboardSessionRecord value4(Integer value) {
        setGameSessionId(value);
        return this;
    }

    @Override
    public DashboardSessionRecord values(Integer value1, String value2, Integer value3, Integer value4) {
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
     * Create a detached DashboardSessionRecord
     */
    public DashboardSessionRecord() {
        super(DashboardSession.DASHBOARD_SESSION);
    }

    /**
     * Create a detached, initialised DashboardSessionRecord
     */
    public DashboardSessionRecord(Integer id, String name, Integer dashboardId, Integer gameSessionId) {
        super(DashboardSession.DASHBOARD_SESSION);

        setId(id);
        setName(name);
        setDashboardId(dashboardId);
        setGameSessionId(gameSessionId);
        resetChangedOnNotNull();
    }
}
