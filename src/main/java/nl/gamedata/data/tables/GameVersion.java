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
import nl.gamedata.data.tables.records.GameVersionRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
public class GameVersion extends TableImpl<GameVersionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.game_version</code>
     */
    public static final GameVersion GAME_VERSION = new GameVersion();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GameVersionRecord> getRecordType() {
        return GameVersionRecord.class;
    }

    /**
     * The column <code>gamedata.game_version.id</code>.
     */
    public final TableField<GameVersionRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.game_version.name</code>.
     */
    public final TableField<GameVersionRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.game_version.game_id</code>.
     */
    public final TableField<GameVersionRecord, Integer> GAME_ID = createField(DSL.name("game_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private GameVersion(Name alias, Table<GameVersionRecord> aliased) {
        this(alias, aliased, null);
    }

    private GameVersion(Name alias, Table<GameVersionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.game_version</code> table reference
     */
    public GameVersion(String alias) {
        this(DSL.name(alias), GAME_VERSION);
    }

    /**
     * Create an aliased <code>gamedata.game_version</code> table reference
     */
    public GameVersion(Name alias) {
        this(alias, GAME_VERSION);
    }

    /**
     * Create a <code>gamedata.game_version</code> table reference
     */
    public GameVersion() {
        this(DSL.name("game_version"), null);
    }

    public <O extends Record> GameVersion(Table<O> child, ForeignKey<O, GameVersionRecord> key) {
        super(child, key, GAME_VERSION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.GAME_VERSION_FK_GAME_VERSION_GAME1_IDX);
    }

    @Override
    public Identity<GameVersionRecord, Integer> getIdentity() {
        return (Identity<GameVersionRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<GameVersionRecord> getPrimaryKey() {
        return Keys.KEY_GAME_VERSION_PRIMARY;
    }

    @Override
    public List<UniqueKey<GameVersionRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_GAME_VERSION_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<GameVersionRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_GAME_VERSION_GAME1);
    }

    private transient Game _game;

    /**
     * Get the implicit join path to the <code>gamedata.game</code> table.
     */
    public Game game() {
        if (_game == null)
            _game = new Game(this, Keys.FK_GAME_VERSION_GAME1);

        return _game;
    }

    @Override
    public GameVersion as(String alias) {
        return new GameVersion(DSL.name(alias), this);
    }

    @Override
    public GameVersion as(Name alias) {
        return new GameVersion(alias, this);
    }

    @Override
    public GameVersion as(Table<?> alias) {
        return new GameVersion(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public GameVersion rename(String name) {
        return new GameVersion(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GameVersion rename(Name name) {
        return new GameVersion(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public GameVersion rename(Table<?> name) {
        return new GameVersion(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Integer, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Integer, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
