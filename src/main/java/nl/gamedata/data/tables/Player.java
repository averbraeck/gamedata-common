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
import nl.gamedata.data.tables.records.PlayerRecord;

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
public class Player extends TableImpl<PlayerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.player</code>
     */
    public static final Player PLAYER = new Player();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PlayerRecord> getRecordType() {
        return PlayerRecord.class;
    }

    /**
     * The column <code>gamedata.player.id</code>.
     */
    public final TableField<PlayerRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.player.name</code>.
     */
    public final TableField<PlayerRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>gamedata.player.display_name</code>.
     */
    public final TableField<PlayerRecord, String> DISPLAY_NAME = createField(DSL.name("display_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.player.game_session_id</code>.
     */
    public final TableField<PlayerRecord, Integer> GAME_SESSION_ID = createField(DSL.name("game_session_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gamedata.player.group_role_id</code>.
     */
    public final TableField<PlayerRecord, Integer> GROUP_ROLE_ID = createField(DSL.name("group_role_id"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    private Player(Name alias, Table<PlayerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Player(Name alias, Table<PlayerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.player</code> table reference
     */
    public Player(String alias) {
        this(DSL.name(alias), PLAYER);
    }

    /**
     * Create an aliased <code>gamedata.player</code> table reference
     */
    public Player(Name alias) {
        this(alias, PLAYER);
    }

    /**
     * Create a <code>gamedata.player</code> table reference
     */
    public Player() {
        this(DSL.name("player"), null);
    }

    public <O extends Record> Player(Table<O> child, ForeignKey<O, PlayerRecord> key) {
        super(child, key, PLAYER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PLAYER_FK_PLAYER_GAME_SESSION1_IDX, Indexes.PLAYER_FK_PLAYER_GROUP_ROLE1_IDX);
    }

    @Override
    public Identity<PlayerRecord, Integer> getIdentity() {
        return (Identity<PlayerRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<PlayerRecord> getPrimaryKey() {
        return Keys.KEY_PLAYER_PRIMARY;
    }

    @Override
    public List<UniqueKey<PlayerRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_PLAYER_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<PlayerRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_PLAYER_GAME_SESSION1, Keys.FK_PLAYER_GROUP_ROLE1);
    }

    private transient GameSession _gameSession;
    private transient GroupRole _groupRole;

    /**
     * Get the implicit join path to the <code>gamedata.game_session</code>
     * table.
     */
    public GameSession gameSession() {
        if (_gameSession == null)
            _gameSession = new GameSession(this, Keys.FK_PLAYER_GAME_SESSION1);

        return _gameSession;
    }

    /**
     * Get the implicit join path to the <code>gamedata.group_role</code> table.
     */
    public GroupRole groupRole() {
        if (_groupRole == null)
            _groupRole = new GroupRole(this, Keys.FK_PLAYER_GROUP_ROLE1);

        return _groupRole;
    }

    @Override
    public Player as(String alias) {
        return new Player(DSL.name(alias), this);
    }

    @Override
    public Player as(Name alias) {
        return new Player(alias, this);
    }

    @Override
    public Player as(Table<?> alias) {
        return new Player(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Player rename(String name) {
        return new Player(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Player rename(Name name) {
        return new Player(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Player rename(Table<?> name) {
        return new Player(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super Integer, ? super String, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super Integer, ? super String, ? super String, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
