/*
 * Copyright (c) 2018 Adyen N.V.
 *
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 *
 * Created by timon on 01/06/2018.
 */

package com.adyen.checkout.core;

import android.app.Activity;
import android.os.Parcelable;
import android.support.annotation.NonNull;

/**
 * A {@link PaymentReference} is a {@link Parcelable} reference of a payment that provides access to a stateful instance of a {@link PaymentHandler}.
 */
public interface PaymentReference extends Parcelable {
    /**
     * @return The UUID of this {@link PaymentReference}.
     */
    @NonNull
    String getUuid();

    /**
     * Get a {@link PaymentHandler} for the current {@link Activity}.
     *
     * @param activity The current {@link Activity}.
     * @return The {@link PaymentHandler}.
     */
    @NonNull
    PaymentHandler getPaymentHandler(@NonNull Activity activity);
}
