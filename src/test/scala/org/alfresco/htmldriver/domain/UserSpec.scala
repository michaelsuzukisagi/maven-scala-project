/*
 * Copyright (C) 2005-2012 Alfresco Software Limited.
 *
 * This file is part of Alfresco
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 */
package org.alfresco.htmldriver.domain

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers



/**
 * User: Michael Suzuki
 * Date: 19/08/11
 * Time: 08:20
 */

class UserSpec extends FunSpec with ShouldMatchers {
  private val username = "michael"
  private val firstName = "Michael"
  private val lastName = "Suzuki"
  private val name = "Michael Suzuki"
  private val email = "michael.suzuki@gmail.com"
  private val password = "password"
  private val admin = false

  it("should create user with correct name, email and ") {
    val user = new User(username, firstName, lastName, email, password, admin)
    user.firstName should be(firstName)
    user.lastName should be(lastName)
    user.name should be(name)
    user.email should be(email)
    user.admin should be(false)
  }
}