/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.Organization;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrganizationRecord extends UpdatableRecordImpl<OrganizationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.organization.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.organization.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.organization.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.organization.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.organization.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.organization.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.organization.logo</code>.
     */
    public void setLogo(byte[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.organization.logo</code>.
     */
    public byte[] getLogo() {
        return (byte[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrganizationRecord
     */
    public OrganizationRecord() {
        super(Organization.ORGANIZATION);
    }

    /**
     * Create a detached, initialised OrganizationRecord
     */
    public OrganizationRecord(Integer id, String code, String name, byte[] logo) {
        super(Organization.ORGANIZATION);

        setId(id);
        setCode(code);
        setName(name);
        setLogo(logo);
        resetChangedOnNotNull();
    }
}
