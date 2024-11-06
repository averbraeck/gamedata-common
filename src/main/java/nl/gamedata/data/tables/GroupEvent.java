/*
 * This file is generated by jOOQ.
 */
package nl.gamedata.data.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import nl.gamedata.data.Gamedata;
import nl.gamedata.data.Indexes;
import nl.gamedata.data.Keys;
import nl.gamedata.data.tables.records.GroupEventRecord;

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
public class GroupEvent extends TableImpl<GroupEventRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>gamedata.group_event</code>
     */
    public static final GroupEvent GROUP_EVENT = new GroupEvent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GroupEventRecord> getRecordType() {
        return GroupEventRecord.class;
    }

    /**
     * The column <code>gamedata.group_event.id</code>.
     */
    public final TableField<GroupEventRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>gamedata.group_event.type</code>.
     */
    public final TableField<GroupEventRecord, String> TYPE = createField(DSL.name("type"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>gamedata.group_event.value</code>.
     */
    public final TableField<GroupEventRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.VARCHAR(255).defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>gamedata.group_event.timestamp</code>.
     */
    public final TableField<GroupEventRecord, LocalDateTime> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("current_timestamp()"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>gamedata.group_event.mission_attempt</code>.
     */
    public final TableField<GroupEventRecord, Integer> MISSION_ATTEMPT = createField(DSL.name("mission_attempt"), SQLDataType.INTEGER.defaultValue(DSL.field(DSL.raw("NULL"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>gamedata.group_event.group_id</code>.
     */
    public final TableField<GroupEventRecord, Integer> GROUP_ID = createField(DSL.name("group_id"), SQLDataType.INTEGER.nullable(false), this, "");

    private GroupEvent(Name alias, Table<GroupEventRecord> aliased) {
        this(alias, aliased, null);
    }

    private GroupEvent(Name alias, Table<GroupEventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>gamedata.group_event</code> table reference
     */
    public GroupEvent(String alias) {
        this(DSL.name(alias), GROUP_EVENT);
    }

    /**
     * Create an aliased <code>gamedata.group_event</code> table reference
     */
    public GroupEvent(Name alias) {
        this(alias, GROUP_EVENT);
    }

    /**
     * Create a <code>gamedata.group_event</code> table reference
     */
    public GroupEvent() {
        this(DSL.name("group_event"), null);
    }

    public <O extends Record> GroupEvent(Table<O> child, ForeignKey<O, GroupEventRecord> key) {
        super(child, key, GROUP_EVENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Gamedata.GAMEDATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.GROUP_EVENT_FK_GROUPEVENT_GROUP1_IDX);
    }

    @Override
    public Identity<GroupEventRecord, Integer> getIdentity() {
        return (Identity<GroupEventRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<GroupEventRecord> getPrimaryKey() {
        return Keys.KEY_GROUP_EVENT_PRIMARY;
    }

    @Override
    public List<UniqueKey<GroupEventRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_GROUP_EVENT_ID_UNIQUE);
    }

    @Override
    public List<ForeignKey<GroupEventRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK_GROUPEVENT_GROUP1);
    }

    private transient Group _group;

    /**
     * Get the implicit join path to the <code>gamedata.group</code> table.
     */
    public Group group() {
        if (_group == null)
            _group = new Group(this, Keys.FK_GROUPEVENT_GROUP1);

        return _group;
    }

    @Override
    public GroupEvent as(String alias) {
        return new GroupEvent(DSL.name(alias), this);
    }

    @Override
    public GroupEvent as(Name alias) {
        return new GroupEvent(alias, this);
    }

    @Override
    public GroupEvent as(Table<?> alias) {
        return new GroupEvent(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupEvent rename(String name) {
        return new GroupEvent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupEvent rename(Name name) {
        return new GroupEvent(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public GroupEvent rename(Table<?> name) {
        return new GroupEvent(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, String, LocalDateTime, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Integer, ? super String, ? super String, ? super LocalDateTime, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Integer, ? super String, ? super String, ? super LocalDateTime, ? super Integer, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
