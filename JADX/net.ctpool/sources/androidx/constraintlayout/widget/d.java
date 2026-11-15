package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import o.C1931a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC1957a;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f6412d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static SparseIntArray f6413e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap f6414a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6415b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f6416c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0129d f6418b = new C0129d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f6419c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f6420d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e f6421e = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public HashMap f6422f = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i7, ConstraintLayout.b bVar) {
            this.f6417a = i7;
            b bVar2 = this.f6420d;
            bVar2.f6464h = bVar.f6329d;
            bVar2.f6466i = bVar.f6331e;
            bVar2.f6468j = bVar.f6333f;
            bVar2.f6470k = bVar.f6335g;
            bVar2.f6471l = bVar.f6337h;
            bVar2.f6472m = bVar.f6339i;
            bVar2.f6473n = bVar.f6341j;
            bVar2.f6474o = bVar.f6343k;
            bVar2.f6475p = bVar.f6345l;
            bVar2.f6476q = bVar.f6353p;
            bVar2.f6477r = bVar.f6354q;
            bVar2.f6478s = bVar.f6355r;
            bVar2.f6479t = bVar.f6356s;
            bVar2.f6480u = bVar.f6363z;
            bVar2.f6481v = bVar.f6297A;
            bVar2.f6482w = bVar.f6298B;
            bVar2.f6483x = bVar.f6347m;
            bVar2.f6484y = bVar.f6349n;
            bVar2.f6485z = bVar.f6351o;
            bVar2.f6424A = bVar.f6313Q;
            bVar2.f6425B = bVar.f6314R;
            bVar2.f6426C = bVar.f6315S;
            bVar2.f6462g = bVar.f6327c;
            bVar2.f6458e = bVar.f6323a;
            bVar2.f6460f = bVar.f6325b;
            bVar2.f6454c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f6456d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f6427D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f6428E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f6429F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f6430G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f6439P = bVar.f6302F;
            bVar2.f6440Q = bVar.f6301E;
            bVar2.f6442S = bVar.f6304H;
            bVar2.f6441R = bVar.f6303G;
            bVar2.f6465h0 = bVar.f6316T;
            bVar2.f6467i0 = bVar.f6317U;
            bVar2.f6443T = bVar.f6305I;
            bVar2.f6444U = bVar.f6306J;
            bVar2.f6445V = bVar.f6309M;
            bVar2.f6446W = bVar.f6310N;
            bVar2.f6447X = bVar.f6307K;
            bVar2.f6448Y = bVar.f6308L;
            bVar2.f6449Z = bVar.f6311O;
            bVar2.f6451a0 = bVar.f6312P;
            bVar2.f6463g0 = bVar.f6318V;
            bVar2.f6434K = bVar.f6358u;
            bVar2.f6436M = bVar.f6360w;
            bVar2.f6433J = bVar.f6357t;
            bVar2.f6435L = bVar.f6359v;
            bVar2.f6438O = bVar.f6361x;
            bVar2.f6437N = bVar.f6362y;
            bVar2.f6431H = bVar.getMarginEnd();
            this.f6420d.f6432I = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f6420d;
            bVar.f6329d = bVar2.f6464h;
            bVar.f6331e = bVar2.f6466i;
            bVar.f6333f = bVar2.f6468j;
            bVar.f6335g = bVar2.f6470k;
            bVar.f6337h = bVar2.f6471l;
            bVar.f6339i = bVar2.f6472m;
            bVar.f6341j = bVar2.f6473n;
            bVar.f6343k = bVar2.f6474o;
            bVar.f6345l = bVar2.f6475p;
            bVar.f6353p = bVar2.f6476q;
            bVar.f6354q = bVar2.f6477r;
            bVar.f6355r = bVar2.f6478s;
            bVar.f6356s = bVar2.f6479t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f6427D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f6428E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f6429F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f6430G;
            bVar.f6361x = bVar2.f6438O;
            bVar.f6362y = bVar2.f6437N;
            bVar.f6358u = bVar2.f6434K;
            bVar.f6360w = bVar2.f6436M;
            bVar.f6363z = bVar2.f6480u;
            bVar.f6297A = bVar2.f6481v;
            bVar.f6347m = bVar2.f6483x;
            bVar.f6349n = bVar2.f6484y;
            bVar.f6351o = bVar2.f6485z;
            bVar.f6298B = bVar2.f6482w;
            bVar.f6313Q = bVar2.f6424A;
            bVar.f6314R = bVar2.f6425B;
            bVar.f6302F = bVar2.f6439P;
            bVar.f6301E = bVar2.f6440Q;
            bVar.f6304H = bVar2.f6442S;
            bVar.f6303G = bVar2.f6441R;
            bVar.f6316T = bVar2.f6465h0;
            bVar.f6317U = bVar2.f6467i0;
            bVar.f6305I = bVar2.f6443T;
            bVar.f6306J = bVar2.f6444U;
            bVar.f6309M = bVar2.f6445V;
            bVar.f6310N = bVar2.f6446W;
            bVar.f6307K = bVar2.f6447X;
            bVar.f6308L = bVar2.f6448Y;
            bVar.f6311O = bVar2.f6449Z;
            bVar.f6312P = bVar2.f6451a0;
            bVar.f6315S = bVar2.f6426C;
            bVar.f6327c = bVar2.f6462g;
            bVar.f6323a = bVar2.f6458e;
            bVar.f6325b = bVar2.f6460f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f6454c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f6456d;
            String str = bVar2.f6463g0;
            if (str != null) {
                bVar.f6318V = str;
            }
            bVar.setMarginStart(bVar2.f6432I);
            bVar.setMarginEnd(this.f6420d.f6431H);
            bVar.a();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f6420d.a(this.f6420d);
            aVar.f6419c.a(this.f6419c);
            aVar.f6418b.a(this.f6418b);
            aVar.f6421e.a(this.f6421e);
            aVar.f6417a = this.f6417a;
            return aVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        private static SparseIntArray f6423k0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6456d;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int[] f6459e0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public String f6461f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public String f6463g0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6450a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6452b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6458e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6460f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f6462g = -1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6464h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f6466i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6468j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f6470k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f6471l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f6472m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f6473n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f6474o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f6475p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f6476q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f6477r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f6478s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f6479t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f6480u = 0.5f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f6481v = 0.5f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f6482w = null;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f6483x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f6484y = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f6485z = 0.0f;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f6424A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f6425B = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f6426C = -1;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f6427D = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f6428E = -1;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f6429F = -1;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f6430G = -1;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f6431H = -1;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f6432I = -1;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f6433J = -1;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f6434K = -1;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f6435L = -1;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f6436M = -1;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f6437N = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f6438O = -1;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f6439P = -1.0f;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public float f6440Q = -1.0f;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f6441R = 0;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f6442S = 0;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f6443T = 0;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f6444U = 0;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public int f6445V = -1;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public int f6446W = -1;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f6447X = -1;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f6448Y = -1;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public float f6449Z = 1.0f;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public float f6451a0 = 1.0f;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f6453b0 = -1;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f6455c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f6457d0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f6465h0 = false;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f6467i0 = false;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f6469j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6423k0 = sparseIntArray;
            sparseIntArray.append(g.f6764q3, 24);
            f6423k0.append(g.f6770r3, 25);
            f6423k0.append(g.f6782t3, 28);
            f6423k0.append(g.f6788u3, 29);
            f6423k0.append(g.f6818z3, 35);
            f6423k0.append(g.f6812y3, 34);
            f6423k0.append(g.f6674b3, 4);
            f6423k0.append(g.f6668a3, 3);
            f6423k0.append(g.f6657Y2, 1);
            f6423k0.append(g.f6541E3, 6);
            f6423k0.append(g.f6547F3, 7);
            f6423k0.append(g.f6716i3, 17);
            f6423k0.append(g.f6722j3, 18);
            f6423k0.append(g.f6728k3, 19);
            f6423k0.append(g.f6570J2, 26);
            f6423k0.append(g.f6794v3, 31);
            f6423k0.append(g.f6800w3, 32);
            f6423k0.append(g.f6710h3, 10);
            f6423k0.append(g.f6704g3, 9);
            f6423k0.append(g.f6565I3, 13);
            f6423k0.append(g.f6583L3, 16);
            f6423k0.append(g.f6571J3, 14);
            f6423k0.append(g.f6553G3, 11);
            f6423k0.append(g.f6577K3, 15);
            f6423k0.append(g.f6559H3, 12);
            f6423k0.append(g.f6529C3, 38);
            f6423k0.append(g.f6752o3, 37);
            f6423k0.append(g.f6746n3, 39);
            f6423k0.append(g.f6523B3, 40);
            f6423k0.append(g.f6740m3, 20);
            f6423k0.append(g.f6517A3, 36);
            f6423k0.append(g.f6698f3, 5);
            f6423k0.append(g.f6758p3, 76);
            f6423k0.append(g.f6806x3, 76);
            f6423k0.append(g.f6776s3, 76);
            f6423k0.append(g.f6662Z2, 76);
            f6423k0.append(g.f6652X2, 76);
            f6423k0.append(g.f6588M2, 23);
            f6423k0.append(g.f6600O2, 27);
            f6423k0.append(g.f6612Q2, 30);
            f6423k0.append(g.f6618R2, 8);
            f6423k0.append(g.f6594N2, 33);
            f6423k0.append(g.f6606P2, 2);
            f6423k0.append(g.f6576K2, 22);
            f6423k0.append(g.f6582L2, 21);
            f6423k0.append(g.f6680c3, 61);
            f6423k0.append(g.f6692e3, 62);
            f6423k0.append(g.f6686d3, 63);
            f6423k0.append(g.f6535D3, 69);
            f6423k0.append(g.f6734l3, 70);
            f6423k0.append(g.f6642V2, 71);
            f6423k0.append(g.f6630T2, 72);
            f6423k0.append(g.f6636U2, 73);
            f6423k0.append(g.f6647W2, 74);
            f6423k0.append(g.f6624S2, 75);
        }

        public void a(b bVar) {
            this.f6450a = bVar.f6450a;
            this.f6454c = bVar.f6454c;
            this.f6452b = bVar.f6452b;
            this.f6456d = bVar.f6456d;
            this.f6458e = bVar.f6458e;
            this.f6460f = bVar.f6460f;
            this.f6462g = bVar.f6462g;
            this.f6464h = bVar.f6464h;
            this.f6466i = bVar.f6466i;
            this.f6468j = bVar.f6468j;
            this.f6470k = bVar.f6470k;
            this.f6471l = bVar.f6471l;
            this.f6472m = bVar.f6472m;
            this.f6473n = bVar.f6473n;
            this.f6474o = bVar.f6474o;
            this.f6475p = bVar.f6475p;
            this.f6476q = bVar.f6476q;
            this.f6477r = bVar.f6477r;
            this.f6478s = bVar.f6478s;
            this.f6479t = bVar.f6479t;
            this.f6480u = bVar.f6480u;
            this.f6481v = bVar.f6481v;
            this.f6482w = bVar.f6482w;
            this.f6483x = bVar.f6483x;
            this.f6484y = bVar.f6484y;
            this.f6485z = bVar.f6485z;
            this.f6424A = bVar.f6424A;
            this.f6425B = bVar.f6425B;
            this.f6426C = bVar.f6426C;
            this.f6427D = bVar.f6427D;
            this.f6428E = bVar.f6428E;
            this.f6429F = bVar.f6429F;
            this.f6430G = bVar.f6430G;
            this.f6431H = bVar.f6431H;
            this.f6432I = bVar.f6432I;
            this.f6433J = bVar.f6433J;
            this.f6434K = bVar.f6434K;
            this.f6435L = bVar.f6435L;
            this.f6436M = bVar.f6436M;
            this.f6437N = bVar.f6437N;
            this.f6438O = bVar.f6438O;
            this.f6439P = bVar.f6439P;
            this.f6440Q = bVar.f6440Q;
            this.f6441R = bVar.f6441R;
            this.f6442S = bVar.f6442S;
            this.f6443T = bVar.f6443T;
            this.f6444U = bVar.f6444U;
            this.f6445V = bVar.f6445V;
            this.f6446W = bVar.f6446W;
            this.f6447X = bVar.f6447X;
            this.f6448Y = bVar.f6448Y;
            this.f6449Z = bVar.f6449Z;
            this.f6451a0 = bVar.f6451a0;
            this.f6453b0 = bVar.f6453b0;
            this.f6455c0 = bVar.f6455c0;
            this.f6457d0 = bVar.f6457d0;
            this.f6463g0 = bVar.f6463g0;
            int[] iArr = bVar.f6459e0;
            if (iArr != null) {
                this.f6459e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f6459e0 = null;
            }
            this.f6461f0 = bVar.f6461f0;
            this.f6465h0 = bVar.f6465h0;
            this.f6467i0 = bVar.f6467i0;
            this.f6469j0 = bVar.f6469j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f6564I2);
            this.f6452b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                int i8 = f6423k0.get(index);
                if (i8 == 80) {
                    this.f6465h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f6465h0);
                } else if (i8 != 81) {
                    switch (i8) {
                        case 1:
                            this.f6475p = d.n(typedArrayObtainStyledAttributes, index, this.f6475p);
                            break;
                        case 2:
                            this.f6430G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6430G);
                            break;
                        case 3:
                            this.f6474o = d.n(typedArrayObtainStyledAttributes, index, this.f6474o);
                            break;
                        case 4:
                            this.f6473n = d.n(typedArrayObtainStyledAttributes, index, this.f6473n);
                            break;
                        case 5:
                            this.f6482w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f6424A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6424A);
                            break;
                        case 7:
                            this.f6425B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6425B);
                            break;
                        case 8:
                            this.f6431H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6431H);
                            break;
                        case ConnectionResult.SERVICE_INVALID /* 9 */:
                            this.f6479t = d.n(typedArrayObtainStyledAttributes, index, this.f6479t);
                            break;
                        case 10:
                            this.f6478s = d.n(typedArrayObtainStyledAttributes, index, this.f6478s);
                            break;
                        case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                            this.f6436M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6436M);
                            break;
                        case 12:
                            this.f6437N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6437N);
                            break;
                        case 13:
                            this.f6433J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6433J);
                            break;
                        case 14:
                            this.f6435L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6435L);
                            break;
                        case 15:
                            this.f6438O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6438O);
                            break;
                        case 16:
                            this.f6434K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6434K);
                            break;
                        case 17:
                            this.f6458e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6458e);
                            break;
                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                            this.f6460f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f6460f);
                            break;
                        case 19:
                            this.f6462g = typedArrayObtainStyledAttributes.getFloat(index, this.f6462g);
                            break;
                        case 20:
                            this.f6480u = typedArrayObtainStyledAttributes.getFloat(index, this.f6480u);
                            break;
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            this.f6456d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f6456d);
                            break;
                        case 22:
                            this.f6454c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f6454c);
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            this.f6427D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6427D);
                            break;
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                            this.f6464h = d.n(typedArrayObtainStyledAttributes, index, this.f6464h);
                            break;
                        case 25:
                            this.f6466i = d.n(typedArrayObtainStyledAttributes, index, this.f6466i);
                            break;
                        case 26:
                            this.f6426C = typedArrayObtainStyledAttributes.getInt(index, this.f6426C);
                            break;
                        case 27:
                            this.f6428E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6428E);
                            break;
                        case 28:
                            this.f6468j = d.n(typedArrayObtainStyledAttributes, index, this.f6468j);
                            break;
                        case 29:
                            this.f6470k = d.n(typedArrayObtainStyledAttributes, index, this.f6470k);
                            break;
                        case 30:
                            this.f6432I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6432I);
                            break;
                        case 31:
                            this.f6476q = d.n(typedArrayObtainStyledAttributes, index, this.f6476q);
                            break;
                        case 32:
                            this.f6477r = d.n(typedArrayObtainStyledAttributes, index, this.f6477r);
                            break;
                        case 33:
                            this.f6429F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6429F);
                            break;
                        case 34:
                            this.f6472m = d.n(typedArrayObtainStyledAttributes, index, this.f6472m);
                            break;
                        case 35:
                            this.f6471l = d.n(typedArrayObtainStyledAttributes, index, this.f6471l);
                            break;
                        case 36:
                            this.f6481v = typedArrayObtainStyledAttributes.getFloat(index, this.f6481v);
                            break;
                        case 37:
                            this.f6440Q = typedArrayObtainStyledAttributes.getFloat(index, this.f6440Q);
                            break;
                        case 38:
                            this.f6439P = typedArrayObtainStyledAttributes.getFloat(index, this.f6439P);
                            break;
                        case 39:
                            this.f6441R = typedArrayObtainStyledAttributes.getInt(index, this.f6441R);
                            break;
                        case 40:
                            this.f6442S = typedArrayObtainStyledAttributes.getInt(index, this.f6442S);
                            break;
                        default:
                            switch (i8) {
                                case 54:
                                    this.f6443T = typedArrayObtainStyledAttributes.getInt(index, this.f6443T);
                                    break;
                                case 55:
                                    this.f6444U = typedArrayObtainStyledAttributes.getInt(index, this.f6444U);
                                    break;
                                case 56:
                                    this.f6445V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6445V);
                                    break;
                                case 57:
                                    this.f6446W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6446W);
                                    break;
                                case 58:
                                    this.f6447X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6447X);
                                    break;
                                case 59:
                                    this.f6448Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6448Y);
                                    break;
                                default:
                                    switch (i8) {
                                        case 61:
                                            this.f6483x = d.n(typedArrayObtainStyledAttributes, index, this.f6483x);
                                            break;
                                        case 62:
                                            this.f6484y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6484y);
                                            break;
                                        case 63:
                                            this.f6485z = typedArrayObtainStyledAttributes.getFloat(index, this.f6485z);
                                            break;
                                        default:
                                            switch (i8) {
                                                case 69:
                                                    this.f6449Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f6451a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f6453b0 = typedArrayObtainStyledAttributes.getInt(index, this.f6453b0);
                                                    continue;
                                                case 73:
                                                    this.f6455c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f6455c0);
                                                    continue;
                                                case 74:
                                                    this.f6461f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f6469j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f6469j0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f6463g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(f6423k0.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f6467i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f6467i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static SparseIntArray f6486h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6487a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6488b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f6489c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6490d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6491e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f6492f = Float.NaN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f6493g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6486h = sparseIntArray;
            sparseIntArray.append(g.f6648W3, 1);
            f6486h.append(g.f6658Y3, 2);
            f6486h.append(g.f6663Z3, 3);
            f6486h.append(g.f6643V3, 4);
            f6486h.append(g.f6637U3, 5);
            f6486h.append(g.f6653X3, 6);
        }

        public void a(c cVar) {
            this.f6487a = cVar.f6487a;
            this.f6488b = cVar.f6488b;
            this.f6489c = cVar.f6489c;
            this.f6490d = cVar.f6490d;
            this.f6491e = cVar.f6491e;
            this.f6493g = cVar.f6493g;
            this.f6492f = cVar.f6492f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f6631T3);
            this.f6487a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                switch (f6486h.get(index)) {
                    case 1:
                        this.f6493g = typedArrayObtainStyledAttributes.getFloat(index, this.f6493g);
                        break;
                    case 2:
                        this.f6490d = typedArrayObtainStyledAttributes.getInt(index, this.f6490d);
                        break;
                    case 3:
                        this.f6489c = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : C1931a.f21445c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f6491e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f6488b = d.n(typedArrayObtainStyledAttributes, index, this.f6488b);
                        break;
                    case 6:
                        this.f6492f = typedArrayObtainStyledAttributes.getFloat(index, this.f6492f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0129d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6494a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6495b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6496c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f6497d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f6498e = Float.NaN;

        public void a(C0129d c0129d) {
            this.f6494a = c0129d.f6494a;
            this.f6495b = c0129d.f6495b;
            this.f6497d = c0129d.f6497d;
            this.f6498e = c0129d.f6498e;
            this.f6496c = c0129d.f6496c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f6717i4);
            this.f6494a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == g.f6729k4) {
                    this.f6497d = typedArrayObtainStyledAttributes.getFloat(index, this.f6497d);
                } else if (index == g.f6723j4) {
                    this.f6495b = typedArrayObtainStyledAttributes.getInt(index, this.f6495b);
                    this.f6495b = d.f6412d[this.f6495b];
                } else if (index == g.f6741m4) {
                    this.f6496c = typedArrayObtainStyledAttributes.getInt(index, this.f6496c);
                } else if (index == g.f6735l4) {
                    this.f6498e = typedArrayObtainStyledAttributes.getFloat(index, this.f6498e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SparseIntArray f6499n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6500a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f6501b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f6502c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f6503d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f6504e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f6505f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f6506g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f6507h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f6508i = 0.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f6509j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f6510k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f6511l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f6512m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f6499n = sparseIntArray;
            sparseIntArray.append(g.f6554G4, 1);
            f6499n.append(g.f6560H4, 2);
            f6499n.append(g.f6566I4, 3);
            f6499n.append(g.f6542E4, 4);
            f6499n.append(g.f6548F4, 5);
            f6499n.append(g.f6518A4, 6);
            f6499n.append(g.f6524B4, 7);
            f6499n.append(g.f6530C4, 8);
            f6499n.append(g.f6536D4, 9);
            f6499n.append(g.f6572J4, 10);
            f6499n.append(g.f6578K4, 11);
        }

        public void a(e eVar) {
            this.f6500a = eVar.f6500a;
            this.f6501b = eVar.f6501b;
            this.f6502c = eVar.f6502c;
            this.f6503d = eVar.f6503d;
            this.f6504e = eVar.f6504e;
            this.f6505f = eVar.f6505f;
            this.f6506g = eVar.f6506g;
            this.f6507h = eVar.f6507h;
            this.f6508i = eVar.f6508i;
            this.f6509j = eVar.f6509j;
            this.f6510k = eVar.f6510k;
            this.f6511l = eVar.f6511l;
            this.f6512m = eVar.f6512m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f6819z4);
            this.f6500a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                switch (f6499n.get(index)) {
                    case 1:
                        this.f6501b = typedArrayObtainStyledAttributes.getFloat(index, this.f6501b);
                        break;
                    case 2:
                        this.f6502c = typedArrayObtainStyledAttributes.getFloat(index, this.f6502c);
                        break;
                    case 3:
                        this.f6503d = typedArrayObtainStyledAttributes.getFloat(index, this.f6503d);
                        break;
                    case 4:
                        this.f6504e = typedArrayObtainStyledAttributes.getFloat(index, this.f6504e);
                        break;
                    case 5:
                        this.f6505f = typedArrayObtainStyledAttributes.getFloat(index, this.f6505f);
                        break;
                    case 6:
                        this.f6506g = typedArrayObtainStyledAttributes.getDimension(index, this.f6506g);
                        break;
                    case 7:
                        this.f6507h = typedArrayObtainStyledAttributes.getDimension(index, this.f6507h);
                        break;
                    case 8:
                        this.f6508i = typedArrayObtainStyledAttributes.getDimension(index, this.f6508i);
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        this.f6509j = typedArrayObtainStyledAttributes.getDimension(index, this.f6509j);
                        break;
                    case 10:
                        this.f6510k = typedArrayObtainStyledAttributes.getDimension(index, this.f6510k);
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        this.f6511l = true;
                        this.f6512m = typedArrayObtainStyledAttributes.getDimension(index, this.f6512m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f6413e = sparseIntArray;
        sparseIntArray.append(g.f6785u0, 25);
        f6413e.append(g.f6791v0, 26);
        f6413e.append(g.f6803x0, 29);
        f6413e.append(g.f6809y0, 30);
        f6413e.append(g.f6538E0, 36);
        f6413e.append(g.f6532D0, 35);
        f6413e.append(g.f6677c0, 4);
        f6413e.append(g.f6671b0, 3);
        f6413e.append(g.f6659Z, 1);
        f6413e.append(g.f6586M0, 6);
        f6413e.append(g.f6592N0, 7);
        f6413e.append(g.f6719j0, 17);
        f6413e.append(g.f6725k0, 18);
        f6413e.append(g.f6731l0, 19);
        f6413e.append(g.f6772s, 27);
        f6413e.append(g.f6815z0, 32);
        f6413e.append(g.f6514A0, 33);
        f6413e.append(g.f6713i0, 10);
        f6413e.append(g.f6707h0, 9);
        f6413e.append(g.f6610Q0, 13);
        f6413e.append(g.f6628T0, 16);
        f6413e.append(g.f6616R0, 14);
        f6413e.append(g.f6598O0, 11);
        f6413e.append(g.f6622S0, 15);
        f6413e.append(g.f6604P0, 12);
        f6413e.append(g.f6556H0, 40);
        f6413e.append(g.f6773s0, 39);
        f6413e.append(g.f6767r0, 41);
        f6413e.append(g.f6550G0, 42);
        f6413e.append(g.f6761q0, 20);
        f6413e.append(g.f6544F0, 37);
        f6413e.append(g.f6701g0, 5);
        f6413e.append(g.f6779t0, 82);
        f6413e.append(g.f6526C0, 82);
        f6413e.append(g.f6797w0, 82);
        f6413e.append(g.f6665a0, 82);
        f6413e.append(g.f6654Y, 82);
        f6413e.append(g.f6802x, 24);
        f6413e.append(g.f6814z, 28);
        f6413e.append(g.f6579L, 31);
        f6413e.append(g.f6585M, 8);
        f6413e.append(g.f6808y, 34);
        f6413e.append(g.f6513A, 2);
        f6413e.append(g.f6790v, 23);
        f6413e.append(g.f6796w, 21);
        f6413e.append(g.f6784u, 22);
        f6413e.append(g.f6519B, 43);
        f6413e.append(g.f6597O, 44);
        f6413e.append(g.f6567J, 45);
        f6413e.append(g.f6573K, 46);
        f6413e.append(g.f6561I, 60);
        f6413e.append(g.f6549G, 47);
        f6413e.append(g.f6555H, 48);
        f6413e.append(g.f6525C, 49);
        f6413e.append(g.f6531D, 50);
        f6413e.append(g.f6537E, 51);
        f6413e.append(g.f6543F, 52);
        f6413e.append(g.f6591N, 53);
        f6413e.append(g.f6562I0, 54);
        f6413e.append(g.f6737m0, 55);
        f6413e.append(g.f6568J0, 56);
        f6413e.append(g.f6743n0, 57);
        f6413e.append(g.f6574K0, 58);
        f6413e.append(g.f6749o0, 59);
        f6413e.append(g.f6683d0, 61);
        f6413e.append(g.f6695f0, 62);
        f6413e.append(g.f6689e0, 63);
        f6413e.append(g.f6603P, 64);
        f6413e.append(g.f6650X0, 65);
        f6413e.append(g.f6639V, 66);
        f6413e.append(g.f6655Y0, 67);
        f6413e.append(g.f6640V0, 79);
        f6413e.append(g.f6778t, 38);
        f6413e.append(g.f6634U0, 68);
        f6413e.append(g.f6580L0, 69);
        f6413e.append(g.f6755p0, 70);
        f6413e.append(g.f6627T, 71);
        f6413e.append(g.f6615R, 72);
        f6413e.append(g.f6621S, 73);
        f6413e.append(g.f6633U, 74);
        f6413e.append(g.f6609Q, 75);
        f6413e.append(g.f6645W0, 76);
        f6413e.append(g.f6520B0, 77);
        f6413e.append(g.f6660Z0, 78);
        f6413e.append(g.f6649X, 80);
        f6413e.append(g.f6644W, 81);
    }

    private int[] i(View view, String str) {
        int iIntValue;
        Object objF;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i7 = 0;
        int i8 = 0;
        while (i7 < strArrSplit.length) {
            String strTrim = strArrSplit[i7].trim();
            try {
                iIntValue = f.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objF = ((ConstraintLayout) view.getParent()).f(0, strTrim)) != null && (objF instanceof Integer)) {
                iIntValue = ((Integer) objF).intValue();
            }
            iArr[i8] = iIntValue;
            i7++;
            i8++;
        }
        return i8 != strArrSplit.length ? Arrays.copyOf(iArr, i8) : iArr;
    }

    private a j(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f6766r);
        o(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a k(int i7) {
        if (!this.f6416c.containsKey(Integer.valueOf(i7))) {
            this.f6416c.put(Integer.valueOf(i7), new a());
        }
        return (a) this.f6416c.get(Integer.valueOf(i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(TypedArray typedArray, int i7, int i8) {
        int resourceId = typedArray.getResourceId(i7, i8);
        return resourceId == -1 ? typedArray.getInt(i7, -1) : resourceId;
    }

    private void o(Context context, a aVar, TypedArray typedArray) {
        c cVar;
        String string;
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArray.getIndex(i7);
            if (index != g.f6778t && g.f6579L != index && g.f6585M != index) {
                aVar.f6419c.f6487a = true;
                aVar.f6420d.f6452b = true;
                aVar.f6418b.f6494a = true;
                aVar.f6421e.f6500a = true;
            }
            switch (f6413e.get(index)) {
                case 1:
                    b bVar = aVar.f6420d;
                    bVar.f6475p = n(typedArray, index, bVar.f6475p);
                    continue;
                    break;
                case 2:
                    b bVar2 = aVar.f6420d;
                    bVar2.f6430G = typedArray.getDimensionPixelSize(index, bVar2.f6430G);
                    continue;
                    break;
                case 3:
                    b bVar3 = aVar.f6420d;
                    bVar3.f6474o = n(typedArray, index, bVar3.f6474o);
                    continue;
                    break;
                case 4:
                    b bVar4 = aVar.f6420d;
                    bVar4.f6473n = n(typedArray, index, bVar4.f6473n);
                    continue;
                    break;
                case 5:
                    aVar.f6420d.f6482w = typedArray.getString(index);
                    continue;
                    break;
                case 6:
                    b bVar5 = aVar.f6420d;
                    bVar5.f6424A = typedArray.getDimensionPixelOffset(index, bVar5.f6424A);
                    continue;
                    break;
                case 7:
                    b bVar6 = aVar.f6420d;
                    bVar6.f6425B = typedArray.getDimensionPixelOffset(index, bVar6.f6425B);
                    continue;
                    break;
                case 8:
                    b bVar7 = aVar.f6420d;
                    bVar7.f6431H = typedArray.getDimensionPixelSize(index, bVar7.f6431H);
                    continue;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    b bVar8 = aVar.f6420d;
                    bVar8.f6479t = n(typedArray, index, bVar8.f6479t);
                    continue;
                    break;
                case 10:
                    b bVar9 = aVar.f6420d;
                    bVar9.f6478s = n(typedArray, index, bVar9.f6478s);
                    continue;
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    b bVar10 = aVar.f6420d;
                    bVar10.f6436M = typedArray.getDimensionPixelSize(index, bVar10.f6436M);
                    continue;
                    break;
                case 12:
                    b bVar11 = aVar.f6420d;
                    bVar11.f6437N = typedArray.getDimensionPixelSize(index, bVar11.f6437N);
                    continue;
                    break;
                case 13:
                    b bVar12 = aVar.f6420d;
                    bVar12.f6433J = typedArray.getDimensionPixelSize(index, bVar12.f6433J);
                    continue;
                    break;
                case 14:
                    b bVar13 = aVar.f6420d;
                    bVar13.f6435L = typedArray.getDimensionPixelSize(index, bVar13.f6435L);
                    continue;
                    break;
                case 15:
                    b bVar14 = aVar.f6420d;
                    bVar14.f6438O = typedArray.getDimensionPixelSize(index, bVar14.f6438O);
                    continue;
                    break;
                case 16:
                    b bVar15 = aVar.f6420d;
                    bVar15.f6434K = typedArray.getDimensionPixelSize(index, bVar15.f6434K);
                    continue;
                    break;
                case 17:
                    b bVar16 = aVar.f6420d;
                    bVar16.f6458e = typedArray.getDimensionPixelOffset(index, bVar16.f6458e);
                    continue;
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    b bVar17 = aVar.f6420d;
                    bVar17.f6460f = typedArray.getDimensionPixelOffset(index, bVar17.f6460f);
                    continue;
                    break;
                case 19:
                    b bVar18 = aVar.f6420d;
                    bVar18.f6462g = typedArray.getFloat(index, bVar18.f6462g);
                    continue;
                    break;
                case 20:
                    b bVar19 = aVar.f6420d;
                    bVar19.f6480u = typedArray.getFloat(index, bVar19.f6480u);
                    continue;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    b bVar20 = aVar.f6420d;
                    bVar20.f6456d = typedArray.getLayoutDimension(index, bVar20.f6456d);
                    continue;
                    break;
                case 22:
                    C0129d c0129d = aVar.f6418b;
                    c0129d.f6495b = typedArray.getInt(index, c0129d.f6495b);
                    C0129d c0129d2 = aVar.f6418b;
                    c0129d2.f6495b = f6412d[c0129d2.f6495b];
                    continue;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    b bVar21 = aVar.f6420d;
                    bVar21.f6454c = typedArray.getLayoutDimension(index, bVar21.f6454c);
                    continue;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    b bVar22 = aVar.f6420d;
                    bVar22.f6427D = typedArray.getDimensionPixelSize(index, bVar22.f6427D);
                    continue;
                    break;
                case 25:
                    b bVar23 = aVar.f6420d;
                    bVar23.f6464h = n(typedArray, index, bVar23.f6464h);
                    continue;
                    break;
                case 26:
                    b bVar24 = aVar.f6420d;
                    bVar24.f6466i = n(typedArray, index, bVar24.f6466i);
                    continue;
                    break;
                case 27:
                    b bVar25 = aVar.f6420d;
                    bVar25.f6426C = typedArray.getInt(index, bVar25.f6426C);
                    continue;
                    break;
                case 28:
                    b bVar26 = aVar.f6420d;
                    bVar26.f6428E = typedArray.getDimensionPixelSize(index, bVar26.f6428E);
                    continue;
                    break;
                case 29:
                    b bVar27 = aVar.f6420d;
                    bVar27.f6468j = n(typedArray, index, bVar27.f6468j);
                    continue;
                    break;
                case 30:
                    b bVar28 = aVar.f6420d;
                    bVar28.f6470k = n(typedArray, index, bVar28.f6470k);
                    continue;
                    break;
                case 31:
                    b bVar29 = aVar.f6420d;
                    bVar29.f6432I = typedArray.getDimensionPixelSize(index, bVar29.f6432I);
                    continue;
                    break;
                case 32:
                    b bVar30 = aVar.f6420d;
                    bVar30.f6476q = n(typedArray, index, bVar30.f6476q);
                    continue;
                    break;
                case 33:
                    b bVar31 = aVar.f6420d;
                    bVar31.f6477r = n(typedArray, index, bVar31.f6477r);
                    continue;
                    break;
                case 34:
                    b bVar32 = aVar.f6420d;
                    bVar32.f6429F = typedArray.getDimensionPixelSize(index, bVar32.f6429F);
                    continue;
                    break;
                case 35:
                    b bVar33 = aVar.f6420d;
                    bVar33.f6472m = n(typedArray, index, bVar33.f6472m);
                    continue;
                    break;
                case 36:
                    b bVar34 = aVar.f6420d;
                    bVar34.f6471l = n(typedArray, index, bVar34.f6471l);
                    continue;
                    break;
                case 37:
                    b bVar35 = aVar.f6420d;
                    bVar35.f6481v = typedArray.getFloat(index, bVar35.f6481v);
                    continue;
                    break;
                case 38:
                    aVar.f6417a = typedArray.getResourceId(index, aVar.f6417a);
                    continue;
                    break;
                case 39:
                    b bVar36 = aVar.f6420d;
                    bVar36.f6440Q = typedArray.getFloat(index, bVar36.f6440Q);
                    continue;
                    break;
                case 40:
                    b bVar37 = aVar.f6420d;
                    bVar37.f6439P = typedArray.getFloat(index, bVar37.f6439P);
                    continue;
                    break;
                case 41:
                    b bVar38 = aVar.f6420d;
                    bVar38.f6441R = typedArray.getInt(index, bVar38.f6441R);
                    continue;
                    break;
                case 42:
                    b bVar39 = aVar.f6420d;
                    bVar39.f6442S = typedArray.getInt(index, bVar39.f6442S);
                    continue;
                    break;
                case 43:
                    C0129d c0129d3 = aVar.f6418b;
                    c0129d3.f6497d = typedArray.getFloat(index, c0129d3.f6497d);
                    continue;
                    break;
                case 44:
                    e eVar = aVar.f6421e;
                    eVar.f6511l = true;
                    eVar.f6512m = typedArray.getDimension(index, eVar.f6512m);
                    continue;
                    break;
                case 45:
                    e eVar2 = aVar.f6421e;
                    eVar2.f6502c = typedArray.getFloat(index, eVar2.f6502c);
                    continue;
                    break;
                case 46:
                    e eVar3 = aVar.f6421e;
                    eVar3.f6503d = typedArray.getFloat(index, eVar3.f6503d);
                    continue;
                    break;
                case 47:
                    e eVar4 = aVar.f6421e;
                    eVar4.f6504e = typedArray.getFloat(index, eVar4.f6504e);
                    continue;
                    break;
                case 48:
                    e eVar5 = aVar.f6421e;
                    eVar5.f6505f = typedArray.getFloat(index, eVar5.f6505f);
                    continue;
                    break;
                case 49:
                    e eVar6 = aVar.f6421e;
                    eVar6.f6506g = typedArray.getDimension(index, eVar6.f6506g);
                    continue;
                    break;
                case 50:
                    e eVar7 = aVar.f6421e;
                    eVar7.f6507h = typedArray.getDimension(index, eVar7.f6507h);
                    continue;
                    break;
                case 51:
                    e eVar8 = aVar.f6421e;
                    eVar8.f6508i = typedArray.getDimension(index, eVar8.f6508i);
                    continue;
                    break;
                case 52:
                    e eVar9 = aVar.f6421e;
                    eVar9.f6509j = typedArray.getDimension(index, eVar9.f6509j);
                    continue;
                    break;
                case 53:
                    e eVar10 = aVar.f6421e;
                    eVar10.f6510k = typedArray.getDimension(index, eVar10.f6510k);
                    continue;
                    break;
                case 54:
                    b bVar40 = aVar.f6420d;
                    bVar40.f6443T = typedArray.getInt(index, bVar40.f6443T);
                    continue;
                    break;
                case 55:
                    b bVar41 = aVar.f6420d;
                    bVar41.f6444U = typedArray.getInt(index, bVar41.f6444U);
                    continue;
                    break;
                case 56:
                    b bVar42 = aVar.f6420d;
                    bVar42.f6445V = typedArray.getDimensionPixelSize(index, bVar42.f6445V);
                    continue;
                    break;
                case 57:
                    b bVar43 = aVar.f6420d;
                    bVar43.f6446W = typedArray.getDimensionPixelSize(index, bVar43.f6446W);
                    continue;
                    break;
                case 58:
                    b bVar44 = aVar.f6420d;
                    bVar44.f6447X = typedArray.getDimensionPixelSize(index, bVar44.f6447X);
                    continue;
                    break;
                case 59:
                    b bVar45 = aVar.f6420d;
                    bVar45.f6448Y = typedArray.getDimensionPixelSize(index, bVar45.f6448Y);
                    continue;
                    break;
                case 60:
                    e eVar11 = aVar.f6421e;
                    eVar11.f6501b = typedArray.getFloat(index, eVar11.f6501b);
                    continue;
                    break;
                case 61:
                    b bVar46 = aVar.f6420d;
                    bVar46.f6483x = n(typedArray, index, bVar46.f6483x);
                    continue;
                    break;
                case 62:
                    b bVar47 = aVar.f6420d;
                    bVar47.f6484y = typedArray.getDimensionPixelSize(index, bVar47.f6484y);
                    continue;
                    break;
                case 63:
                    b bVar48 = aVar.f6420d;
                    bVar48.f6485z = typedArray.getFloat(index, bVar48.f6485z);
                    continue;
                    break;
                case 64:
                    c cVar2 = aVar.f6419c;
                    cVar2.f6488b = n(typedArray, index, cVar2.f6488b);
                    continue;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f6419c;
                        string = typedArray.getString(index);
                    } else {
                        cVar = aVar.f6419c;
                        string = C1931a.f21445c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f6489c = string;
                    continue;
                    break;
                case 66:
                    aVar.f6419c.f6491e = typedArray.getInt(index, 0);
                    continue;
                    break;
                case 67:
                    c cVar3 = aVar.f6419c;
                    cVar3.f6493g = typedArray.getFloat(index, cVar3.f6493g);
                    continue;
                    break;
                case 68:
                    C0129d c0129d4 = aVar.f6418b;
                    c0129d4.f6498e = typedArray.getFloat(index, c0129d4.f6498e);
                    continue;
                    break;
                case 69:
                    aVar.f6420d.f6449Z = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 70:
                    aVar.f6420d.f6451a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                    break;
                case 72:
                    b bVar49 = aVar.f6420d;
                    bVar49.f6453b0 = typedArray.getInt(index, bVar49.f6453b0);
                    continue;
                    break;
                case 73:
                    b bVar50 = aVar.f6420d;
                    bVar50.f6455c0 = typedArray.getDimensionPixelSize(index, bVar50.f6455c0);
                    continue;
                    break;
                case 74:
                    aVar.f6420d.f6461f0 = typedArray.getString(index);
                    continue;
                    break;
                case 75:
                    b bVar51 = aVar.f6420d;
                    bVar51.f6469j0 = typedArray.getBoolean(index, bVar51.f6469j0);
                    continue;
                    break;
                case 76:
                    c cVar4 = aVar.f6419c;
                    cVar4.f6490d = typedArray.getInt(index, cVar4.f6490d);
                    continue;
                    break;
                case 77:
                    aVar.f6420d.f6463g0 = typedArray.getString(index);
                    continue;
                    break;
                case 78:
                    C0129d c0129d5 = aVar.f6418b;
                    c0129d5.f6496c = typedArray.getInt(index, c0129d5.f6496c);
                    continue;
                    break;
                case 79:
                    c cVar5 = aVar.f6419c;
                    cVar5.f6492f = typedArray.getFloat(index, cVar5.f6492f);
                    continue;
                    break;
                case 80:
                    b bVar52 = aVar.f6420d;
                    bVar52.f6465h0 = typedArray.getBoolean(index, bVar52.f6465h0);
                    continue;
                    break;
                case 81:
                    b bVar53 = aVar.f6420d;
                    bVar53.f6467i0 = typedArray.getBoolean(index, bVar53.f6467i0);
                    continue;
                    break;
                case 82:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f6413e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z6) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f6416c.keySet());
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            int id = childAt.getId();
            if (!this.f6416c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + AbstractC1957a.a(childAt));
            } else {
                if (this.f6415b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f6416c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f6416c.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f6420d.f6457d0 = 1;
                        }
                        int i8 = aVar.f6420d.f6457d0;
                        if (i8 != -1 && i8 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f6420d.f6453b0);
                            barrier.setMargin(aVar.f6420d.f6455c0);
                            barrier.setAllowsGoneWidget(aVar.f6420d.f6469j0);
                            b bVar = aVar.f6420d;
                            int[] iArr = bVar.f6459e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f6461f0;
                                if (str != null) {
                                    bVar.f6459e0 = i(barrier, str);
                                    barrier.setReferencedIds(aVar.f6420d.f6459e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z6) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f6422f);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0129d c0129d = aVar.f6418b;
                        if (c0129d.f6496c == 0) {
                            childAt.setVisibility(c0129d.f6495b);
                        }
                        childAt.setAlpha(aVar.f6418b.f6497d);
                        childAt.setRotation(aVar.f6421e.f6501b);
                        childAt.setRotationX(aVar.f6421e.f6502c);
                        childAt.setRotationY(aVar.f6421e.f6503d);
                        childAt.setScaleX(aVar.f6421e.f6504e);
                        childAt.setScaleY(aVar.f6421e.f6505f);
                        if (!Float.isNaN(aVar.f6421e.f6506g)) {
                            childAt.setPivotX(aVar.f6421e.f6506g);
                        }
                        if (!Float.isNaN(aVar.f6421e.f6507h)) {
                            childAt.setPivotY(aVar.f6421e.f6507h);
                        }
                        childAt.setTranslationX(aVar.f6421e.f6508i);
                        childAt.setTranslationY(aVar.f6421e.f6509j);
                        childAt.setTranslationZ(aVar.f6421e.f6510k);
                        e eVar = aVar.f6421e;
                        if (eVar.f6511l) {
                            childAt.setElevation(eVar.f6512m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = (a) this.f6416c.get(num);
            int i9 = aVar2.f6420d.f6457d0;
            if (i9 != -1 && i9 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f6420d;
                int[] iArr2 = bVar3.f6459e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f6461f0;
                    if (str2 != null) {
                        bVar3.f6459e0 = i(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f6420d.f6459e0);
                    }
                }
                barrier2.setType(aVar2.f6420d.f6453b0);
                barrier2.setMargin(aVar2.f6420d.f6455c0);
                ConstraintLayout.b bVarD = constraintLayout.generateDefaultLayoutParams();
                barrier2.k();
                aVar2.b(bVarD);
                constraintLayout.addView(barrier2, bVarD);
            }
            if (aVar2.f6420d.f6450a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b bVarD2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.b(bVarD2);
                constraintLayout.addView(guideline, bVarD2);
            }
        }
    }

    public void e(int i7, int i8) {
        if (this.f6416c.containsKey(Integer.valueOf(i7))) {
            a aVar = (a) this.f6416c.get(Integer.valueOf(i7));
            switch (i8) {
                case 1:
                    b bVar = aVar.f6420d;
                    bVar.f6466i = -1;
                    bVar.f6464h = -1;
                    bVar.f6427D = -1;
                    bVar.f6433J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f6420d;
                    bVar2.f6470k = -1;
                    bVar2.f6468j = -1;
                    bVar2.f6428E = -1;
                    bVar2.f6435L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f6420d;
                    bVar3.f6472m = -1;
                    bVar3.f6471l = -1;
                    bVar3.f6429F = -1;
                    bVar3.f6434K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f6420d;
                    bVar4.f6473n = -1;
                    bVar4.f6474o = -1;
                    bVar4.f6430G = -1;
                    bVar4.f6436M = -1;
                    return;
                case 5:
                    aVar.f6420d.f6475p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f6420d;
                    bVar5.f6476q = -1;
                    bVar5.f6477r = -1;
                    bVar5.f6432I = -1;
                    bVar5.f6438O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f6420d;
                    bVar6.f6478s = -1;
                    bVar6.f6479t = -1;
                    bVar6.f6431H = -1;
                    bVar6.f6437N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void f(Context context, int i7) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i7, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f6416c.clear();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f6415b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f6416c.containsKey(Integer.valueOf(id))) {
                this.f6416c.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f6416c.get(Integer.valueOf(id));
            aVar.f6422f = androidx.constraintlayout.widget.a.a(this.f6414a, childAt);
            aVar.d(id, bVar);
            aVar.f6418b.f6495b = childAt.getVisibility();
            aVar.f6418b.f6497d = childAt.getAlpha();
            aVar.f6421e.f6501b = childAt.getRotation();
            aVar.f6421e.f6502c = childAt.getRotationX();
            aVar.f6421e.f6503d = childAt.getRotationY();
            aVar.f6421e.f6504e = childAt.getScaleX();
            aVar.f6421e.f6505f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f6421e;
                eVar.f6506g = pivotX;
                eVar.f6507h = pivotY;
            }
            aVar.f6421e.f6508i = childAt.getTranslationX();
            aVar.f6421e.f6509j = childAt.getTranslationY();
            aVar.f6421e.f6510k = childAt.getTranslationZ();
            e eVar2 = aVar.f6421e;
            if (eVar2.f6511l) {
                eVar2.f6512m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f6420d.f6469j0 = barrier.l();
                aVar.f6420d.f6459e0 = barrier.getReferencedIds();
                aVar.f6420d.f6453b0 = barrier.getType();
                aVar.f6420d.f6455c0 = barrier.getMargin();
            }
        }
    }

    public void h(int i7, int i8, int i9, float f7) {
        b bVar = k(i7).f6420d;
        bVar.f6483x = i8;
        bVar.f6484y = i9;
        bVar.f6485z = f7;
    }

    public void l(Context context, int i7) {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarJ = j(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarJ.f6420d.f6450a = true;
                    }
                    this.f6416c.put(Integer.valueOf(aVarJ.f6417a), aVarJ);
                }
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017d, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarJ = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    byte b7 = 3;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                b7 = !name.equals("Layout") ? (byte) -1 : (byte) 5;
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    b7 = 6;
                                    break;
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    break;
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    b7 = 4;
                                    break;
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    b7 = 1;
                                    break;
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    b7 = 2;
                                    break;
                                }
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    b7 = 7;
                                    break;
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    b7 = 0;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        switch (b7) {
                            case 0:
                                aVarJ = j(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case 1:
                                aVarJ = j(context, Xml.asAttributeSet(xmlPullParser));
                                b bVar = aVarJ.f6420d;
                                bVar.f6450a = true;
                                bVar.f6452b = true;
                                break;
                            case 2:
                                aVarJ = j(context, Xml.asAttributeSet(xmlPullParser));
                                aVarJ.f6420d.f6457d0 = 1;
                                break;
                            case 3:
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarJ.f6418b.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case 4:
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarJ.f6421e.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case 5:
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarJ.f6420d.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case 6:
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarJ.f6419c.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case 7:
                                if (aVarJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                androidx.constraintlayout.widget.a.b(context, xmlPullParser, aVarJ.f6422f);
                                break;
                                break;
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        String name2 = xmlPullParser.getName();
                        if ("ConstraintSet".equals(name2)) {
                            return;
                        }
                        if (name2.equalsIgnoreCase("Constraint")) {
                            this.f6416c.put(Integer.valueOf(aVarJ.f6417a), aVarJ);
                            aVarJ = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        } catch (XmlPullParserException e8) {
            e8.printStackTrace();
        }
    }
}
