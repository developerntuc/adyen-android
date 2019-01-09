/*
 * Copyright (c) 2017 Adyen N.V.
 *
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 *
 * Created by timon on 15/08/2017.
 */

package com.adyen.checkout.ui.internal.common.util.recyclerview;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.DefaultItemAnimator;

public class CheckoutItemAnimator extends DefaultItemAnimator {
    public CheckoutItemAnimator(@NonNull Resources resources) {
        long animationDuration = resources.getInteger(android.R.integer.config_shortAnimTime);
        setAddDuration(animationDuration);
        setChangeDuration(animationDuration);
        setMoveDuration(animationDuration);
        setRemoveDuration(animationDuration);
    }
}
