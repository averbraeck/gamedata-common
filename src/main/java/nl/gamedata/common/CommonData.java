package nl.gamedata.common;

import javax.sql.DataSource;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

/**
 * CommonData contains the root class for the persistent data objects in the backend per session.
 * <p>
 * Copyright (c) 2024-2024 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://github.com/averbraeck/gamedata-common/LICENSE">GameData project License</a>.
 * </p>
 * @author <a href="https://github.com/averbraeck">Alexander Verbraeck</a>
 */
public class CommonData
{
    /**
     * the SQL datasource representing the database's connection pool.<br>
     * the datasource is shared among the servlets and stored as a ServletContext attribute.
     */
    protected DataSource dataSource;

    /** The DSL Context for reuse. Lazy loading. */
    private DSLContext dsl = null;

    public DataSource getDataSource()
    {
        return this.dataSource;
    }

    public void setDataSource(final DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    public DSLContext getDSL()
    {
        if (this.dsl == null)
        {
            this.dsl = DSL.using(getDataSource(), SQLDialect.MYSQL);
        }
        return this.dsl;
    }
}
