/**
 * Copyright 2010-2015 Axel Fontaine
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core.internal.dbsupport.sqlserver;

import org.flywaydb.core.internal.dbsupport.JdbcTemplate;

import java.sql.SQLException;

/**
 * Created by mfedorov on 25.06.2015.
 */
public class SqlServer80Schema extends SQLServerSchema {

    /**
     * Creates a new SQLServer schema.
     *
     * @param jdbcTemplate The Jdbc Template for communicating with the DB.
     * @param dbSupport    The database-specific support.
     * @param name         The name of the schema.
     */
    public SqlServer80Schema(JdbcTemplate jdbcTemplate, SQLServerDbSupport dbSupport, String name) {
        super(jdbcTemplate, dbSupport, name);
    }

    @Override
    protected void doCreate() throws SQLException {
        // no-op
    }

    @Override
    protected void doDrop() throws SQLException {
        // no-op
    }

    @Override
    protected void doClean() throws SQLException {
        // no-op
    }
}
