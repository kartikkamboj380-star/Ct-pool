package Y1;

import Z1.b;
import androidx.appcompat.app.y;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements UIManagerListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f4427m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f4428n = new ArrayList();

    public final synchronized void a(Z1.a aVar) {
        k.f(aVar, "block");
        this.f4428n.add(aVar);
    }

    public final synchronized void b(Z1.a aVar) {
        k.f(aVar, "block");
        this.f4427m.add(aVar);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
        k.f(uIManager, "uiManager");
        didMountItems(uIManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
        k.f(uIManager, "uiManager");
        if (this.f4428n.isEmpty()) {
            return;
        }
        Iterator it = this.f4428n.iterator();
        while (it.hasNext()) {
            y.a(it.next());
            if (uIManager instanceof b) {
                throw null;
            }
        }
        this.f4428n.clear();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
        k.f(uIManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        k.f(uIManager, "uiManager");
        willMountItems(uIManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
        k.f(uIManager, "uiManager");
        if (this.f4427m.isEmpty()) {
            return;
        }
        Iterator it = this.f4427m.iterator();
        while (it.hasNext()) {
            y.a(it.next());
            if (uIManager instanceof b) {
                throw null;
            }
        }
        this.f4427m.clear();
    }
}
