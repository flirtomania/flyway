/**
 * Copyright 2010-2014 Axel Fontaine
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
package org.flywaydb.sample.webapp;

import org.flywaydb.core.Flyway;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet for Migrating the DB instance.
 */
public class MigrateServlet extends HttpServlet {
    /**
     * The Flyway instance to use.
     */
    private final Flyway flyway = Environment.createFlyway();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int successCount = flyway.migrate();

        response.setContentType("application/json");
        response.getWriter().print("{\"status\":\"OK\", \"count\":" + successCount + "}");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        throw new ServletException("GET not supported");
    }
}
