/*
 * This file is generated by jOOQ.
 */
package nl.tudelft.simulation.housinggame.data.tables.records;


import java.time.LocalDate;

import nl.tudelft.simulation.housinggame.data.tables.GameSession;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GameSessionRecord extends UpdatableRecordImpl<GameSessionRecord> implements Record4<Integer, String, LocalDate, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.game_session.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.game_session.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.game_session.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.game_session.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.game_session.date</code>.
     */
    public void setDate(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.game_session.date</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>gamedata.game_session.game_id</code>.
     */
    public void setGameId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.game_session.game_id</code>.
     */
    public Integer getGameId() {
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
    public Row4<Integer, String, LocalDate, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, LocalDate, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GameSession.GAME_SESSION.ID;
    }

    @Override
    public Field<String> field2() {
        return GameSession.GAME_SESSION.NAME;
    }

    @Override
    public Field<LocalDate> field3() {
        return GameSession.GAME_SESSION.DATE;
    }

    @Override
    public Field<Integer> field4() {
        return GameSession.GAME_SESSION.GAME_ID;
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
    public LocalDate component3() {
        return getDate();
    }

    @Override
    public Integer component4() {
        return getGameId();
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
    public LocalDate value3() {
        return getDate();
    }

    @Override
    public Integer value4() {
        return getGameId();
    }

    @Override
    public GameSessionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GameSessionRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GameSessionRecord value3(LocalDate value) {
        setDate(value);
        return this;
    }

    @Override
    public GameSessionRecord value4(Integer value) {
        setGameId(value);
        return this;
    }

    @Override
    public GameSessionRecord values(Integer value1, String value2, LocalDate value3, Integer value4) {
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
     * Create a detached GameSessionRecord
     */
    public GameSessionRecord() {
        super(GameSession.GAME_SESSION);
    }

    /**
     * Create a detached, initialised GameSessionRecord
     */
    public GameSessionRecord(Integer id, String name, LocalDate date, Integer gameId) {
        super(GameSession.GAME_SESSION);

        setId(id);
        setName(name);
        setDate(date);
        setGameId(gameId);
        resetChangedOnNotNull();
    }
}
