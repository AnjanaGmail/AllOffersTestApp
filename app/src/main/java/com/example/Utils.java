package com.example;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;

/**
 * Created by admin on 12/23/2017.
 */

public class Utils {
    public static SpannableString formTitle(String title, String subTitle, int titleStyle, int subTitleStyle, Context context) {
        SpannableString styledText = null;
        int start = 0;
        if (!TextUtils.isEmpty(title) && !TextUtils.isEmpty(subTitle)) {
            String textData = title + "\n" + subTitle;
            styledText = new SpannableString(textData);
            styledText.setSpan(new TextAppearanceSpan(context, titleStyle), start, title.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

            start = textData.indexOf("\n");
            styledText.setSpan(new TextAppearanceSpan(context, subTitleStyle), start, start + subTitle.length() + 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        return styledText;
    }
}
