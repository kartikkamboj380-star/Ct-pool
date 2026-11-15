package b4;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* JADX INFO: renamed from: b4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0694i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC0694i f9688a = new InterfaceC0694i() { // from class: b4.h
        @Override // b4.InterfaceC0694i
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
