/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables.records;


import java.time.LocalDateTime;

import nl.gamedata.data.tables.GroupScore;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupScoreRecord extends UpdatableRecordImpl<GroupScoreRecord> implements Record11<Integer, String, Double, Double, LocalDateTime, Integer, Byte, String, String, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>gamedata.group_score.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gamedata.group_score.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gamedata.group_score.score_type</code>.
     */
    public void setScoreType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gamedata.group_score.score_type</code>.
     */
    public String getScoreType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gamedata.group_score.delta</code>.
     */
    public void setDelta(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>gamedata.group_score.delta</code>.
     */
    public Double getDelta() {
        return (Double) get(2);
    }

    /**
     * Setter for <code>gamedata.group_score.new_score</code>.
     */
    public void setNewScore(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>gamedata.group_score.new_score</code>.
     */
    public Double getNewScore() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>gamedata.group_score.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>gamedata.group_score.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>gamedata.group_score.mission_attempt</code>.
     */
    public void setMissionAttempt(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>gamedata.group_score.mission_attempt</code>.
     */
    public Integer getMissionAttempt() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>gamedata.group_score.final_score</code>.
     */
    public void setFinalScore(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>gamedata.group_score.final_score</code>.
     */
    public Byte getFinalScore() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>gamedata.group_score.status</code>.
     */
    public void setStatus(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>gamedata.group_score.status</code>.
     */
    public String getStatus() {
        return (String) get(7);
    }

    /**
     * Setter for <code>gamedata.group_score.round</code>.
     */
    public void setRound(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>gamedata.group_score.round</code>.
     */
    public String getRound() {
        return (String) get(8);
    }

    /**
     * Setter for <code>gamedata.group_score.game_time</code>.
     */
    public void setGameTime(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>gamedata.group_score.game_time</code>.
     */
    public String getGameTime() {
        return (String) get(9);
    }

    /**
     * Setter for <code>gamedata.group_score.group_id</code>.
     */
    public void setGroupId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>gamedata.group_score.group_id</code>.
     */
    public Integer getGroupId() {
        return (Integer) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, Double, Double, LocalDateTime, Integer, Byte, String, String, String, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, String, Double, Double, LocalDateTime, Integer, Byte, String, String, String, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GroupScore.GROUP_SCORE.ID;
    }

    @Override
    public Field<String> field2() {
        return GroupScore.GROUP_SCORE.SCORE_TYPE;
    }

    @Override
    public Field<Double> field3() {
        return GroupScore.GROUP_SCORE.DELTA;
    }

    @Override
    public Field<Double> field4() {
        return GroupScore.GROUP_SCORE.NEW_SCORE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return GroupScore.GROUP_SCORE.TIMESTAMP;
    }

    @Override
    public Field<Integer> field6() {
        return GroupScore.GROUP_SCORE.MISSION_ATTEMPT;
    }

    @Override
    public Field<Byte> field7() {
        return GroupScore.GROUP_SCORE.FINAL_SCORE;
    }

    @Override
    public Field<String> field8() {
        return GroupScore.GROUP_SCORE.STATUS;
    }

    @Override
    public Field<String> field9() {
        return GroupScore.GROUP_SCORE.ROUND;
    }

    @Override
    public Field<String> field10() {
        return GroupScore.GROUP_SCORE.GAME_TIME;
    }

    @Override
    public Field<Integer> field11() {
        return GroupScore.GROUP_SCORE.GROUP_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getScoreType();
    }

    @Override
    public Double component3() {
        return getDelta();
    }

    @Override
    public Double component4() {
        return getNewScore();
    }

    @Override
    public LocalDateTime component5() {
        return getTimestamp();
    }

    @Override
    public Integer component6() {
        return getMissionAttempt();
    }

    @Override
    public Byte component7() {
        return getFinalScore();
    }

    @Override
    public String component8() {
        return getStatus();
    }

    @Override
    public String component9() {
        return getRound();
    }

    @Override
    public String component10() {
        return getGameTime();
    }

    @Override
    public Integer component11() {
        return getGroupId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getScoreType();
    }

    @Override
    public Double value3() {
        return getDelta();
    }

    @Override
    public Double value4() {
        return getNewScore();
    }

    @Override
    public LocalDateTime value5() {
        return getTimestamp();
    }

    @Override
    public Integer value6() {
        return getMissionAttempt();
    }

    @Override
    public Byte value7() {
        return getFinalScore();
    }

    @Override
    public String value8() {
        return getStatus();
    }

    @Override
    public String value9() {
        return getRound();
    }

    @Override
    public String value10() {
        return getGameTime();
    }

    @Override
    public Integer value11() {
        return getGroupId();
    }

    @Override
    public GroupScoreRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GroupScoreRecord value2(String value) {
        setScoreType(value);
        return this;
    }

    @Override
    public GroupScoreRecord value3(Double value) {
        setDelta(value);
        return this;
    }

    @Override
    public GroupScoreRecord value4(Double value) {
        setNewScore(value);
        return this;
    }

    @Override
    public GroupScoreRecord value5(LocalDateTime value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public GroupScoreRecord value6(Integer value) {
        setMissionAttempt(value);
        return this;
    }

    @Override
    public GroupScoreRecord value7(Byte value) {
        setFinalScore(value);
        return this;
    }

    @Override
    public GroupScoreRecord value8(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public GroupScoreRecord value9(String value) {
        setRound(value);
        return this;
    }

    @Override
    public GroupScoreRecord value10(String value) {
        setGameTime(value);
        return this;
    }

    @Override
    public GroupScoreRecord value11(Integer value) {
        setGroupId(value);
        return this;
    }

    @Override
    public GroupScoreRecord values(Integer value1, String value2, Double value3, Double value4, LocalDateTime value5, Integer value6, Byte value7, String value8, String value9, String value10, Integer value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GroupScoreRecord
     */
    public GroupScoreRecord() {
        super(GroupScore.GROUP_SCORE);
    }

    /**
     * Create a detached, initialised GroupScoreRecord
     */
    public GroupScoreRecord(Integer id, String scoreType, Double delta, Double newScore, LocalDateTime timestamp, Integer missionAttempt, Byte finalScore, String status, String round, String gameTime, Integer groupId) {
        super(GroupScore.GROUP_SCORE);

        setId(id);
        setScoreType(scoreType);
        setDelta(delta);
        setNewScore(newScore);
        setTimestamp(timestamp);
        setMissionAttempt(missionAttempt);
        setFinalScore(finalScore);
        setStatus(status);
        setRound(round);
        setGameTime(gameTime);
        setGroupId(groupId);
        resetChangedOnNotNull();
    }
}
