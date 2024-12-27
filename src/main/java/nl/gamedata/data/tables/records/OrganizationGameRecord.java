/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import nl.gamedata.data.tables.OrganizationGame;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrganizationGameRecord extends UpdatableRecordImpl<OrganizationGameRecord> implements Record6<Integer, String, Byte, Byte, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.organization_game.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.organization_game.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.organization_game.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.organization_game.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.organization_game.token_forced</code>.
     */
    public void setTokenForced(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.organization_game.token_forced</code>.
     */
    public Byte getTokenForced() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>gamedata.organization_game.anonymous_sessions</code>.
     */
    public void setAnonymousSessions(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.organization_game.anonymous_sessions</code>.
     */
    public Byte getAnonymousSessions() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>gamedata.organization_game.organization_id</code>.
     */
    public void setOrganizationId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.organization_game.organization_id</code>.
     */
    public Integer getOrganizationId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>gamedata.organization_game.game_id</code>.
     */
    public void setGameId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.organization_game.game_id</code>.
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
    public Row6<Integer, String, Byte, Byte, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, String, Byte, Byte, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return OrganizationGame.ORGANIZATION_GAME.ID;
    }

    @Override
    public Field<String> field2() {
        return OrganizationGame.ORGANIZATION_GAME.NAME;
    }

    @Override
    public Field<Byte> field3() {
        return OrganizationGame.ORGANIZATION_GAME.TOKEN_FORCED;
    }

    @Override
    public Field<Byte> field4() {
        return OrganizationGame.ORGANIZATION_GAME.ANONYMOUS_SESSIONS;
    }

    @Override
    public Field<Integer> field5() {
        return OrganizationGame.ORGANIZATION_GAME.ORGANIZATION_ID;
    }

    @Override
    public Field<Integer> field6() {
        return OrganizationGame.ORGANIZATION_GAME.GAME_ID;
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
    public Byte component3() {
        return getTokenForced();
    }

    @Override
    public Byte component4() {
        return getAnonymousSessions();
    }

    @Override
    public Integer component5() {
        return getOrganizationId();
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
    public Byte value3() {
        return getTokenForced();
    }

    @Override
    public Byte value4() {
        return getAnonymousSessions();
    }

    @Override
    public Integer value5() {
        return getOrganizationId();
    }

    @Override
    public Integer value6() {
        return getGameId();
    }

    @Override
    public OrganizationGameRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public OrganizationGameRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public OrganizationGameRecord value3(Byte value) {
        setTokenForced(value);
        return this;
    }

    @Override
    public OrganizationGameRecord value4(Byte value) {
        setAnonymousSessions(value);
        return this;
    }

    @Override
    public OrganizationGameRecord value5(Integer value) {
        setOrganizationId(value);
        return this;
    }

    @Override
    public OrganizationGameRecord value6(Integer value) {
        setGameId(value);
        return this;
    }

    @Override
    public OrganizationGameRecord values(Integer value1, String value2, Byte value3, Byte value4, Integer value5, Integer value6) {
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
     * Create a detached OrganizationGameRecord
     */
    public OrganizationGameRecord() {
        super(OrganizationGame.ORGANIZATION_GAME);
    }

    /**
     * Create a detached, initialised OrganizationGameRecord
     */
    public OrganizationGameRecord(Integer id, String name, Byte tokenForced, Byte anonymousSessions, Integer organizationId, Integer gameId) {
        super(OrganizationGame.ORGANIZATION_GAME);

        setId(id);
        setName(name);
        setTokenForced(tokenForced);
        setAnonymousSessions(anonymousSessions);
        setOrganizationId(organizationId);
        setGameId(gameId);
        resetChangedOnNotNull();
    }
}