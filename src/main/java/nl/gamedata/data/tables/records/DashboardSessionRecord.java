/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.DashboardSession;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DashboardSessionRecord extends UpdatableRecordImpl<DashboardSessionRecord> implements Record3<Integer, Integer, Integer> {

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
     * Setter for <code>gamedata.dashboard_session.dashboard_id</code>.
     */
    public void setDashboardId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_session.dashboard_id</code>.
     */
    public Integer getDashboardId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>gamedata.dashboard_session.game_session_id</code>.
     */
    public void setGameSessionId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_session.game_session_id</code>.
     */
    public Integer getGameSessionId() {
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
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return DashboardSession.DASHBOARD_SESSION.ID;
    }

    @Override
    public Field<Integer> field2() {
        return DashboardSession.DASHBOARD_SESSION.DASHBOARD_ID;
    }

    @Override
    public Field<Integer> field3() {
        return DashboardSession.DASHBOARD_SESSION.GAME_SESSION_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getDashboardId();
    }

    @Override
    public Integer component3() {
        return getGameSessionId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getDashboardId();
    }

    @Override
    public Integer value3() {
        return getGameSessionId();
    }

    @Override
    public DashboardSessionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DashboardSessionRecord value2(Integer value) {
        setDashboardId(value);
        return this;
    }

    @Override
    public DashboardSessionRecord value3(Integer value) {
        setGameSessionId(value);
        return this;
    }

    @Override
    public DashboardSessionRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
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
    public DashboardSessionRecord(Integer id, Integer dashboardId, Integer gameSessionId) {
        super(DashboardSession.DASHBOARD_SESSION);

        setId(id);
        setDashboardId(dashboardId);
        setGameSessionId(gameSessionId);
        resetChangedOnNotNull();
    }
}