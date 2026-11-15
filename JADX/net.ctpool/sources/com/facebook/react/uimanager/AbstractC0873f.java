package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: renamed from: com.facebook.react.uimanager.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0873f implements A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final InterfaceC0875g f12591a;

    public AbstractC0873f(InterfaceC0875g interfaceC0875g) {
        this.f12591a = interfaceC0875g;
    }

    @Override // com.facebook.react.uimanager.A0
    public void a(View view, String str, ReadableArray readableArray) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.react.uimanager.A0
    public void b(View view, String str, Object obj) {
        str.hashCode();
        switch (str) {
            case "translateX":
                this.f12591a.setTranslateX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "translateY":
                this.f12591a.setTranslateY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "shadowColor":
                this.f12591a.setShadowColor(view, obj != null ? ColorPropConverter.getColor(obj, view.getContext()).intValue() : 0);
                break;
            case "opacity":
                this.f12591a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "borderTopLeftRadius":
                this.f12591a.setBorderTopLeftRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "scaleX":
                this.f12591a.setScaleX(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "scaleY":
                this.f12591a.setScaleY(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case "testID":
                this.f12591a.setTestId(view, (String) obj);
                break;
            case "transformOrigin":
                this.f12591a.setTransformOrigin(view, (ReadableArray) obj);
                break;
            case "zIndex":
                this.f12591a.setZIndex(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "accessibilityHint":
                this.f12591a.setAccessibilityHint(view, (String) obj);
                break;
            case "accessibilityRole":
                this.f12591a.setAccessibilityRole(view, (String) obj);
                break;
            case "renderToHardwareTextureAndroid":
                this.f12591a.setRenderToHardwareTexture(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "rotation":
                this.f12591a.setRotation(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "elevation":
                this.f12591a.setElevation(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case "role":
                this.f12591a.setRole(view, (String) obj);
                break;
            case "accessibilityLiveRegion":
                this.f12591a.setAccessibilityLiveRegion(view, (String) obj);
                break;
            case "borderTopRightRadius":
                this.f12591a.setBorderTopRightRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "borderBottomLeftRadius":
                this.f12591a.setBorderBottomLeftRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "borderBottomRightRadius":
                this.f12591a.setBorderBottomRightRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "importantForAccessibility":
                this.f12591a.setImportantForAccessibility(view, (String) obj);
                break;
            case "transform":
                this.f12591a.setTransform(view, (ReadableArray) obj);
                break;
            case "accessibilityLabel":
                this.f12591a.setAccessibilityLabel(view, (String) obj);
                break;
            case "accessibilityState":
                this.f12591a.setViewState(view, (ReadableMap) obj);
                break;
            case "backgroundColor":
                this.f12591a.setBackgroundColor(view, obj != null ? ColorPropConverter.getColor(obj, view.getContext()).intValue() : 0);
                break;
            case "borderRadius":
                this.f12591a.setBorderRadius(view, obj != null ? ((Double) obj).floatValue() : Float.NaN);
                break;
            case "accessibilityActions":
                this.f12591a.setAccessibilityActions(view, (ReadableArray) obj);
                break;
            case "accessibilityCollection":
                this.f12591a.setAccessibilityCollection(view, (ReadableMap) obj);
                break;
            case "accessibilityLabelledBy":
                this.f12591a.setAccessibilityLabelledBy(view, new DynamicFromObject(obj));
                break;
            case "accessibilityCollectionItem":
                this.f12591a.setAccessibilityCollectionItem(view, (ReadableMap) obj);
                break;
            case "nativeID":
                this.f12591a.setNativeId(view, (String) obj);
                break;
        }
    }
}
