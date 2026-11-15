package a0;

import Z.k;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class h extends C0501g implements k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SQLiteStatement f4705n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        w5.k.f(sQLiteStatement, "delegate");
        this.f4705n = sQLiteStatement;
    }

    @Override // Z.k
    public int D() {
        return this.f4705n.executeUpdateDelete();
    }

    @Override // Z.k
    public long Y0() {
        return this.f4705n.executeInsert();
    }
}
