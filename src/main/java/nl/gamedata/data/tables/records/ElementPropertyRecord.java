/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.ElementProperty;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ElementPropertyRecord extends UpdatableRecordImpl<ElementPropertyRecord> implements Record6<Integer, String, String, String, String, Integer> {

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
     * Setter for <code>gamedata.element_property.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.element_property.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.element_property.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.element_property.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.element_property.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.element_property.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>gamedata.element_property.type</code>.
     */
    public void setType(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.element_property.type</code>.
     */
    public String getType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>gamedata.element_property.dashboard_element_id</code>.
     */
    public void setDashboardElementId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.element_property.dashboard_element_id</code>.
     */
    public Integer getDashboardElementId() {
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
    public Row6<Integer, String, String, String, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, String, String, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ElementProperty.ELEMENT_PROPERTY.ID;
    }

    @Override
    public Field<String> field2() {
        return ElementProperty.ELEMENT_PROPERTY.CODE;
    }

    @Override
    public Field<String> field3() {
        return ElementProperty.ELEMENT_PROPERTY.NAME;
    }

    @Override
    public Field<String> field4() {
        return ElementProperty.ELEMENT_PROPERTY.DESCRIPTION;
    }

    @Override
    public Field<String> field5() {
        return ElementProperty.ELEMENT_PROPERTY.TYPE;
    }

    @Override
    public Field<Integer> field6() {
        return ElementProperty.ELEMENT_PROPERTY.DASHBOARD_ELEMENT_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public String component5() {
        return getType();
    }

    @Override
    public Integer component6() {
        return getDashboardElementId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public String value5() {
        return getType();
    }

    @Override
    public Integer value6() {
        return getDashboardElementId();
    }

    @Override
    public ElementPropertyRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ElementPropertyRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public ElementPropertyRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public ElementPropertyRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public ElementPropertyRecord value5(String value) {
        setType(value);
        return this;
    }

    @Override
    public ElementPropertyRecord value6(Integer value) {
        setDashboardElementId(value);
        return this;
    }

    @Override
    public ElementPropertyRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6) {
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
     * Create a detached ElementPropertyRecord
     */
    public ElementPropertyRecord() {
        super(ElementProperty.ELEMENT_PROPERTY);
    }

    /**
     * Create a detached, initialised ElementPropertyRecord
     */
    public ElementPropertyRecord(Integer id, String code, String name, String description, String type, Integer dashboardElementId) {
        super(ElementProperty.ELEMENT_PROPERTY);

        setId(id);
        setCode(code);
        setName(name);
        setDescription(description);
        setType(type);
        setDashboardElementId(dashboardElementId);
        resetChangedOnNotNull();
    }
}
