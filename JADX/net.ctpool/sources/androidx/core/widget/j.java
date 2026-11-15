package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0584d;
import androidx.core.view.D;

/* JADX INFO: loaded from: classes.dex */
public final class j implements D {

    private static final class a {
        static CharSequence a(Context context, ClipData.Item item, int i7) {
            if ((i7 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
        }
    }

    private static CharSequence b(Context context, ClipData.Item item, int i7) {
        return a.a(context, item, i7);
    }

    private static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // androidx.core.view.D
    public C0584d a(View view, C0584d c0584d) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0584d);
        }
        if (c0584d.d() == 2) {
            return c0584d;
        }
        ClipData clipDataB = c0584d.b();
        int iC = c0584d.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z6 = false;
        for (int i7 = 0; i7 < clipDataB.getItemCount(); i7++) {
            CharSequence charSequenceB = b(context, clipDataB.getItemAt(i7), iC);
            if (charSequenceB != null) {
                if (z6) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceB);
                } else {
                    c(editable, charSequenceB);
                    z6 = true;
                }
            }
        }
        return null;
    }
}
