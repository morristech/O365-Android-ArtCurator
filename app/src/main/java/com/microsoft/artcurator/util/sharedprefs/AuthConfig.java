/*
 *  Copyright (c) Microsoft. All rights reserved. Licensed under the MIT license.
 *  See full license at the bottom of this file.
 */
package com.microsoft.artcurator.util.sharedprefs;

import android.content.Context;

import com.microsoft.artcurator.app.ArtCuratorApplication;

/**
 * Stores user-info from the AuthenticationResult - for example, the currently logged-in user's
 * email is displayed in the Settings screen; it is persisted and restored from here.
 */
public class AuthConfig extends SharedPrefsUtil.Config {

    public AuthConfig() {
        super(ArtCuratorApplication.getApplication(),
                "UserInfoPreferences",
                Context.MODE_PRIVATE);
    }

    public static class Keys {

        public static final String KEY_EMAIL = "EMAIL";
    }
}
// *********************************************************
//
// O365-Android-ArtCurator https://github.com/OfficeDev/O365-Android-ArtCurator
//
// Copyright (c) Microsoft Corporation
// All rights reserved.
//
// MIT License:
// Permission is hereby granted, free of charge, to any person obtaining
// a copy of this software and associated documentation files (the
// "Software"), to deal in the Software without restriction, including
// without limitation the rights to use, copy, modify, merge, publish,
// distribute, sublicense, and/or sell copies of the Software, and to
// permit persons to whom the Software is furnished to do so, subject to
// the following conditions:
//
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
// LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
// OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
// WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//
// *********************************************************