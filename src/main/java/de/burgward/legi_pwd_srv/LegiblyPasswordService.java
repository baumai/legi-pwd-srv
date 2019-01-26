/*
 * Legibly Password Service - gives a web access to the Legibly Password Generator
 * Copyright (C) 2019 Maik Baumann
 *
 * LegiblyPasswordService is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * LegiblyPasswordService is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with LegiblyPasswordService.  If not, see <https://www.gnu.org/licenses/>.
*/
package de.burgward.legi_pwd_srv;

import de.burgward.legi_pwd_gen.LegiblyPasswordGenerator;

public class LegiblyPasswordService {

	public static void main(String[] args) {
		
		new LegiblyPasswordService().test();
	}

	private void test() {
		String pw = new LegiblyPasswordGenerator().generatePassword();
		System.out.println(pw);
	}
}
