/****************************************************************************
 * Copyright (C) 2016 Tobias Wich
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ***************************************************************************/

package de.rub.nds.oidc.server;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Tobias Wich
 */
public class RequestPath {

	private final String testId;

	public RequestPath(HttpServletRequest req) {
		this.testId = null;
	}

	public String getTestId() {
		return testId;
	}

}