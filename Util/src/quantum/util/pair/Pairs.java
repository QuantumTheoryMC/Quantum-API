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
 * Created file on 12/16/16 at 8:15 PM.
 *
 * This file is part of Quantum API
 */
package quantum.util.pair;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author link
 */
public enum Pairs {
	;

	@SuppressWarnings("unchecked")
	public static <A, B> Map<A, B> toMap(Pair<A, B>[] pairs) {
		if (pairs == null || pairs.length == 0)
			return (Map<A, B>) Collections.EMPTY_MAP;

		Map<A, B> map = new HashMap<>(pairs.length);

		for (Pair<A, B> pair : pairs) {
			map.put(pair.getA(), pair.getB());
		}

		return map;
	}

}
