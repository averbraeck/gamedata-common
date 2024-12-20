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
import nl.gamedata.data.tables.records.GameAccessRecord;

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
public class GameAccess extends TableImpl<GameAccessRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.game_access</code>
     */
    public static final GameAccess GAME_ACCESS = new GameAccess();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GameAccessRecord> getRecordType() {
        return GameAccessRecord.class;
    }

    /**
     * The column <code>gamedata.game_access.id</code>.
     */
    public final TableField<GameAccessRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.game_access.name</code>.
     */
    public final TableField<GameAccessRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.game_access.token_forced</code>.
     */
    public final TableField<GameAccessRecord, Byte> TOKEN_FORCED = createField(DSL.name("token_forced"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>gamedata.game_access.anonymous_sessions</code>.
     */
    public final TableField<GameAccessRecord, Byte> ANONYMOUS_SESSIONS = createField(DSL.name("anonymous_sessions"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>gamedata.game_access.game_id</code>.
     */
    public final TableField<GameAccessRecord, Integer> GAME_ID = createField(DSL.name("game_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gamedata.game_access.organization_id</code>.
     */
    public final TableField<GameAccessRecord, Integer> ORGANIZATION_ID = createField(DSL.name("organization_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private GameAccess(Name alias, Table<GameAccessRecord> aliased) {
        this(alias, aliased, null);
    }

    private GameAccess(Name alias, Table<GameAccessRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.game_access</code> table reference
     */
    public GameAccess(String alias) {
        this(DSL.name(alias), GAME_ACCESS);
    }

    /**
     * Create an aliased <code>gamedata.game_access</code> table reference
     */
    public GameAccess(Name alias) {
        this(alias, GAME_ACCESS);
    }

    /**
     * Create a <code>gamedata.game_access</code> table reference
     */
    public GameAccess() {
        this(DSL.name("game_access"), null);
    }

    public <O extends Record> GameAccess(Table<O> child, ForeignKey<O, GameAccessRecord> key) {
        super(child, key, GAME_ACCESS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.GAME_ACCESS_FK_GAME_ACCESS_GAME1_IDX, Indexes.GAME_ACCESS_FK_GAME_ACCESS_ORGANIZATION1_IDX);
    }

    @Override
    public Identity<GameAccessRecord, Integer> getIdentity() {
        return (Identity<GameAccessRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<GameAccessRecord> getPrimaryKey() {
        return Keys.KEY_GAME_ACCESS_PRIMARY;
    }

    @Override
    public List<UniqueKey<GameAccessRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_GAME_ACCESS_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<GameAccessRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_GAME_ACCESS_GAME1, Keys.FK_GAME_ACCESS_ORGANIZATION1);
    }

    private transient Game _game;
    private transient Organization _organization;

    /**
     * Get the implicit join path to the <code>gamedata.game</code> table.
     */
    public Game game() {
        if (_game == null)
            _game = new Game(this, Keys.FK_GAME_ACCESS_GAME1);

        return _game;
    }

    /**
     * Get the implicit join path to the <code>gamedata.organization</code>
     * table.
     */
    public Organization organization() {
        if (_organization == null)
            _organization = new Organization(this, Keys.FK_GAME_ACCESS_ORGANIZATION1);

        return _organization;
    }

    @Override
    public GameAccess as(String alias) {
        return new GameAccess(DSL.name(alias), this);
    }

    @Override
    public GameAccess as(Name alias) {
        return new GameAccess(alias, this);
    }

    @Override
    public GameAccess as(Table<?> alias) {
        return new GameAccess(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public GameAccess rename(String name) {
        return new GameAccess(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GameAccess rename(Name name) {
        return new GameAccess(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public GameAccess rename(Table<?> name) {
        return new GameAccess(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, Byte, Byte, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super String, ? super Byte, ? super Byte, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super String, ? super Byte, ? super Byte, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
