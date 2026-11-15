package X;

import Z.g;
import Z.j;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import i5.u;
import j5.AbstractC1809n;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import t5.AbstractC2070a;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(g gVar) throws IOException {
        k.f(gVar, "db");
        List listC = AbstractC1809n.c();
        Cursor cursorO0 = gVar.o0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorO0.moveToNext()) {
            try {
                listC.add(cursorO0.getString(0));
            } finally {
            }
        }
        u uVar = u.f19985a;
        AbstractC2070a.a(cursorO0, null);
        for (String str : AbstractC1809n.a(listC)) {
            k.e(str, "triggerName");
            if (F5.g.B(str, "room_fts_content_sync_", false, 2, null)) {
                gVar.u("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final Cursor b(androidx.room.u uVar, j jVar, boolean z6, CancellationSignal cancellationSignal) {
        k.f(uVar, "db");
        k.f(jVar, "sqLiteQuery");
        Cursor cursorQuery = uVar.query(jVar, cancellationSignal);
        if (!z6 || !(cursorQuery instanceof AbstractWindowedCursor)) {
            return cursorQuery;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorQuery;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? a.a(cursorQuery) : cursorQuery;
    }

    public static final int c(File file) throws IOException {
        k.f(file, "databaseFile");
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i7 = byteBufferAllocate.getInt();
            AbstractC2070a.a(channel, null);
            return i7;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2070a.a(channel, th);
                throw th2;
            }
        }
    }
}
