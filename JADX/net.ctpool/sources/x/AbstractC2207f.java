package x;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.C0584d;
import androidx.core.view.H;

/* JADX INFO: renamed from: x.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2207f {

    /* JADX INFO: renamed from: x.f$a */
    class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f22746a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z6, c cVar) {
            super(inputConnection, z6);
            this.f22746a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
            if (this.f22746a.a(g.f(inputContentInfo), i7, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i7, bundle);
        }
    }

    /* JADX INFO: renamed from: x.f$b */
    class b extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f22747a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z6, c cVar) {
            super(inputConnection, z6);
            this.f22747a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (AbstractC2207f.e(str, bundle, this.f22747a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* JADX INFO: renamed from: x.f$c */
    public interface c {
        boolean a(g gVar, int i7, Bundle bundle);
    }

    private static c b(final View view) {
        androidx.core.util.f.f(view);
        return new c() { // from class: x.e
            @Override // x.AbstractC2207f.c
            public final boolean a(g gVar, int i7, Bundle bundle) {
                return AbstractC2207f.f(view, gVar, i7, bundle);
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        androidx.core.util.b.d(inputConnection, "inputConnection must be non-null");
        androidx.core.util.b.d(editorInfo, "editorInfo must be non-null");
        androidx.core.util.b.d(cVar, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new a(inputConnection, false, cVar) : AbstractC2204c.a(editorInfo).length == 0 ? inputConnection : new b(inputConnection, false, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean e(String str, Bundle bundle, c cVar) throws Throwable {
        boolean z6;
        ResultReceiver resultReceiver;
        ?? A6 = 0;
        A6 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z6 = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z6 = true;
        }
        try {
            ResultReceiver resultReceiver2 = (ResultReceiver) bundle.getParcelable(z6 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(z6 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z6 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z6 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i7 = bundle.getInt(z6 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z6 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    A6 = cVar.a(new g(uri, clipDescription, uri2), i7, bundle2);
                }
                if (resultReceiver2 != 0) {
                    resultReceiver2.send(A6, null);
                }
                return A6;
            } catch (Throwable th) {
                th = th;
                resultReceiver = resultReceiver2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean f(View view, g gVar, int i7, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i7 & 1) != 0) {
            try {
                gVar.d();
                InputContentInfo inputContentInfoA = AbstractC2205d.a(gVar.e());
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfoA);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        return H.f0(view, new C0584d.a(new ClipData(gVar.b(), new ClipData.Item(gVar.a())), 2).d(gVar.c()).b(bundle).a()) == null;
    }
}
