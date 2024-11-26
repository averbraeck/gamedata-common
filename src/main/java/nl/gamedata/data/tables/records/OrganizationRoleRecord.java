/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.OrganizationRole;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrganizationRoleRecord extends UpdatableRecordImpl<OrganizationRoleRecord> implements Record6<Integer, Byte, Byte, Byte, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.organization_role.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.organization_role.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.organization_role.organization_admin</code>.
     */
    public void setOrganizationAdmin(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.organization_role.organization_admin</code>.
     */
    public Byte getOrganizationAdmin() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>gamedata.organization_role.session_admin</code>.
     */
    public void setSessionAdmin(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.organization_role.session_admin</code>.
     */
    public Byte getSessionAdmin() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>gamedata.organization_role.result_reader</code>.
     */
    public void setResultReader(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.organization_role.result_reader</code>.
     */
    public Byte getResultReader() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>gamedata.organization_role.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.organization_role.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>gamedata.organization_role.organization_id</code>.
     */
    public void setOrganizationId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.organization_role.organization_id</code>.
     */
    public Integer getOrganizationId() {
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
    public Row6<Integer, Byte, Byte, Byte, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Byte, Byte, Byte, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return OrganizationRole.ORGANIZATION_ROLE.ID;
    }

    @Override
    public Field<Byte> field2() {
        return OrganizationRole.ORGANIZATION_ROLE.ORGANIZATION_ADMIN;
    }

    @Override
    public Field<Byte> field3() {
        return OrganizationRole.ORGANIZATION_ROLE.SESSION_ADMIN;
    }

    @Override
    public Field<Byte> field4() {
        return OrganizationRole.ORGANIZATION_ROLE.RESULT_READER;
    }

    @Override
    public Field<Integer> field5() {
        return OrganizationRole.ORGANIZATION_ROLE.USER_ID;
    }

    @Override
    public Field<Integer> field6() {
        return OrganizationRole.ORGANIZATION_ROLE.ORGANIZATION_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Byte component2() {
        return getOrganizationAdmin();
    }

    @Override
    public Byte component3() {
        return getSessionAdmin();
    }

    @Override
    public Byte component4() {
        return getResultReader();
    }

    @Override
    public Integer component5() {
        return getUserId();
    }

    @Override
    public Integer component6() {
        return getOrganizationId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Byte value2() {
        return getOrganizationAdmin();
    }

    @Override
    public Byte value3() {
        return getSessionAdmin();
    }

    @Override
    public Byte value4() {
        return getResultReader();
    }

    @Override
    public Integer value5() {
        return getUserId();
    }

    @Override
    public Integer value6() {
        return getOrganizationId();
    }

    @Override
    public OrganizationRoleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public OrganizationRoleRecord value2(Byte value) {
        setOrganizationAdmin(value);
        return this;
    }

    @Override
    public OrganizationRoleRecord value3(Byte value) {
        setSessionAdmin(value);
        return this;
    }

    @Override
    public OrganizationRoleRecord value4(Byte value) {
        setResultReader(value);
        return this;
    }

    @Override
    public OrganizationRoleRecord value5(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public OrganizationRoleRecord value6(Integer value) {
        setOrganizationId(value);
        return this;
    }

    @Override
    public OrganizationRoleRecord values(Integer value1, Byte value2, Byte value3, Byte value4, Integer value5, Integer value6) {
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
     * Create a detached OrganizationRoleRecord
     */
    public OrganizationRoleRecord() {
        super(OrganizationRole.ORGANIZATION_ROLE);
    }

    /**
     * Create a detached, initialised OrganizationRoleRecord
     */
    public OrganizationRoleRecord(Integer id, Byte organizationAdmin, Byte sessionAdmin, Byte resultReader, Integer userId, Integer organizationId) {
        super(OrganizationRole.ORGANIZATION_ROLE);

        setId(id);
        setOrganizationAdmin(organizationAdmin);
        setSessionAdmin(sessionAdmin);
        setResultReader(resultReader);
        setUserId(userId);
        setOrganizationId(organizationId);
        resetChangedOnNotNull();
    }
}