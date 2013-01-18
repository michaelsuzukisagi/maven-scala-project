/*
 * Copyright (C) 2005-2013 Alfresco Software Limited.
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

import java.lang.Integer

object User {
  val Username = "username"
  val Email = "email"
  val FirstName = "firstname"
  val LastName = "lastname"
  val Password = "password"
}

case class User(
  val username: String,
  var firstName: String,
  var lastName: String,
  var email: String,
  var password: String,
  var enabled: Boolean = true,
  var emailShow: Boolean = true,
  val admin: Boolean = false) {

    require(username != null && username.nonEmpty)
    require(firstName != null && firstName.nonEmpty)
    require(lastName != null && lastName.nonEmpty)
    require(email != null && email.trim.nonEmpty && validEmail)
    require(password != null && password.nonEmpty)

    def name = firstName + " " + lastName
    def validEmail = email.contains("@")
  }

object UserIndex {
  val user_index = "email"
}