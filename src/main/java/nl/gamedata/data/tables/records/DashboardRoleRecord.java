/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.DashboardRole;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DashboardRoleRecord extends UpdatableRecordImpl<DashboardRoleRecord> implements Record4<Integer, Byte, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.dashboard_role.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_role.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.dashboard_role.edit</code>.
     */
    public void setEdit(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_role.edit</code>.
     */
    public Byte getEdit() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>gamedata.dashboard_role.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_role.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>gamedata.dashboard_role.dashboard_template_id</code>.
     */
    public void setDashboardTemplateId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.dashboard_role.dashboard_template_id</code>.
     */
    public Integer getDashboardTemplateId() {
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
    public Row4<Integer, Byte, Integer, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Byte, Integer, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return DashboardRole.DASHBOARD_ROLE.ID;
    }

    @Override
    public Field<Byte> field2() {
        return DashboardRole.DASHBOARD_ROLE.EDIT;
    }

    @Override
    public Field<Integer> field3() {
        return DashboardRole.DASHBOARD_ROLE.USER_ID;
    }

    @Override
    public Field<Integer> field4() {
        return DashboardRole.DASHBOARD_ROLE.DASHBOARD_TEMPLATE_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Byte component2() {
        return getEdit();
    }

    @Override
    public Integer component3() {
        return getUserId();
    }

    @Override
    public Integer component4() {
        return getDashboardTemplateId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Byte value2() {
        return getEdit();
    }

    @Override
    public Integer value3() {
        return getUserId();
    }

    @Override
    public Integer value4() {
        return getDashboardTemplateId();
    }

    @Override
    public DashboardRoleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DashboardRoleRecord value2(Byte value) {
        setEdit(value);
        return this;
    }

    @Override
    public DashboardRoleRecord value3(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public DashboardRoleRecord value4(Integer value) {
        setDashboardTemplateId(value);
        return this;
    }

    @Override
    public DashboardRoleRecord values(Integer value1, Byte value2, Integer value3, Integer value4) {
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
     * Create a detached DashboardRoleRecord
     */
    public DashboardRoleRecord() {
        super(DashboardRole.DASHBOARD_ROLE);
    }

    /**
     * Create a detached, initialised DashboardRoleRecord
     */
    public DashboardRoleRecord(Integer id, Byte edit, Integer userId, Integer dashboardTemplateId) {
        super(DashboardRole.DASHBOARD_ROLE);

        setId(id);
        setEdit(edit);
        setUserId(userId);
        setDashboardTemplateId(dashboardTemplateId);
        resetChangedOnNotNull();
    }
}
