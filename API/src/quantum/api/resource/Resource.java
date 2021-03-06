/*
 * The MIT License
 *
 * Copyright 2016 link.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 * Created file on 12/6/16 at 7:55 PM.
 *
 * This file is part of Quantum API
 */
package quantum.api.resource;

import quantum.api.mod.Mod;

/**
 * @author link
 */
public interface Resource {

	/**
	 * Gets the mod that this Resource belongs to
	 *
	 * @return the mod that this Resource belongs to
	 */
	Mod getMod();

	/**
	 * Gets the relative path of the file which represents this resource. The
	 * full path results in: {@code Quantum.getMinecraftDir() + "/quantum/mods/"
	 * + getMod().getName() + "/resources/" + getFile()}
	 *
	 * @return the relative path of the file which represents this resource
	 */
	String getPath();

}
