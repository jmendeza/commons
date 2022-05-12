/*
 * Copyright (C) 2007-2022 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.commons.file.stores;

/**
 * Represents the path of a remote file.
 *
 * @author avasquez
 */
public class RemotePath {

    private String storeType;
    private String path;

    public RemotePath(String storeType, String path) {
        this.storeType = storeType;
        this.path = path;
    }

    /**
     * Returns the remote store type (s3, box, etc).
     */
    public String getStoreType() {
        return storeType;
    }

    /**
     * Returns the path or ID of file in the remote store.
     */
    public String getPath() {
        return path;
    }

}
