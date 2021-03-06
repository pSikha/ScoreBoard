/*
 * ScoreBoard
 * Copyright (C) 2012-2013 Frank Bille
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
 */

package dk.frankbille.scoreboard.dao.mybatis;

import org.apache.ibatis.annotations.Param;

import dk.frankbille.scoreboard.domain.Player;
import dk.frankbille.scoreboard.domain.User;

public interface UserMapper {

	User authenticate(@Param("username") String username, @Param("password") String password);

	int insertUser(@Param("user") User user, @Param("password") String password);

	int updateUser(User user);

	int updatePassword(@Param("username") String username, @Param("password") String password);

	User getUserWithUsername(String username);

	User getUserForPlayer(Player player);

}
