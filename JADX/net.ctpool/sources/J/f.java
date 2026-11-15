package J;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f1547a;

    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f1548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f1549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1550c = true;

        a(TextView textView) {
            this.f1548a = textView;
            this.f1549b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f1549b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f1549b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof d) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i7 = 0;
            for (int i8 = 0; i8 < length; i8++) {
                if (sparseArrayG.indexOfKey(i8) < 0) {
                    inputFilterArr2[i7] = inputFilterArr[i8];
                    i7++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f1548a.setFilters(a(this.f1548a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // J.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f1550c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // J.f.b
        public boolean b() {
            return this.f1550c;
        }

        @Override // J.f.b
        void c(boolean z6) {
            if (z6) {
                l();
            }
        }

        @Override // J.f.b
        void d(boolean z6) {
            this.f1550c = z6;
            l();
            k();
        }

        @Override // J.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f1550c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z6) {
            this.f1550c = z6;
        }

        void l() {
            this.f1548a.setTransformationMethod(e(this.f1548a.getTransformationMethod()));
        }
    }

    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        abstract void c(boolean z6);

        abstract void d(boolean z6);

        abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    private static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f1551a;

        c(TextView textView) {
            this.f1551a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.e.h();
        }

        @Override // J.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f1551a.a(inputFilterArr);
        }

        @Override // J.f.b
        public boolean b() {
            return this.f1551a.b();
        }

        @Override // J.f.b
        void c(boolean z6) {
            if (f()) {
                return;
            }
            this.f1551a.c(z6);
        }

        @Override // J.f.b
        void d(boolean z6) {
            if (f()) {
                this.f1551a.i(z6);
            } else {
                this.f1551a.d(z6);
            }
        }

        @Override // J.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f1551a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z6) {
        androidx.core.util.f.g(textView, "textView cannot be null");
        this.f1547a = !z6 ? new c(textView) : new a(textView);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f1547a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f1547a.b();
    }

    public void c(boolean z6) {
        this.f1547a.c(z6);
    }

    public void d(boolean z6) {
        this.f1547a.d(z6);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f1547a.e(transformationMethod);
    }
}
