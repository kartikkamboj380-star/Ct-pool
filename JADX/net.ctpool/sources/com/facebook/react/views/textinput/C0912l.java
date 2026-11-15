package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0912l extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0910j f13226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.facebook.react.uimanager.events.e f13227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f13229d;

    public C0912l(InputConnection inputConnection, ReactContext reactContext, C0910j c0910j, com.facebook.react.uimanager.events.e eVar) {
        super(inputConnection, false);
        this.f13229d = null;
        this.f13227b = eVar;
        this.f13226a = c0910j;
    }

    private void a(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f13227b.c(new q(this.f13226a.getId(), str));
    }

    private void b(String str) {
        if (this.f13228c) {
            this.f13229d = str;
        } else {
            a(str);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f13228c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i7) {
        String string = charSequence.toString();
        if (string.length() <= 2) {
            if (string.equals("")) {
                string = "Backspace";
            }
            b(string);
        }
        return super.commitText(charSequence, i7);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i7, int i8) {
        a("Backspace");
        return super.deleteSurroundingText(i7, i8);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.f13228c = false;
        String str = this.f13229d;
        if (str != null) {
            a(str);
            this.f13229d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        String strValueOf;
        if (keyEvent.getAction() == 0) {
            boolean z6 = keyEvent.getUnicodeChar() < 58 && keyEvent.getUnicodeChar() > 47;
            if (keyEvent.getKeyCode() == 67) {
                strValueOf = "Backspace";
            } else if (keyEvent.getKeyCode() == 66) {
                strValueOf = "Enter";
            } else if (z6) {
                strValueOf = String.valueOf(keyEvent.getNumber());
            }
            a(strValueOf);
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i7) {
        int selectionStart = this.f13226a.getSelectionStart();
        int selectionEnd = this.f13226a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i7);
        int selectionStart2 = this.f13226a.getSelectionStart();
        b((selectionStart2 < selectionStart || selectionStart2 <= 0 || (!(selectionStart == selectionEnd) && (selectionStart2 == selectionStart))) ? "Backspace" : String.valueOf(this.f13226a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }
}
