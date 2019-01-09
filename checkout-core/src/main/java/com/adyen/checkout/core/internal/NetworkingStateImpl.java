/*
 * Copyright (c) 2018 Adyen N.V.
 *
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 *
 * Created by timon on 11/07/2018.
 */

package com.adyen.checkout.core.internal;

import com.adyen.checkout.core.NetworkingState;

public final class NetworkingStateImpl implements NetworkingState {
    private int mExecutingRequestCount;

    @Override
    public boolean isExecutingRequests() {
        return mExecutingRequestCount > 0;
    }

    public void onRequestStarted() {
        mExecutingRequestCount = mExecutingRequestCount + 1;
    }

    public void onRequestFinished() {
        mExecutingRequestCount = mExecutingRequestCount - 1;

        if (mExecutingRequestCount < 0) {
            throw new IllegalStateException("Cannot decrease loading count below 0.");
        }
    }
}
