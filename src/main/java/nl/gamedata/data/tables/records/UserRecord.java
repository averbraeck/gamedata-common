/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.User;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.user.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.user.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.user.email</code>.
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.user.email</code>.
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.user.password</code>.
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.user.password</code>.
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>gamedata.user.salt</code>.
     */
    public void setSalt(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.user.salt</code>.
     */
    public String getSalt() {
        return (String) get(4);
    }

    /**
     * Setter for <code>gamedata.user.super_admin</code>.
     */
    public void setSuperAdmin(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.user.super_admin</code>.
     */
    public Byte getSuperAdmin() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>gamedata.user.game_admin</code>.
     */
    public void setGameAdmin(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>gamedata.user.game_admin</code>.
     */
    public Byte getGameAdmin() {
        return (Byte) get(6);
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
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer id, String name, String email, String password, String salt, Byte superAdmin, Byte gameAdmin) {
        super(User.USER);

        setId(id);
        setName(name);
        setEmail(email);
        setPassword(password);
        setSalt(salt);
        setSuperAdmin(superAdmin);
        setGameAdmin(gameAdmin);
        resetChangedOnNotNull();
    }
}
