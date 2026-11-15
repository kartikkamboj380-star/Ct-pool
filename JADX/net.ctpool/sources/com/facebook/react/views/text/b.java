package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static WritableArray a(CharSequence charSequence, Layout layout, TextPaint textPaint, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.setTextSize(textPaint2.getTextSize() * 100.0f);
        int i7 = 0;
        int i8 = 1;
        textPaint2.getTextBounds("T", 0, 1, new Rect());
        double dHeight = (r5.height() / 100.0f) / displayMetrics.density;
        textPaint2.getTextBounds("x", 0, 1, new Rect());
        double dHeight2 = (r5.height() / 100.0f) / displayMetrics.density;
        while (i7 < layout.getLineCount()) {
            float lineWidth = (charSequence.length() <= 0 || charSequence.charAt(layout.getLineEnd(i7) - i8) != '\n') ? layout.getLineWidth(i7) : layout.getLineMax(i7);
            layout.getLineBounds(i7, new Rect());
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("x", layout.getLineLeft(i7) / displayMetrics.density);
            writableMapCreateMap.putDouble("y", r12.top / displayMetrics.density);
            writableMapCreateMap.putDouble("width", lineWidth / displayMetrics.density);
            writableMapCreateMap.putDouble("height", r12.height() / displayMetrics.density);
            writableMapCreateMap.putDouble("descender", layout.getLineDescent(i7) / displayMetrics.density);
            writableMapCreateMap.putDouble("ascender", (-layout.getLineAscent(i7)) / displayMetrics.density);
            writableMapCreateMap.putDouble("baseline", layout.getLineBaseline(i7) / displayMetrics.density);
            writableMapCreateMap.putDouble("capHeight", dHeight);
            writableMapCreateMap.putDouble("xHeight", dHeight2);
            writableMapCreateMap.putString("text", charSequence.subSequence(layout.getLineStart(i7), layout.getLineEnd(i7)).toString());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
            i7++;
            i8 = 1;
        }
        return writableArrayCreateArray;
    }
}
