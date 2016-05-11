/*
 * Copyright 2015 IIPC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.netpreserve.openwayback.cdxlib;

import org.netpreserve.openwayback.cdxlib.cdxsource.CdxIterator;

/**
 * Represents a search result from a {@link CdxSource}.
 * <p>
 * The SearchResult implements Iterable allowing it to be the target of a "for-each loop" statement.
 */
public interface SearchResult extends Iterable<CdxRecord>, AutoCloseable {

    @Override
    CdxIterator iterator();

    /**
     * Overridden from {@link AutoCloseable#close()} to disallow checked exceptions.
     */
    @Override
    void close();

}
