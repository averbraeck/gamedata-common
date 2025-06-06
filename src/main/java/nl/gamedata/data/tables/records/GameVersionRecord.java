/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.GameVersion;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GameVersionRecord extends UpdatableRecordImpl<GameVersionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.game_version.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.game_version.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.game_version.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.game_version.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.game_version.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.game_version.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.game_version.description</code>.
     */
    public void setDescription(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.game_version.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>gamedata.game_version.archived</code>.
     */
    public void setArchived(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.game_version.archived</code>.
     */
    public Byte getArchived() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>gamedata.game_version.game_id</code>.
     */
    public void setGameId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.game_version.game_id</code>.
     */
    public Integer getGameId() {
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GameVersionRecord
     */
    public GameVersionRecord() {
        super(GameVersion.GAME_VERSION);
    }

    /**
     * Create a detached, initialised GameVersionRecord
     */
    public GameVersionRecord(Integer id, String code, String name, String description, Byte archived, Integer gameId) {
        super(GameVersion.GAME_VERSION);

        setId(id);
        setCode(code);
        setName(name);
        setDescription(description);
        setArchived(archived);
        setGameId(gameId);
        resetChangedOnNotNull();
    }
}
