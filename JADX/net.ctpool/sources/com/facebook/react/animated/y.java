package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class y extends AbstractC0793b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f11374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f11375f;

    private class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11376c;

        private a() {
            super();
        }
    }

    private class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f11378c;

        private b() {
            super();
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11380a;

        private c() {
        }
    }

    y(ReadableMap readableMap, p pVar) {
        Object obj;
        ReadableArray array = readableMap.getArray("transforms");
        this.f11375f = new ArrayList(array.size());
        for (int i7 = 0; i7 < array.size(); i7++) {
            ReadableMap map = array.getMap(i7);
            String string = map.getString("property");
            boolean z6 = false;
            if (map.getString("type").equals("animated")) {
                a aVar = new a();
                aVar.f11380a = string;
                aVar.f11376c = map.getInt("nodeTag");
                obj = aVar;
            } else {
                b bVar = new b();
                bVar.f11380a = string;
                bVar.f11378c = map.getDouble("value");
                obj = bVar;
            }
            this.f11375f.add(obj);
        }
        this.f11374e = pVar;
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransformAnimatedNode[");
        sb.append(this.f11274d);
        sb.append("]: mTransformConfigs: ");
        List list = this.f11375f;
        sb.append(list != null ? list.toString() : "null");
        return sb.toString();
    }

    public void i(JavaOnlyMap javaOnlyMap) {
        double dL;
        ArrayList arrayList = new ArrayList(this.f11375f.size());
        for (c cVar : this.f11375f) {
            if (cVar instanceof a) {
                AbstractC0793b abstractC0793bL = this.f11374e.l(((a) cVar).f11376c);
                if (abstractC0793bL == null) {
                    throw new IllegalArgumentException("Mapped style node does not exist");
                }
                if (!(abstractC0793bL instanceof B)) {
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + abstractC0793bL.getClass());
                }
                dL = ((B) abstractC0793bL).l();
            } else {
                dL = ((b) cVar).f11378c;
            }
            arrayList.add(JavaOnlyMap.of(cVar.f11380a, Double.valueOf(dL)));
        }
        javaOnlyMap.putArray("transform", JavaOnlyArray.from(arrayList));
    }
}
