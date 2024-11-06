package nl.gamedata.common;

import javax.sql.DataSource;

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

    public DataSource getDataSource()
    {
        return this.dataSource;
    }

    public void setDataSource(final DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

}
