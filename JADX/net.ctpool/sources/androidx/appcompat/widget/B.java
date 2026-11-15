package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TextView f5655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextClassifier f5656b;

    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    B(TextView textView) {
        this.f5655a = (TextView) androidx.core.util.f.f(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f5656b;
        return textClassifier == null ? a.a(this.f5655a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f5656b = textClassifier;
    }
}
