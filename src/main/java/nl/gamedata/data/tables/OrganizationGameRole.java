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
import nl.gamedata.data.tables.records.OrganizationGameRoleRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
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
public class OrganizationGameRole extends TableImpl<OrganizationGameRoleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.organization_game_role</code>
     */
    public static final OrganizationGameRole ORGANIZATION_GAME_ROLE = new OrganizationGameRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrganizationGameRoleRecord> getRecordType() {
        return OrganizationGameRoleRecord.class;
    }

    /**
     * The column <code>gamedata.organization_game_role.id</code>.
     */
    public final TableField<OrganizationGameRoleRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.organization_game_role.view</code>.
     */
    public final TableField<OrganizationGameRoleRecord, Byte> VIEW = createField(DSL.name("view"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>gamedata.organization_game_role.edit</code>.
     */
    public final TableField<OrganizationGameRoleRecord, Byte> EDIT = createField(DSL.name("edit"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>gamedata.organization_game_role.user_id</code>.
     */
    public final TableField<OrganizationGameRoleRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column
     * <code>gamedata.organization_game_role.organization_game_id</code>.
     */
    public final TableField<OrganizationGameRoleRecord, Integer> ORGANIZATION_GAME_ID = createField(DSL.name("organization_game_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private OrganizationGameRole(Name alias, Table<OrganizationGameRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrganizationGameRole(Name alias, Table<OrganizationGameRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.organization_game_role</code> table
     * reference
     */
    public OrganizationGameRole(String alias) {
        this(DSL.name(alias), ORGANIZATION_GAME_ROLE);
    }

    /**
     * Create an aliased <code>gamedata.organization_game_role</code> table
     * reference
     */
    public OrganizationGameRole(Name alias) {
        this(alias, ORGANIZATION_GAME_ROLE);
    }

    /**
     * Create a <code>gamedata.organization_game_role</code> table reference
     */
    public OrganizationGameRole() {
        this(DSL.name("organization_game_role"), null);
    }

    public <O extends Record> OrganizationGameRole(Table<O> child, ForeignKey<O, OrganizationGameRoleRecord> key) {
        super(child, key, ORGANIZATION_GAME_ROLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.ORGANIZATION_GAME_ROLE_FK_ORGANIZATION_GAME_ROLE_ORGANIZATION_GAME1_IDX, Indexes.ORGANIZATION_GAME_ROLE_FK_USER_ROLE_USER1_IDX);
    }

    @Override
    public Identity<OrganizationGameRoleRecord, Integer> getIdentity() {
        return (Identity<OrganizationGameRoleRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<OrganizationGameRoleRecord> getPrimaryKey() {
        return Keys.KEY_ORGANIZATION_GAME_ROLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<OrganizationGameRoleRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_ORGANIZATION_GAME_ROLE_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<OrganizationGameRoleRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_USER_ROLE_USER1, Keys.FK_ORGANIZATION_GAME_ROLE_ORGANIZATION_GAME1);
    }

    private transient User _user;
    private transient OrganizationGame _organizationGame;

    /**
     * Get the implicit join path to the <code>gamedata.user</code> table.
     */
    public User user() {
        if (_user == null)
            _user = new User(this, Keys.FK_USER_ROLE_USER1);

        return _user;
    }

    /**
     * Get the implicit join path to the <code>gamedata.organization_game</code>
     * table.
     */
    public OrganizationGame organizationGame() {
        if (_organizationGame == null)
            _organizationGame = new OrganizationGame(this, Keys.FK_ORGANIZATION_GAME_ROLE_ORGANIZATION_GAME1);

        return _organizationGame;
    }

    @Override
    public OrganizationGameRole as(String alias) {
        return new OrganizationGameRole(DSL.name(alias), this);
    }

    @Override
    public OrganizationGameRole as(Name alias) {
        return new OrganizationGameRole(alias, this);
    }

    @Override
    public OrganizationGameRole as(Table<?> alias) {
        return new OrganizationGameRole(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrganizationGameRole rename(String name) {
        return new OrganizationGameRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrganizationGameRole rename(Name name) {
        return new OrganizationGameRole(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrganizationGameRole rename(Table<?> name) {
        return new OrganizationGameRole(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Byte, Byte, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Integer, ? super Byte, ? super Byte, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Integer, ? super Byte, ? super Byte, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
