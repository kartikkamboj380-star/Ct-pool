package S1;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class g implements SensorEventListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f2930j = TimeUnit.NANOSECONDS.convert(20, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f2931k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f2932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f2933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f2934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f2935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SensorManager f2936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f2937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f2939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f2940i;

    public interface a {
        void a();
    }

    static {
        f2931k = r0.convert(3L, TimeUnit.SECONDS);
    }

    public g(a aVar, int i7) {
        this.f2935d = aVar;
        this.f2940i = i7;
    }

    private boolean a(float f7) {
        return Math.abs(f7) > 13.042845f;
    }

    private void b(long j7) {
        if (this.f2938g >= this.f2940i * 8) {
            d();
            this.f2935d.a();
        }
        if (j7 - this.f2939h > f2931k) {
            d();
        }
    }

    private void c(long j7) {
        this.f2939h = j7;
        this.f2938g++;
    }

    private void d() {
        this.f2938g = 0;
        this.f2932a = 0.0f;
        this.f2933b = 0.0f;
        this.f2934c = 0.0f;
    }

    public void e(SensorManager sensorManager) {
        O1.a.c(sensorManager);
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        if (defaultSensor != null) {
            this.f2936e = sensorManager;
            this.f2937f = -1L;
            sensorManager.registerListener(this, defaultSensor, 2);
            this.f2939h = 0L;
            d();
        }
    }

    public void f() {
        SensorManager sensorManager = this.f2936e;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f2936e = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        long j7 = sensorEvent.timestamp;
        if (j7 - this.f2937f < f2930j) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[2] - 9.80665f;
        this.f2937f = j7;
        if (a(f7) && this.f2932a * f7 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f2932a = f7;
        } else if (a(f8) && this.f2933b * f8 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f2933b = f8;
        } else if (a(f9) && this.f2934c * f9 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f2934c = f9;
        }
        b(sensorEvent.timestamp);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
