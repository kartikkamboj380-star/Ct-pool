package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
class p implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final w f8186m;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C f8187m;

        a(C c7) {
            this.f8187m = c7;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f8187m.k();
            this.f8187m.m();
            K.n((ViewGroup) fragmentK.mView.getParent(), p.this.f8186m).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    p(w wVar) {
        this.f8186m = wVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C cW;
        StringBuilder sb;
        String str2;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f8186m);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K.c.f1834a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(K.c.f1835b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(K.c.f1836c, -1);
        String string = typedArrayObtainStyledAttributes.getString(K.c.f1837d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !n.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentJ0 = resourceId != -1 ? this.f8186m.j0(resourceId) : null;
        if (fragmentJ0 == null && string != null) {
            fragmentJ0 = this.f8186m.k0(string);
        }
        if (fragmentJ0 == null && id != -1) {
            fragmentJ0 = this.f8186m.j0(id);
        }
        if (fragmentJ0 == null) {
            fragmentJ0 = this.f8186m.u0().a(context.getClassLoader(), attributeValue);
            fragmentJ0.mFromLayout = true;
            fragmentJ0.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentJ0.mContainerId = id;
            fragmentJ0.mTag = string;
            fragmentJ0.mInLayout = true;
            w wVar = this.f8186m;
            fragmentJ0.mFragmentManager = wVar;
            fragmentJ0.mHost = wVar.w0();
            fragmentJ0.onInflate(this.f8186m.w0().n(), attributeSet, fragmentJ0.mSavedFragmentState);
            cW = this.f8186m.j(fragmentJ0);
            if (w.J0(2)) {
                sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragmentJ0);
                str2 = " has been inflated via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb.toString());
            }
        } else {
            if (fragmentJ0.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentJ0.mInLayout = true;
            w wVar2 = this.f8186m;
            fragmentJ0.mFragmentManager = wVar2;
            fragmentJ0.mHost = wVar2.w0();
            fragmentJ0.onInflate(this.f8186m.w0().n(), attributeSet, fragmentJ0.mSavedFragmentState);
            cW = this.f8186m.w(fragmentJ0);
            if (w.J0(2)) {
                sb = new StringBuilder();
                sb.append("Retained Fragment ");
                sb.append(fragmentJ0);
                str2 = " has been re-attached via the <fragment> tag: id=0x";
                sb.append(str2);
                sb.append(Integer.toHexString(resourceId));
                Log.v("FragmentManager", sb.toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        L.c.g(fragmentJ0, viewGroup);
        fragmentJ0.mContainer = viewGroup;
        cW.m();
        cW.j();
        View view2 = fragmentJ0.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentJ0.mView.getTag() == null) {
            fragmentJ0.mView.setTag(string);
        }
        fragmentJ0.mView.addOnAttachStateChangeListener(new a(cW));
        return fragmentJ0.mView;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
