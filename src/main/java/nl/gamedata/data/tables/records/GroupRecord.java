/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.Group;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupRecord extends UpdatableRecordImpl<GroupRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.group.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.group.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.group.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.group.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.group.gamesession_id</code>.
     */
    public void setGamesessionId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.group.gamesession_id</code>.
     */
    public Integer getGamesessionId() {
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
        return Group.GROUP.ID;
    }

    @Override
    public Field<String> field2() {
        return Group.GROUP.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return Group.GROUP.GAMESESSION_ID;
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
        return getGamesessionId();
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
        return getGamesessionId();
    }

    @Override
    public GroupRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GroupRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GroupRecord value3(Integer value) {
        setGamesessionId(value);
        return this;
    }

    @Override
    public GroupRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GroupRecord
     */
    public GroupRecord() {
        super(Group.GROUP);
    }

    /**
     * Create a detached, initialised GroupRecord
     */
    public GroupRecord(Integer id, String name, Integer gamesessionId) {
        super(Group.GROUP);

        setId(id);
        setName(name);
        setGamesessionId(gamesessionId);
        resetChangedOnNotNull();
    }
}
