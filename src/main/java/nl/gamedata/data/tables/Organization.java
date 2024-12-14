/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.gamedata.data.Gamedata;
import nl.gamedata.data.Keys;
import nl.gamedata.data.tables.records.OrganizationRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Organization extends TableImpl<OrganizationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.organization</code>
     */
    public static final Organization ORGANIZATION = new Organization();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrganizationRecord> getRecordType() {
        return OrganizationRecord.class;
    }

    /**
     * The column <code>gamedata.organization.id</code>.
     */
    public final TableField<OrganizationRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.organization.code</code>.
     */
    public final TableField<OrganizationRecord, String> CODE = createField(DSL.name("code"), SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>gamedata.organization.name</code>.
     */
    public final TableField<OrganizationRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.organization.logo</code>.
     */
    public final TableField<OrganizationRecord, byte[]> LOGO = createField(DSL.name("logo"), SQLDataType.BLOB.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.BLOB)), this, "");

    private Organization(Name alias, Table<OrganizationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Organization(Name alias, Table<OrganizationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.organization</code> table reference
     */
    public Organization(String alias) {
        this(DSL.name(alias), ORGANIZATION);
    }

    /**
     * Create an aliased <code>gamedata.organization</code> table reference
     */
    public Organization(Name alias) {
        this(alias, ORGANIZATION);
    }

    /**
     * Create a <code>gamedata.organization</code> table reference
     */
    public Organization() {
        this(DSL.name("organization"), null);
    }

    public <O extends Record> Organization(Table<O> child, ForeignKey<O, OrganizationRecord> key) {
        super(child, key, ORGANIZATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public Identity<OrganizationRecord, Integer> getIdentity() {
        return (Identity<OrganizationRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<OrganizationRecord> getPrimaryKey() {
        return Keys.KEY_ORGANIZATION_PRIMARY;
    }

    @Override
    public List<UniqueKey<OrganizationRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_ORGANIZATION_ID_UNIQUE, Keys.KEY_ORGANIZATION_CODE_UNIQUE);
    }

    @Override
    public Organization as(String alias) {
        return new Organization(DSL.name(alias), this);
    }

    @Override
    public Organization as(Name alias) {
        return new Organization(alias, this);
    }

    @Override
    public Organization as(Table<?> alias) {
        return new Organization(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Organization rename(String name) {
        return new Organization(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Organization rename(Name name) {
        return new Organization(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Organization rename(Table<?> name) {
        return new Organization(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, byte[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super String, ? super byte[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super String, ? super byte[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
