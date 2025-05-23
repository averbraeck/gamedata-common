/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.gamedata.data.Gamedata;
import nl.gamedata.data.Indexes;
import nl.gamedata.data.Keys;
import nl.gamedata.data.tables.records.OrganizationRoleRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
public class OrganizationRole extends TableImpl<OrganizationRoleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.organization_role</code>
     */
    public static final OrganizationRole ORGANIZATION_ROLE = new OrganizationRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrganizationRoleRecord> getRecordType() {
        return OrganizationRoleRecord.class;
    }

    /**
     * The column <code>gamedata.organization_role.id</code>.
     */
    public final TableField<OrganizationRoleRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.organization_role.view</code>.
     */
    public final TableField<OrganizationRoleRecord, Byte> VIEW = createField(DSL.name("view"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>gamedata.organization_role.edit</code>.
     */
    public final TableField<OrganizationRoleRecord, Byte> EDIT = createField(DSL.name("edit"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>gamedata.organization_role.admin</code>.
     */
    public final TableField<OrganizationRoleRecord, Byte> ADMIN = createField(DSL.name("admin"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>gamedata.organization_role.user_id</code>.
     */
    public final TableField<OrganizationRoleRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gamedata.organization_role.organization_id</code>.
     */
    public final TableField<OrganizationRoleRecord, Integer> ORGANIZATION_ID = createField(DSL.name("organization_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private OrganizationRole(Name alias, Table<OrganizationRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrganizationRole(Name alias, Table<OrganizationRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.organization_role</code> table reference
     */
    public OrganizationRole(String alias) {
        this(DSL.name(alias), ORGANIZATION_ROLE);
    }

    /**
     * Create an aliased <code>gamedata.organization_role</code> table reference
     */
    public OrganizationRole(Name alias) {
        this(alias, ORGANIZATION_ROLE);
    }

    /**
     * Create a <code>gamedata.organization_role</code> table reference
     */
    public OrganizationRole() {
        this(DSL.name("organization_role"), null);
    }

    public <O extends Record> OrganizationRole(Table<O> child, ForeignKey<O, OrganizationRoleRecord> key) {
        super(child, key, ORGANIZATION_ROLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.ORGANIZATION_ROLE_FK_ORGANIZATION_ROLE_ORGANIZATION1_IDX, Indexes.ORGANIZATION_ROLE_FK_ORGANIZATION_ROLE_USER1_IDX);
    }

    @Override
    public Identity<OrganizationRoleRecord, Integer> getIdentity() {
        return (Identity<OrganizationRoleRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<OrganizationRoleRecord> getPrimaryKey() {
        return Keys.KEY_ORGANIZATION_ROLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<OrganizationRoleRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_ORGANIZATION_ROLE_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<OrganizationRoleRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_ORGANIZATION_ROLE_USER1, Keys.FK_ORGANIZATION_ROLE_ORGANIZATION1);
    }

    private transient User _user;
    private transient Organization _organization;

    /**
     * Get the implicit join path to the <code>gamedata.user</code> table.
     */
    public User user() {
        if (_user == null)
            _user = new User(this, Keys.FK_ORGANIZATION_ROLE_USER1);

        return _user;
    }

    /**
     * Get the implicit join path to the <code>gamedata.organization</code>
     * table.
     */
    public Organization organization() {
        if (_organization == null)
            _organization = new Organization(this, Keys.FK_ORGANIZATION_ROLE_ORGANIZATION1);

        return _organization;
    }

    @Override
    public OrganizationRole as(String alias) {
        return new OrganizationRole(DSL.name(alias), this);
    }

    @Override
    public OrganizationRole as(Name alias) {
        return new OrganizationRole(alias, this);
    }

    @Override
    public OrganizationRole as(Table<?> alias) {
        return new OrganizationRole(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrganizationRole rename(String name) {
        return new OrganizationRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrganizationRole rename(Name name) {
        return new OrganizationRole(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrganizationRole rename(Table<?> name) {
        return new OrganizationRole(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Byte, Byte, Byte, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super Byte, ? super Byte, ? super Byte, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super Byte, ? super Byte, ? super Byte, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
