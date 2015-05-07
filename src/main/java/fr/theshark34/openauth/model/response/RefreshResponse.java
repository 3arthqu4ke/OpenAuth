/*
 * Copyright 2015 TheShark34
 *
 * This file is part of OpenAuth.

 * OpenAuth is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenAuth is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with OpenAuth.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.theshark34.openauth.model.response;

/**
 * JSON Model of an refresh response
 *
 * @version 1.0.0-RELEASE
 * @author TheShark34
 */
public class RefreshResponse {

    /**
     * The access token (not the same as the one given by the request)
     */
    private String accessToken;

    /**
     * The client token (same as the one given by the request)
     */
    private String clientToken;

    /**
     * Refresh Response constructor
     *
     * @param accessToken
     *            The access token (not the same as the one given by the request)
     * @param clientToken
     *            The client token (same as the one given by the request)
     */
    public RefreshResponse(String accessToken, String clientToken) {
        this.accessToken = accessToken;
        this.clientToken = clientToken;
    }

    /**
     * Returns the access token (not the same as the one given by the request)
     *
     * @return The access token
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Returns the client token (same as the one given by the request)
     *
     * @return The client token
     */
    public String getClientToken() {
        return clientToken;
    }

}
