package com.horcrux.svg;

import F2.C0369v;
import F2.C0371x;
import F2.C0373z;
import F2.InterfaceC0370w;
import F2.InterfaceC0372y;
import F2.m0;
import F2.n0;
import F2.o0;
import F2.p0;
import F2.q0;
import F2.r0;
import F2.s0;
import F2.t0;
import F2.u0;
import F2.v0;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.VirtualViewManager;
import com.horcrux.svg.events.SvgLoadEvent;
import java.util.HashMap;
import java.util.Map;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
class RenderableViewManager<T extends RenderableView> extends VirtualViewManager<T> {

    static class CircleViewManager extends RenderableViewManager<C1563b> implements InterfaceC0370w {
        public static final String REACT_CLASS = "RNSVGCircle";

        CircleViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGCircle);
            this.mDelegate = new C0369v(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.InterfaceC0370w
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "cx")
        public void setCx(C1563b c1563b, Dynamic dynamic) {
            c1563b.q(dynamic);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "cy")
        public void setCy(C1563b c1563b, Dynamic dynamic) {
            c1563b.r(dynamic);
        }

        @Override // F2.InterfaceC0370w
        @InterfaceC2218a(name = "r")
        public void setR(C1563b c1563b, Dynamic dynamic) {
            c1563b.s(dynamic);
        }
    }

    static class ClipPathViewManager extends GroupViewManagerAbstract<C1564c> implements InterfaceC0372y {
        public static final String REACT_CLASS = "RNSVGClipPath";

        ClipPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGClipPath);
            this.mDelegate = new C0371x(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C1582u) view, dynamic);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C1582u) view, dynamic);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C1582u) view, dynamic);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.InterfaceC0372y
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.InterfaceC0372y
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }
    }

    static class DefsViewManager extends VirtualViewManager<C1566e> implements F2.A {
        public static final String REACT_CLASS = "RNSVGDefs";

        DefsViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGDefs);
            this.mDelegate = new C0373z(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.A
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.A
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.A
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // F2.A
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.A
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.A
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.A
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.A
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.A
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.A
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // F2.A
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }
    }

    static class EllipseViewManager extends RenderableViewManager<C1568g> implements F2.C {
        public static final String REACT_CLASS = "RNSVGEllipse";

        EllipseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGEllipse);
            this.mDelegate = new F2.B(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.C
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.C
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "cx")
        public void setCx(C1568g c1568g, Dynamic dynamic) {
            c1568g.q(dynamic);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "cy")
        public void setCy(C1568g c1568g, Dynamic dynamic) {
            c1568g.r(dynamic);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "rx")
        public void setRx(C1568g c1568g, Dynamic dynamic) {
            c1568g.s(dynamic);
        }

        @Override // F2.C
        @InterfaceC2218a(name = "ry")
        public void setRy(C1568g c1568g, Dynamic dynamic) {
            c1568g.t(dynamic);
        }
    }

    static class FeColorMatrixManager extends FilterPrimitiveManager<C1569h> implements F2.E {
        public static final String REACT_CLASS = "RNSVGFeColorMatrix";

        FeColorMatrixManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeColorMatrix);
            this.mDelegate = new F2.D(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.E
        @InterfaceC2218a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((AbstractC1573l) view, dynamic);
        }

        @Override // F2.E
        @InterfaceC2218a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((AbstractC1573l) view, str);
        }

        @Override // F2.E
        @InterfaceC2218a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((AbstractC1573l) view, dynamic);
        }

        @Override // F2.E
        @InterfaceC2218a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((AbstractC1573l) view, dynamic);
        }

        @Override // F2.E
        @InterfaceC2218a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((AbstractC1573l) view, dynamic);
        }

        @Override // F2.E
        @InterfaceC2218a(name = "in1")
        public void setIn1(C1569h c1569h, String str) {
            c1569h.y(str);
        }

        @Override // F2.E
        @InterfaceC2218a(name = "type")
        public void setType(C1569h c1569h, String str) {
            c1569h.z(str);
        }

        @Override // F2.E
        @InterfaceC2218a(name = "values")
        public void setValues(C1569h c1569h, ReadableArray readableArray) {
            c1569h.A(readableArray);
        }
    }

    static class FeGaussianBlurManager extends FilterPrimitiveManager<C1570i> implements F2.G {
        public static final String REACT_CLASS = "RNSVGFeGaussianBlur";

        FeGaussianBlurManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeGaussianBlur);
            this.mDelegate = new F2.F(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.G
        @InterfaceC2218a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((AbstractC1573l) view, dynamic);
        }

        @Override // F2.G
        @InterfaceC2218a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((AbstractC1573l) view, str);
        }

        @Override // F2.G
        @InterfaceC2218a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((AbstractC1573l) view, dynamic);
        }

        @Override // F2.G
        @InterfaceC2218a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((AbstractC1573l) view, dynamic);
        }

        @Override // F2.G
        @InterfaceC2218a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((AbstractC1573l) view, dynamic);
        }

        @Override // F2.G
        @InterfaceC2218a(name = "values")
        public void setEdgeMode(C1570i c1570i, String str) {
            c1570i.z(str);
        }

        @Override // F2.G
        @InterfaceC2218a(name = "in1")
        public void setIn1(C1570i c1570i, String str) {
            c1570i.A(str);
        }

        @Override // F2.G
        @InterfaceC2218a(name = "stdDeviationX")
        public void setStdDeviationX(C1570i c1570i, float f7) {
            c1570i.B(f7);
        }

        @Override // F2.G
        @InterfaceC2218a(name = "stdDeviationY")
        public void setStdDeviationY(C1570i c1570i, float f7) {
            c1570i.C(f7);
        }
    }

    static class FeMergeManager extends FilterPrimitiveManager<C1571j> implements F2.I {
        public static final String REACT_CLASS = "RNSVGFeMerge";

        FeMergeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeMerge);
            this.mDelegate = new F2.H(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.I
        @InterfaceC2218a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((AbstractC1573l) view, dynamic);
        }

        @Override // F2.I
        @InterfaceC2218a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((AbstractC1573l) view, str);
        }

        @Override // F2.I
        @InterfaceC2218a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((AbstractC1573l) view, dynamic);
        }

        @Override // F2.I
        @InterfaceC2218a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((AbstractC1573l) view, dynamic);
        }

        @Override // F2.I
        @InterfaceC2218a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((AbstractC1573l) view, dynamic);
        }

        @Override // F2.I
        @InterfaceC2218a(name = "nodes")
        public void setNodes(C1571j c1571j, ReadableArray readableArray) {
            c1571j.y(readableArray);
        }
    }

    static class FeOffsetManager extends FilterPrimitiveManager<C1572k> implements F2.K {
        public static final String REACT_CLASS = "RNSVGFeOffset";

        FeOffsetManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeOffset);
            this.mDelegate = new F2.J(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.K
        @InterfaceC2218a(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((AbstractC1573l) view, dynamic);
        }

        @Override // F2.K
        @InterfaceC2218a(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((AbstractC1573l) view, str);
        }

        @Override // F2.K
        @InterfaceC2218a(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((AbstractC1573l) view, dynamic);
        }

        @Override // F2.K
        @InterfaceC2218a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((AbstractC1573l) view, dynamic);
        }

        @Override // F2.K
        @InterfaceC2218a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((AbstractC1573l) view, dynamic);
        }

        @Override // F2.K
        @InterfaceC2218a(name = "dx")
        public void setDx(C1572k c1572k, Dynamic dynamic) {
            c1572k.y(dynamic);
        }

        @Override // F2.K
        @InterfaceC2218a(name = "dy")
        public void setDy(C1572k c1572k, Dynamic dynamic) {
            c1572k.z(dynamic);
        }

        @Override // F2.K
        @InterfaceC2218a(name = "in1")
        public void setIn1(C1572k c1572k, String str) {
            c1572k.A(str);
        }
    }

    static class FilterManager extends VirtualViewManager<C1577p> implements F2.M {
        public static final String REACT_CLASS = "RNSVGFilter";

        FilterManager() {
            super(VirtualViewManager.SVGClass.RNSVGFilter);
            this.mDelegate = new F2.L(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.M
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // F2.M
        @InterfaceC2218a(name = "filterUnits")
        public void setFilterUnits(C1577p c1577p, String str) {
            c1577p.r(str);
        }

        @Override // F2.M
        @InterfaceC2218a(name = "height")
        public void setHeight(C1577p c1577p, Dynamic dynamic) {
            c1577p.s(dynamic);
        }

        @Override // F2.M
        @InterfaceC2218a(name = "primitiveUnits")
        public void setPrimitiveUnits(C1577p c1577p, String str) {
            c1577p.t(str);
        }

        @Override // F2.M
        @InterfaceC2218a(name = "width")
        public void setWidth(C1577p c1577p, Dynamic dynamic) {
            c1577p.u(dynamic);
        }

        @Override // F2.M
        @InterfaceC2218a(name = "x")
        public void setX(C1577p c1577p, Dynamic dynamic) {
            c1577p.v(dynamic);
        }

        @Override // F2.M
        @InterfaceC2218a(name = "y")
        public void setY(C1577p c1577p, Dynamic dynamic) {
            c1577p.w(dynamic);
        }
    }

    static class FilterPrimitiveManager<T extends AbstractC1573l> extends VirtualViewManager<T> {
        protected FilterPrimitiveManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @InterfaceC2218a(name = "height")
        public void setHeight(T t6, Dynamic dynamic) {
            t6.t(dynamic);
        }

        @InterfaceC2218a(name = "result")
        public void setResult(T t6, String str) {
            t6.u(str);
        }

        @InterfaceC2218a(name = "width")
        public void setWidth(T t6, Dynamic dynamic) {
            t6.v(dynamic);
        }

        @InterfaceC2218a(name = "x")
        public void setX(T t6, Dynamic dynamic) {
            t6.w(dynamic);
        }

        @InterfaceC2218a(name = "y")
        public void setY(T t6, Dynamic dynamic) {
            t6.x(dynamic);
        }
    }

    static class ForeignObjectManager extends GroupViewManagerAbstract<C1579r> implements F2.O {
        public static final String REACT_CLASS = "RNSVGForeignObject";

        ForeignObjectManager() {
            super(VirtualViewManager.SVGClass.RNSVGForeignObject);
            this.mDelegate = new F2.N(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C1582u) view, dynamic);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C1582u) view, dynamic);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C1582u) view, dynamic);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.O
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.O
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "height")
        public void setHeight(C1579r c1579r, Dynamic dynamic) {
            c1579r.B(dynamic);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "width")
        public void setWidth(C1579r c1579r, Dynamic dynamic) {
            c1579r.C(dynamic);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "x")
        public void setX(C1579r c1579r, Dynamic dynamic) {
            c1579r.D(dynamic);
        }

        @Override // F2.O
        @InterfaceC2218a(name = "y")
        public void setY(C1579r c1579r, Dynamic dynamic) {
            c1579r.E(dynamic);
        }
    }

    static class GroupViewManager extends GroupViewManagerAbstract<C1582u> implements F2.Q {
        public static final String REACT_CLASS = "RNSVGGroup";

        GroupViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGGroup);
            this.mDelegate = new F2.P(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C1582u) view, dynamic);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C1582u) view, dynamic);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C1582u) view, dynamic);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.Q
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.Q
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Q
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }
    }

    static class GroupViewManagerAbstract<U extends C1582u> extends RenderableViewManager<U> {
        GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @InterfaceC2218a(name = "font")
        public void setFont(U u6, Dynamic dynamic) {
            u6.y(dynamic);
        }

        @InterfaceC2218a(name = "fontSize")
        public void setFontSize(U u6, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i7 = a.f17817a[dynamic.getType().ordinal()];
            if (i7 == 1) {
                javaOnlyMap.putDouble("fontSize", dynamic.asDouble());
            } else if (i7 != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontSize", dynamic.asString());
            }
            u6.z(javaOnlyMap);
        }

        @InterfaceC2218a(name = "fontWeight")
        public void setFontWeight(U u6, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i7 = a.f17817a[dynamic.getType().ordinal()];
            if (i7 == 1) {
                javaOnlyMap.putDouble("fontWeight", dynamic.asDouble());
            } else if (i7 != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontWeight", dynamic.asString());
            }
            u6.z(javaOnlyMap);
        }
    }

    static class ImageViewManager extends RenderableViewManager<C1583v> implements F2.T {
        public static final String REACT_CLASS = "RNSVGImage";

        ImageViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGImage);
            this.mDelegate = new F2.S(this);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            HashMap map = new HashMap();
            map.put(SvgLoadEvent.EVENT_NAME, S1.f.d("registrationName", "onLoad"));
            return map;
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.T
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.T
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "align")
        public void setAlign(C1583v c1583v, String str) {
            c1583v.setAlign(str);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "height")
        public void setHeight(C1583v c1583v, Dynamic dynamic) {
            c1583v.v(dynamic);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "meetOrSlice")
        public void setMeetOrSlice(C1583v c1583v, int i7) {
            c1583v.setMeetOrSlice(i7);
        }

        @Override // F2.T
        @InterfaceC2218a(customType = "ImageSource", name = "src")
        public void setSrc(C1583v c1583v, ReadableMap readableMap) {
            c1583v.w(readableMap);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "width")
        public void setWidth(C1583v c1583v, Dynamic dynamic) {
            c1583v.x(dynamic);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "x")
        public void setX(C1583v c1583v, Dynamic dynamic) {
            c1583v.y(dynamic);
        }

        @Override // F2.T
        @InterfaceC2218a(name = "y")
        public void setY(C1583v c1583v, Dynamic dynamic) {
            c1583v.z(dynamic);
        }
    }

    static class LineViewManager extends RenderableViewManager<C1584w> implements F2.V {
        public static final String REACT_CLASS = "RNSVGLine";

        LineViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGLine);
            this.mDelegate = new F2.U(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.V
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.V
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "x1")
        public void setX1(C1584w c1584w, Dynamic dynamic) {
            c1584w.q(dynamic);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "x2")
        public void setX2(C1584w c1584w, Dynamic dynamic) {
            c1584w.r(dynamic);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "y1")
        public void setY1(C1584w c1584w, Dynamic dynamic) {
            c1584w.s(dynamic);
        }

        @Override // F2.V
        @InterfaceC2218a(name = "y2")
        public void setY2(C1584w c1584w, Dynamic dynamic) {
            c1584w.t(dynamic);
        }
    }

    static class LinearGradientManager extends VirtualViewManager<C1585x> implements F2.X {
        public static final String REACT_CLASS = "RNSVGLinearGradient";

        LinearGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGLinearGradient);
            this.mDelegate = new F2.W(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.X
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "gradient")
        public void setGradient(C1585x c1585x, ReadableArray readableArray) {
            c1585x.q(readableArray);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "gradientTransform")
        public void setGradientTransform(C1585x c1585x, ReadableArray readableArray) {
            c1585x.r(readableArray);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "gradientUnits")
        public void setGradientUnits(C1585x c1585x, int i7) {
            c1585x.s(i7);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "x1")
        public void setX1(C1585x c1585x, Dynamic dynamic) {
            c1585x.t(dynamic);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "x2")
        public void setX2(C1585x c1585x, Dynamic dynamic) {
            c1585x.u(dynamic);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "y1")
        public void setY1(C1585x c1585x, Dynamic dynamic) {
            c1585x.v(dynamic);
        }

        @Override // F2.X
        @InterfaceC2218a(name = "y2")
        public void setY2(C1585x c1585x, Dynamic dynamic) {
            c1585x.w(dynamic);
        }
    }

    static class MarkerManager extends GroupViewManagerAbstract<C1586y> implements F2.Z {
        public static final String REACT_CLASS = "RNSVGMarker";

        MarkerManager() {
            super(VirtualViewManager.SVGClass.RNSVGMarker);
            this.mDelegate = new F2.Y(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C1582u) view, dynamic);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C1582u) view, dynamic);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C1582u) view, dynamic);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.Z
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.Z
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "align")
        public void setAlign(C1586y c1586y, String str) {
            c1586y.setAlign(str);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "markerHeight")
        public void setMarkerHeight(C1586y c1586y, Dynamic dynamic) {
            c1586y.C(dynamic);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "markerUnits")
        public void setMarkerUnits(C1586y c1586y, String str) {
            c1586y.D(str);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "markerWidth")
        public void setMarkerWidth(C1586y c1586y, Dynamic dynamic) {
            c1586y.E(dynamic);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "meetOrSlice")
        public void setMeetOrSlice(C1586y c1586y, int i7) {
            c1586y.setMeetOrSlice(i7);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "minX")
        public void setMinX(C1586y c1586y, float f7) {
            c1586y.setMinX(f7);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "minY")
        public void setMinY(C1586y c1586y, float f7) {
            c1586y.setMinY(f7);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "orient")
        public void setOrient(C1586y c1586y, String str) {
            c1586y.F(str);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "refX")
        public void setRefX(C1586y c1586y, Dynamic dynamic) {
            c1586y.G(dynamic);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "refY")
        public void setRefY(C1586y c1586y, Dynamic dynamic) {
            c1586y.H(dynamic);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "vbHeight")
        public void setVbHeight(C1586y c1586y, float f7) {
            c1586y.setVbHeight(f7);
        }

        @Override // F2.Z
        @InterfaceC2218a(name = "vbWidth")
        public void setVbWidth(C1586y c1586y, float f7) {
            c1586y.setVbWidth(f7);
        }
    }

    static class MaskManager extends GroupViewManagerAbstract<C1587z> implements F2.b0 {
        public static final String REACT_CLASS = "RNSVGMask";

        MaskManager() {
            super(VirtualViewManager.SVGClass.RNSVGMask);
            this.mDelegate = new F2.a0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C1582u) view, dynamic);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C1582u) view, dynamic);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C1582u) view, dynamic);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.b0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.b0
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "height")
        public void setHeight(C1587z c1587z, Dynamic dynamic) {
            c1587z.C(dynamic);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "maskContentUnits")
        public void setMaskContentUnits(C1587z c1587z, int i7) {
            c1587z.D(i7);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "maskType")
        public void setMaskType(C1587z c1587z, int i7) {
            c1587z.E(i7);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "maskUnits")
        public void setMaskUnits(C1587z c1587z, int i7) {
            c1587z.F(i7);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "width")
        public void setWidth(C1587z c1587z, Dynamic dynamic) {
            c1587z.G(dynamic);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "x")
        public void setX(C1587z c1587z, Dynamic dynamic) {
            c1587z.H(dynamic);
        }

        @Override // F2.b0
        @InterfaceC2218a(name = "y")
        public void setY(C1587z c1587z, Dynamic dynamic) {
            c1587z.I(dynamic);
        }
    }

    static class PathViewManager extends RenderableViewManager<C> implements F2.d0 {
        public static final String REACT_CLASS = "RNSVGPath";

        PathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGPath);
            this.mDelegate = new F2.c0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.d0
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.d0
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.d0
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.d0
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.d0
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.d0
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.d0
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.d0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.d0
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.d0
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.d0
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.d0
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.d0
        @InterfaceC2218a(name = "d")
        public void setD(C c7, String str) {
            c7.q(str);
        }
    }

    static class PatternManager extends GroupViewManagerAbstract<D> implements F2.f0 {
        public static final String REACT_CLASS = "RNSVGPattern";

        PatternManager() {
            super(VirtualViewManager.SVGClass.RNSVGPattern);
            this.mDelegate = new F2.e0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C1582u) view, dynamic);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C1582u) view, dynamic);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C1582u) view, dynamic);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.f0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.f0
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "align")
        public void setAlign(D d7, String str) {
            d7.setAlign(str);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "height")
        public void setHeight(D d7, Dynamic dynamic) {
            d7.B(dynamic);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "meetOrSlice")
        public void setMeetOrSlice(D d7, int i7) {
            d7.setMeetOrSlice(i7);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "minX")
        public void setMinX(D d7, float f7) {
            d7.setMinX(f7);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "minY")
        public void setMinY(D d7, float f7) {
            d7.setMinY(f7);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "patternContentUnits")
        public void setPatternContentUnits(D d7, int i7) {
            d7.C(i7);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "patternTransform")
        public void setPatternTransform(D d7, ReadableArray readableArray) {
            d7.D(readableArray);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "patternUnits")
        public void setPatternUnits(D d7, int i7) {
            d7.E(i7);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "vbHeight")
        public void setVbHeight(D d7, float f7) {
            d7.setVbHeight(f7);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "vbWidth")
        public void setVbWidth(D d7, float f7) {
            d7.setVbWidth(f7);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "width")
        public void setWidth(D d7, Dynamic dynamic) {
            d7.F(dynamic);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "x")
        public void setX(D d7, Dynamic dynamic) {
            d7.G(dynamic);
        }

        @Override // F2.f0
        @InterfaceC2218a(name = "y")
        public void setY(D d7, Dynamic dynamic) {
            d7.H(dynamic);
        }
    }

    static class RadialGradientManager extends VirtualViewManager<I> implements F2.h0 {
        public static final String REACT_CLASS = "RNSVGRadialGradient";

        RadialGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
            this.mDelegate = new F2.g0(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.h0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "cx")
        public void setCx(I i7, Dynamic dynamic) {
            i7.q(dynamic);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "cy")
        public void setCy(I i7, Dynamic dynamic) {
            i7.r(dynamic);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "fx")
        public void setFx(I i7, Dynamic dynamic) {
            i7.s(dynamic);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "fy")
        public void setFy(I i7, Dynamic dynamic) {
            i7.t(dynamic);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "gradient")
        public void setGradient(I i7, ReadableArray readableArray) {
            i7.u(readableArray);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "gradientTransform")
        public void setGradientTransform(I i7, ReadableArray readableArray) {
            i7.v(readableArray);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "gradientUnits")
        public void setGradientUnits(I i7, int i8) {
            i7.w(i8);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "rx")
        public void setRx(I i7, Dynamic dynamic) {
            i7.x(dynamic);
        }

        @Override // F2.h0
        @InterfaceC2218a(name = "ry")
        public void setRy(I i7, Dynamic dynamic) {
            i7.y(dynamic);
        }
    }

    static class RectViewManager extends RenderableViewManager<J> implements F2.j0 {
        public static final String REACT_CLASS = "RNSVGRect";

        RectViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGRect);
            this.mDelegate = new F2.i0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.j0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.j0
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "height")
        public void setHeight(J j7, Dynamic dynamic) {
            j7.q(dynamic);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "rx")
        public void setRx(J j7, Dynamic dynamic) {
            j7.r(dynamic);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "ry")
        public void setRy(J j7, Dynamic dynamic) {
            j7.s(dynamic);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "width")
        public void setWidth(J j7, Dynamic dynamic) {
            j7.t(dynamic);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "x")
        public void setX(J j7, Dynamic dynamic) {
            j7.u(dynamic);
        }

        @Override // F2.j0
        @InterfaceC2218a(name = "y")
        public void setY(J j7, Dynamic dynamic) {
            j7.v(dynamic);
        }
    }

    static class SymbolManager extends GroupViewManagerAbstract<L> implements n0 {
        public static final String REACT_CLASS = "RNSVGSymbol";

        SymbolManager() {
            super(VirtualViewManager.SVGClass.RNSVGSymbol);
            this.mDelegate = new m0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((C1582u) view, dynamic);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C1582u) view, dynamic);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C1582u) view, dynamic);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.n0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.n0
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "align")
        public void setAlign(L l7, String str) {
            l7.setAlign(str);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "meetOrSlice")
        public void setMeetOrSlice(L l7, int i7) {
            l7.setMeetOrSlice(i7);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "minX")
        public void setMinX(L l7, float f7) {
            l7.setMinX(f7);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "minY")
        public void setMinY(L l7, float f7) {
            l7.setMinY(f7);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "vbHeight")
        public void setVbHeight(L l7, float f7) {
            l7.setVbHeight(f7);
        }

        @Override // F2.n0
        @InterfaceC2218a(name = "vbWidth")
        public void setVbWidth(L l7, float f7) {
            l7.setVbWidth(f7);
        }
    }

    static class TSpanViewManager extends TextViewManagerAbstract<U> implements p0 {
        public static final String REACT_CLASS = "RNSVGTSpan";

        TSpanViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTSpan);
            this.mDelegate = new o0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.p0
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((h0) view, str);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((h0) view, dynamic);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((h0) view, dynamic);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((h0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h0) view, dynamic);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C1582u) view, dynamic);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C1582u) view, dynamic);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((h0) view, dynamic);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((h0) view, str);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.p0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((h0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((h0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.p0
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((h0) view, dynamic);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((h0) view, dynamic);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((h0) view, dynamic);
        }

        TSpanViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new o0(this);
        }

        @Override // F2.p0
        @InterfaceC2218a(name = "content")
        public void setContent(U u6, String str) {
            u6.Z(str);
        }
    }

    static class TextPathViewManager extends TextViewManagerAbstract<V> implements t0 {
        public static final String REACT_CLASS = "RNSVGTextPath";

        TextPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTextPath);
            this.mDelegate = new s0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.t0
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((h0) view, str);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((h0) view, dynamic);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((h0) view, dynamic);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((h0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h0) view, dynamic);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C1582u) view, dynamic);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C1582u) view, dynamic);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((h0) view, dynamic);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((h0) view, str);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.t0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((h0) view, dynamic);
        }

        @InterfaceC2218a(name = "midLine")
        public void setSharp(V v6, String str) {
            v6.X(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((h0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.t0
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((h0) view, dynamic);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((h0) view, dynamic);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((h0) view, dynamic);
        }

        TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new s0(this);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "href")
        public void setHref(V v6, String str) {
            v6.W(str);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract
        @InterfaceC2218a(name = "method")
        public void setMethod(V v6, String str) {
            v6.M(str);
        }

        @Override // F2.t0
        public void setMidLine(V v6, String str) {
            v6.X(str);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "side")
        public void setSide(V v6, String str) {
            v6.Y(str);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "spacing")
        public void setSpacing(V v6, String str) {
            v6.Z(str);
        }

        @Override // F2.t0
        @InterfaceC2218a(name = "startOffset")
        public void setStartOffset(V v6, Dynamic dynamic) {
            v6.a0(dynamic);
        }
    }

    static class TextViewManager extends TextViewManagerAbstract<h0> implements r0 {
        public static final String REACT_CLASS = "RNSVGText";

        TextViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGText);
            this.mDelegate = new q0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.r0
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((h0) view, str);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((h0) view, dynamic);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((h0) view, dynamic);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((h0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h0) view, dynamic);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((C1582u) view, dynamic);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((C1582u) view, dynamic);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((h0) view, dynamic);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((h0) view, str);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.r0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((h0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((h0) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.r0
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((h0) view, dynamic);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((h0) view, dynamic);
        }

        @Override // F2.r0
        @InterfaceC2218a(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((h0) view, dynamic);
        }

        TextViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            this.mDelegate = new q0(this);
        }
    }

    static class TextViewManagerAbstract<K extends h0> extends GroupViewManagerAbstract<K> {
        TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        public void setAlignmentBaseline(K k7, String str) {
            k7.M(str);
        }

        @InterfaceC2218a(name = "baselineShift")
        public void setBaselineShift(K k7, Dynamic dynamic) {
            k7.H(dynamic);
        }

        @InterfaceC2218a(name = "dx")
        public void setDx(K k7, Dynamic dynamic) {
            k7.I(dynamic);
        }

        @InterfaceC2218a(name = "dy")
        public void setDy(K k7, Dynamic dynamic) {
            k7.J(dynamic);
        }

        @InterfaceC2218a(name = "inlineSize")
        public void setInlineSize(K k7, Dynamic dynamic) {
            k7.K(dynamic);
        }

        @InterfaceC2218a(name = "lengthAdjust")
        public void setLengthAdjust(K k7, String str) {
            k7.L(str);
        }

        @InterfaceC2218a(name = "alignmentBaseline")
        public void setMethod(K k7, String str) {
            k7.M(str);
        }

        @InterfaceC2218a(name = "rotate")
        public void setRotate(K k7, Dynamic dynamic) {
            k7.P(dynamic);
        }

        @InterfaceC2218a(name = "textLength")
        public void setTextLength(K k7, Dynamic dynamic) {
            k7.Q(dynamic);
        }

        @InterfaceC2218a(name = "verticalAlign")
        public void setVerticalAlign(K k7, Dynamic dynamic) {
            k7.R(dynamic);
        }

        @InterfaceC2218a(name = "x")
        public void setX(K k7, Dynamic dynamic) {
            k7.N(dynamic);
        }

        @InterfaceC2218a(name = "y")
        public void setY(K k7, Dynamic dynamic) {
            k7.O(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract
        @InterfaceC2218a(name = "font")
        public void setFont(K k7, Dynamic dynamic) {
            k7.y(dynamic);
        }
    }

    static class UseViewManager extends RenderableViewManager<i0> implements v0 {
        public static final String REACT_CLASS = "RNSVGUse";

        UseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGUse);
            this.mDelegate = new u0(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i7) {
            super.setClipRule((VirtualView) view, i7);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        public /* bridge */ /* synthetic */ void setFill(View view, ReadableMap readableMap) {
            super.setFill((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f7) {
            super.setFillOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        @InterfaceC2218a(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i7) {
            super.setFillRule((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        @InterfaceC2218a(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // F2.v0
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
        @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f7) {
            super.setOpacity((VirtualView) view, f7);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        @InterfaceC2218a(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z6) {
            super.setResponsible((VirtualView) view, z6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        public /* bridge */ /* synthetic */ void setStroke(View view, ReadableMap readableMap) {
            super.setStroke((RenderableView) view, readableMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        @InterfaceC2218a(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        @InterfaceC2218a(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f7) {
            super.setStrokeDashoffset((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i7) {
            super.setStrokeLinecap((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i7) {
            super.setStrokeLinejoin((RenderableView) view, i7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f7) {
            super.setStrokeMiterlimit((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f7) {
            super.setStrokeOpacity((RenderableView) view, f7);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        @InterfaceC2218a(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // F2.v0
        @InterfaceC2218a(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i7) {
            super.setVectorEffect((RenderableView) view, i7);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "height")
        public void setHeight(i0 i0Var, Dynamic dynamic) {
            i0Var.q(dynamic);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "href")
        public void setHref(i0 i0Var, String str) {
            i0Var.r(str);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "width")
        public void setWidth(i0 i0Var, Dynamic dynamic) {
            i0Var.s(dynamic);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "x")
        public void setX(i0 i0Var, Dynamic dynamic) {
            i0Var.t(dynamic);
        }

        @Override // F2.v0
        @InterfaceC2218a(name = "y")
        public void setY(i0 i0Var, Dynamic dynamic) {
            i0Var.u(dynamic);
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17817a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f17817a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17817a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    RenderableViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @InterfaceC2218a(name = "fill")
    public void setFill(T t6, Dynamic dynamic) {
        t6.setFill(dynamic);
    }

    @InterfaceC2218a(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(T t6, float f7) {
        t6.setFillOpacity(f7);
    }

    @InterfaceC2218a(defaultInt = 1, name = "fillRule")
    public void setFillRule(T t6, int i7) {
        t6.setFillRule(i7);
    }

    @InterfaceC2218a(name = "filter")
    public void setFilter(T t6, String str) {
        t6.setFilter(str);
    }

    @InterfaceC2218a(name = "propList")
    public void setPropList(T t6, ReadableArray readableArray) {
        t6.setPropList(readableArray);
    }

    @InterfaceC2218a(name = "stroke")
    public void setStroke(T t6, Dynamic dynamic) {
        t6.setStroke(dynamic);
    }

    @InterfaceC2218a(name = "strokeDasharray")
    public void setStrokeDasharray(T t6, Dynamic dynamic) {
        t6.setStrokeDasharray(dynamic);
    }

    @InterfaceC2218a(name = "strokeDashoffset")
    public void setStrokeDashoffset(T t6, float f7) {
        t6.setStrokeDashoffset(f7);
    }

    @InterfaceC2218a(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(T t6, int i7) {
        t6.setStrokeLinecap(i7);
    }

    @InterfaceC2218a(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(T t6, int i7) {
        t6.setStrokeLinejoin(i7);
    }

    @InterfaceC2218a(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(T t6, float f7) {
        t6.setStrokeMiterlimit(f7);
    }

    @InterfaceC2218a(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(T t6, float f7) {
        t6.setStrokeOpacity(f7);
    }

    @InterfaceC2218a(name = "strokeWidth")
    public void setStrokeWidth(T t6, Dynamic dynamic) {
        t6.setStrokeWidth(dynamic);
    }

    @InterfaceC2218a(name = "vectorEffect")
    public void setVectorEffect(T t6, int i7) {
        t6.setVectorEffect(i7);
    }

    public void setFill(T t6, ReadableMap readableMap) {
        t6.setFill(readableMap);
    }

    public void setStroke(T t6, ReadableMap readableMap) {
        t6.setStroke(readableMap);
    }
}
