/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.GameToken;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GameTokenRecord extends UpdatableRecordImpl<GameTokenRecord> implements Record6<Integer, String, String, Byte, Byte, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.game_token.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.game_token.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.game_token.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.game_token.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.game_token.value</code>.
     */
    public void setValue(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.game_token.value</code>.
     */
    public String getValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>gamedata.game_token.data_writer</code>.
     */
    public void setDataWriter(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.game_token.data_writer</code>.
     */
    public Byte getDataWriter() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>gamedata.game_token.result_reader</code>.
     */
    public void setResultReader(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.game_token.result_reader</code>.
     */
    public Byte getResultReader() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>gamedata.game_token.game_id</code>.
     */
    public void setGameId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.game_token.game_id</code>.
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, Byte, Byte, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, String, Byte, Byte, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GameToken.GAME_TOKEN.ID;
    }

    @Override
    public Field<String> field2() {
        return GameToken.GAME_TOKEN.NAME;
    }

    @Override
    public Field<String> field3() {
        return GameToken.GAME_TOKEN.VALUE;
    }

    @Override
    public Field<Byte> field4() {
        return GameToken.GAME_TOKEN.DATA_WRITER;
    }

    @Override
    public Field<Byte> field5() {
        return GameToken.GAME_TOKEN.RESULT_READER;
    }

    @Override
    public Field<Integer> field6() {
        return GameToken.GAME_TOKEN.GAME_ID;
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
    public String component3() {
        return getValue();
    }

    @Override
    public Byte component4() {
        return getDataWriter();
    }

    @Override
    public Byte component5() {
        return getResultReader();
    }

    @Override
    public Integer component6() {
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
    public String value3() {
        return getValue();
    }

    @Override
    public Byte value4() {
        return getDataWriter();
    }

    @Override
    public Byte value5() {
        return getResultReader();
    }

    @Override
    public Integer value6() {
        return getGameId();
    }

    @Override
    public GameTokenRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GameTokenRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public GameTokenRecord value3(String value) {
        setValue(value);
        return this;
    }

    @Override
    public GameTokenRecord value4(Byte value) {
        setDataWriter(value);
        return this;
    }

    @Override
    public GameTokenRecord value5(Byte value) {
        setResultReader(value);
        return this;
    }

    @Override
    public GameTokenRecord value6(Integer value) {
        setGameId(value);
        return this;
    }

    @Override
    public GameTokenRecord values(Integer value1, String value2, String value3, Byte value4, Byte value5, Integer value6) {
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
     * Create a detached GameTokenRecord
     */
    public GameTokenRecord() {
        super(GameToken.GAME_TOKEN);
    }

    /**
     * Create a detached, initialised GameTokenRecord
     */
    public GameTokenRecord(Integer id, String name, String value, Byte dataWriter, Byte resultReader, Integer gameId) {
        super(GameToken.GAME_TOKEN);

        setId(id);
        setName(name);
        setValue(value);
        setDataWriter(dataWriter);
        setResultReader(resultReader);
        setGameId(gameId);
        resetChangedOnNotNull();
    }
}