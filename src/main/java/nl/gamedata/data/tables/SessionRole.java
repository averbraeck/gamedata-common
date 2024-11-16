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
import nl.gamedata.data.tables.records.SessionRoleRecord;

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
public class SessionRole extends TableImpl<SessionRoleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.session_role</code>
     */
    public static final SessionRole SESSION_ROLE = new SessionRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionRoleRecord> getRecordType() {
        return SessionRoleRecord.class;
    }

    /**
     * The column <code>gamedata.session_role.id</code>.
     */
    public final TableField<SessionRoleRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.session_role.session_admin</code>.
     */
    public final TableField<SessionRoleRecord, Byte> SESSION_ADMIN = createField(DSL.name("session_admin"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>gamedata.session_role.result_reader</code>.
     */
    public final TableField<SessionRoleRecord, Byte> RESULT_READER = createField(DSL.name("result_reader"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>gamedata.session_role.game_session_id</code>.
     */
    public final TableField<SessionRoleRecord, Integer> GAME_SESSION_ID = createField(DSL.name("game_session_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gamedata.session_role.user_id</code>.
     */
    public final TableField<SessionRoleRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private SessionRole(Name alias, Table<SessionRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private SessionRole(Name alias, Table<SessionRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.session_role</code> table reference
     */
    public SessionRole(String alias) {
        this(DSL.name(alias), SESSION_ROLE);
    }

    /**
     * Create an aliased <code>gamedata.session_role</code> table reference
     */
    public SessionRole(Name alias) {
        this(alias, SESSION_ROLE);
    }

    /**
     * Create a <code>gamedata.session_role</code> table reference
     */
    public SessionRole() {
        this(DSL.name("session_role"), null);
    }

    public <O extends Record> SessionRole(Table<O> child, ForeignKey<O, SessionRoleRecord> key) {
        super(child, key, SESSION_ROLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.SESSION_ROLE_FK_SESSION_ROLE_GAME_SESSION1_IDX, Indexes.SESSION_ROLE_FK_SESSION_ROLE_USER1_IDX);
    }

    @Override
    public Identity<SessionRoleRecord, Integer> getIdentity() {
        return (Identity<SessionRoleRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<SessionRoleRecord> getPrimaryKey() {
        return Keys.KEY_SESSION_ROLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<SessionRoleRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_SESSION_ROLE_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<SessionRoleRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_SESSION_ROLE_GAME_SESSION1, Keys.FK_SESSION_ROLE_USER1);
    }

    private transient GameSession _gameSession;
    private transient User _user;

    /**
     * Get the implicit join path to the <code>gamedata.game_session</code>
     * table.
     */
    public GameSession gameSession() {
        if (_gameSession == null)
            _gameSession = new GameSession(this, Keys.FK_SESSION_ROLE_GAME_SESSION1);

        return _gameSession;
    }

    /**
     * Get the implicit join path to the <code>gamedata.user</code> table.
     */
    public User user() {
        if (_user == null)
            _user = new User(this, Keys.FK_SESSION_ROLE_USER1);

        return _user;
    }

    @Override
    public SessionRole as(String alias) {
        return new SessionRole(DSL.name(alias), this);
    }

    @Override
    public SessionRole as(Name alias) {
        return new SessionRole(alias, this);
    }

    @Override
    public SessionRole as(Table<?> alias) {
        return new SessionRole(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionRole rename(String name) {
        return new SessionRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionRole rename(Name name) {
        return new SessionRole(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionRole rename(Table<?> name) {
        return new SessionRole(name.getQualifiedName(), null);
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
