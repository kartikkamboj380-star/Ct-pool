package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import e.AbstractC1609a;
import e.AbstractC1614f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import y.AbstractC2231c;

/* JADX INFO: loaded from: classes.dex */
class b0 extends AbstractC2231c implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final WeakHashMap f5985A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final int f5986B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f5987C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f5988D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private ColorStateList f5989E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f5990F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f5991G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f5992H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f5993I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f5994J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f5995K;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final SearchView f5996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final SearchableInfo f5997y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Context f5998z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f5999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f6000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f6001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f6002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f6003e;

        public a(View view) {
            this.f5999a = (TextView) view.findViewById(R.id.text1);
            this.f6000b = (TextView) view.findViewById(R.id.text2);
            this.f6001c = (ImageView) view.findViewById(R.id.icon1);
            this.f6002d = (ImageView) view.findViewById(R.id.icon2);
            this.f6003e = (ImageView) view.findViewById(AbstractC1614f.f18853q);
        }
    }

    public b0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f5987C = false;
        this.f5988D = 1;
        this.f5990F = -1;
        this.f5991G = -1;
        this.f5992H = -1;
        this.f5993I = -1;
        this.f5994J = -1;
        this.f5995K = -1;
        this.f5996x = searchView;
        this.f5997y = searchableInfo;
        this.f5986B = searchView.getSuggestionCommitIconResId();
        this.f5998z = context;
        this.f5985A = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f5985A.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f5985A.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f5989E == null) {
            TypedValue typedValue = new TypedValue();
            this.f5998z.getTheme().resolveAttribute(AbstractC1609a.f18725J, typedValue, true);
            this.f5989E = this.f5998z.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f5989E, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) {
        String string;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f5998z.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e7) {
            string = e7.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        string = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", string);
        return null;
    }

    private Drawable n(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f5985A.containsKey(strFlattenToShortString)) {
            Drawable drawableM = m(componentName);
            this.f5985A.put(strFlattenToShortString, drawableM != null ? drawableM.getConstantState() : null);
            return drawableM;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f5985A.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f5998z.getResources());
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p() {
        Drawable drawableN = n(this.f5997y.getSearchActivity());
        return drawableN != null ? drawableN : this.f5998z.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f5998z.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e7) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e7);
                }
            }
        } catch (FileNotFoundException e8) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e8.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e8.getMessage());
        return null;
    }

    private Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i7 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f5998z.getPackageName() + "/" + i7;
            Drawable drawableK = k(str2);
            if (drawableK != null) {
                return drawableK;
            }
            Drawable drawableE = androidx.core.content.b.e(this.f5998z, i7);
            A(str2, drawableE);
            return drawableE;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableK2 = k(str);
            if (drawableK2 != null) {
                return drawableK2;
            }
            Drawable drawableQ = q(Uri.parse(str));
            A(str, drawableQ);
            return drawableQ;
        }
    }

    private Drawable t(Cursor cursor) {
        int i7 = this.f5993I;
        if (i7 == -1) {
            return null;
        }
        Drawable drawableS = s(cursor.getString(i7));
        return drawableS != null ? drawableS : p();
    }

    private Drawable u(Cursor cursor) {
        int i7 = this.f5994J;
        if (i7 == -1) {
            return null;
        }
        return s(cursor.getString(i7));
    }

    private static String w(Cursor cursor, int i7) {
        if (i7 == -1) {
            return null;
        }
        try {
            return cursor.getString(i7);
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i7) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i7);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // y.AbstractC2229a, y.C2230b.a
    public void a(Cursor cursor) {
        if (this.f5987C) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f5990F = cursor.getColumnIndex("suggest_text_1");
                this.f5991G = cursor.getColumnIndex("suggest_text_2");
                this.f5992H = cursor.getColumnIndex("suggest_text_2_url");
                this.f5993I = cursor.getColumnIndex("suggest_icon_1");
                this.f5994J = cursor.getColumnIndex("suggest_icon_2");
                this.f5995K = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e7);
        }
    }

    @Override // y.AbstractC2229a, y.C2230b.a
    public CharSequence c(Cursor cursor) {
        String strO;
        String strO2;
        if (cursor == null) {
            return null;
        }
        String strO3 = o(cursor, "suggest_intent_query");
        if (strO3 != null) {
            return strO3;
        }
        if (this.f5997y.shouldRewriteQueryFromData() && (strO2 = o(cursor, "suggest_intent_data")) != null) {
            return strO2;
        }
        if (!this.f5997y.shouldRewriteQueryFromText() || (strO = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strO;
    }

    @Override // y.C2230b.a
    public Cursor d(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f5996x.getVisibility() == 0 && this.f5996x.getWindowVisibility() == 0) {
            try {
                Cursor cursorV = v(this.f5997y, string, 50);
                if (cursorV != null) {
                    cursorV.getCount();
                    return cursorV;
                }
            } catch (RuntimeException e7) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e7);
            }
        }
        return null;
    }

    @Override // y.AbstractC2229a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i7 = this.f5995K;
        int i8 = i7 != -1 ? cursor.getInt(i7) : 0;
        if (aVar.f5999a != null) {
            z(aVar.f5999a, w(cursor, this.f5990F));
        }
        if (aVar.f6000b != null) {
            String strW = w(cursor, this.f5992H);
            CharSequence charSequenceL = strW != null ? l(strW) : w(cursor, this.f5991G);
            if (TextUtils.isEmpty(charSequenceL)) {
                TextView textView = aVar.f5999a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f5999a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f5999a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f5999a.setMaxLines(1);
                }
            }
            z(aVar.f6000b, charSequenceL);
        }
        ImageView imageView = aVar.f6001c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f6002d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i9 = this.f5988D;
        if (i9 != 2 && (i9 != 1 || (i8 & 1) == 0)) {
            aVar.f6003e.setVisibility(8);
            return;
        }
        aVar.f6003e.setVisibility(0);
        aVar.f6003e.setTag(aVar.f5999a.getText());
        aVar.f6003e.setOnClickListener(this);
    }

    @Override // y.AbstractC2229a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View viewG = g(this.f5998z, b(), viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f5999a.setText(e7.toString());
            }
            return viewG;
        }
    }

    @Override // y.AbstractC2229a, android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i7, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View viewH = h(this.f5998z, b(), viewGroup);
            if (viewH != null) {
                ((a) viewH.getTag()).f5999a.setText(e7.toString());
            }
            return viewH;
        }
    }

    @Override // y.AbstractC2231c, y.AbstractC2229a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewH = super.h(context, cursor, viewGroup);
        viewH.setTag(new a(viewH));
        ((ImageView) viewH.findViewById(AbstractC1614f.f18853q)).setImageResource(this.f5986B);
        return viewH;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f5996x.U((CharSequence) tag);
        }
    }

    Drawable r(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f5998z.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor v(SearchableInfo searchableInfo, String str, int i7) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i7 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i7));
        }
        return this.f5998z.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i7) {
        this.f5988D = i7;
    }
}
