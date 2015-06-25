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

import org.flywaydb.core.internal.dbsupport.Schema;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by mfedorov on 25.06.2015.
 */
public class SqlServer80DbSupport extends SQLServerDbSupport {

    /**
     * Creates a new instance.
     *
     * @param connection The connection to use.
     */
    public SqlServer80DbSupport(Connection connection) {
        super(connection);
    }

    @Override
    protected String doGetCurrentSchema() throws SQLException {
        return "dbo";
    }

    @Override
    public Schema getSchema(String name) {
        return new SqlServer80Schema(jdbcTemplate, this, name);
    }

}
