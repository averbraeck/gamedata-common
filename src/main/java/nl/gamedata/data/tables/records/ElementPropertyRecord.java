/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.ElementProperty;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ElementPropertyRecord extends UpdatableRecordImpl<ElementPropertyRecord> implements Record4<Integer, String, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.element_property.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.element_property.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.element_property.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.element_property.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.element_property.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.element_property.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.element_property.dashboard_element_id</code>.
     */
    public void setDashboardElementId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.element_property.dashboard_element_id</code>.
     */
    public Integer getDashboardElementId() {
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
        return ElementProperty.ELEMENT_PROPERTY.ID;
    }

    @Override
    public Field<String> field2() {
        return ElementProperty.ELEMENT_PROPERTY.NAME;
    }

    @Override
    public Field<String> field3() {
        return ElementProperty.ELEMENT_PROPERTY.TYPE;
    }

    @Override
    public Field<Integer> field4() {
        return ElementProperty.ELEMENT_PROPERTY.DASHBOARD_ELEMENT_ID;
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
    public String component3() {
        return getType();
    }

    @Override
    public Integer component4() {
        return getDashboardElementId();
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
    public String value3() {
        return getType();
    }

    @Override
    public Integer value4() {
        return getDashboardElementId();
    }

    @Override
    public ElementPropertyRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ElementPropertyRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ElementPropertyRecord value3(String value) {
        setType(value);
        return this;
    }

    @Override
    public ElementPropertyRecord value4(Integer value) {
        setDashboardElementId(value);
        return this;
    }

    @Override
    public ElementPropertyRecord values(Integer value1, String value2, String value3, Integer value4) {
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
     * Create a detached ElementPropertyRecord
     */
    public ElementPropertyRecord() {
        super(ElementProperty.ELEMENT_PROPERTY);
    }

    /**
     * Create a detached, initialised ElementPropertyRecord
     */
    public ElementPropertyRecord(Integer id, String name, String type, Integer dashboardElementId) {
        super(ElementProperty.ELEMENT_PROPERTY);

        setId(id);
        setName(name);
        setType(type);
        setDashboardElementId(dashboardElementId);
        resetChangedOnNotNull();
    }
}